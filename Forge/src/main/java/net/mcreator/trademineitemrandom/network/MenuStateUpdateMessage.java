package net.mcreator.trademineitemrandom.network;

import net.neoforged.neoforge.network.handling.PlayPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.client.Minecraft;

import net.mcreator.trademineitemrandom.init.TrademineItemRandomModScreens;
import net.mcreator.trademineitemrandom.init.TrademineItemRandomModMenus;
import net.mcreator.trademineitemrandom.TrademineItemRandomMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MenuStateUpdateMessage implements CustomPacketPayload {
	private final int elementType;
	private final String name;
	private final Object elementState;
	public static final ResourceLocation ID = new ResourceLocation(TrademineItemRandomMod.MODID, "guistate_update");

	public MenuStateUpdateMessage(int elementType, String name, Object elementState) {
		this.elementType = elementType;
		this.name = name;
		this.elementState = elementState;
	}

	public MenuStateUpdateMessage(FriendlyByteBuf buffer) {
		this.elementType = buffer.readInt();
		this.name = buffer.readUtf();
		Object elementState = null;
		if (elementType == 0) {
			elementState = buffer.readUtf();
		} else if (elementType == 1) {
			elementState = buffer.readBoolean();
		}
		this.elementState = elementState;
	}

	@Override
	public void write(final FriendlyByteBuf buffer) {
		buffer.writeInt(elementType);
		buffer.writeUtf(name);
		if (elementType == 0) {
			buffer.writeUtf((String) elementState);
		} else if (elementType == 1) {
			buffer.writeBoolean((boolean) elementState);
		}
	}

	@Override
	public ResourceLocation id() {
		return ID;
	}

	public static void handleMenuState(final MenuStateUpdateMessage message, final PlayPayloadContext context) {
		if (message.name.length() > 256 || message.elementState instanceof String string && string.length() > 8192)
			return;
		context.workHandler().submitAsync(() -> {
			if (context.player().get().containerMenu instanceof TrademineItemRandomModMenus.MenuAccessor menu) {
				menu.getMenuState().put(message.elementType + ":" + message.name, message.elementState);
				if (context.flow() == PacketFlow.CLIENTBOUND && Minecraft.getInstance().screen instanceof TrademineItemRandomModScreens.ScreenAccessor accessor) {
					accessor.updateMenuState(message.elementType, message.name, message.elementState);
				}
			}
		}).exceptionally(e -> {
			context.packetHandler().disconnect(Component.literal(e.getMessage()));
			return null;
		});
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		TrademineItemRandomMod.addNetworkMessage(MenuStateUpdateMessage.ID, MenuStateUpdateMessage::new, MenuStateUpdateMessage::handleMenuState);
	}
}