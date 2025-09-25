package net.mcreator.trademineitemrandom.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.trademineitemrandom.world.inventory.RandomTraderGUIMenu;
import net.mcreator.trademineitemrandom.network.RandomTraderGUIButtonMessage;
import net.mcreator.trademineitemrandom.init.TrademineItemRandomModScreens;
import net.mcreator.trademineitemrandom.TrademineItemRandomMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class RandomTraderGUIScreen extends AbstractContainerScreen<RandomTraderGUIMenu> implements TrademineItemRandomModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Button button_receive_item;

	public RandomTraderGUIScreen(RandomTraderGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 258;
		this.imageHeight = 172;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("trademine_item_random:textures/screens/random_trader_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.trademine_item_random.random_trader_gui.label_empty"), 122, 9, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.trademine_item_random.random_trader_gui.label_1_egg_1_rainbow_dye_1_random"), 20, 26, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.trademine_item_random.random_trader_gui.label_2_nether_wart_1_water_potion"), 3, 36, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.trademine_item_random.random_trader_gui.label_5_gold_ingot_1_book_1_random"), 3, 46, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_receive_item = Button.builder(Component.translatable("gui.trademine_item_random.random_trader_gui.button_receive_item"), e -> {
			int x = RandomTraderGUIScreen.this.x;
			int y = RandomTraderGUIScreen.this.y;
			if (true) {
				TrademineItemRandomMod.PACKET_HANDLER.sendToServer(new RandomTraderGUIButtonMessage(0, x, y, z));
				RandomTraderGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 80, this.topPos + 59, 87, 20).build();
		this.addRenderableWidget(button_receive_item);
	}
}