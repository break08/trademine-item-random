package net.mcreator.trademineitemrandom.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

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
		this.imageWidth = 300;
		this.imageHeight = 225;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = new ResourceLocation("trademine_item_random:textures/screens/random_trader_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/plus.png"), this.leftPos + 139, this.topPos + 12, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/egg.png"), this.leftPos + 47, this.topPos + 34, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/plus.png"), this.leftPos + 91, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/rainbow_dye.png"), this.leftPos + 135, this.topPos + 34, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/arrow.png"), this.leftPos + 178, this.topPos + 33, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/axolotl_spawn_egg.png"), this.leftPos + 207, this.topPos + 26, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/bat_spawn_egg.png"), this.leftPos + 229, this.topPos + 26, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/bee_spawn_egg.png"), this.leftPos + 252, this.topPos + 26, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/blaze_spawn_egg.png"), this.leftPos + 272, this.topPos + 26, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/bogged_spawn_egg.png"), this.leftPos + 227, this.topPos + 41, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/blue_egg.png"), this.leftPos + 251, this.topPos + 40, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/for_gui.png"), this.leftPos + 240, this.topPos + 32, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/gold_ingot.png"), this.leftPos + 47, this.topPos + 58, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/plus.png"), this.leftPos + 91, this.topPos + 58, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/book.png"), this.leftPos + 135, this.topPos + 58, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/arrow.png"), this.leftPos + 178, this.topPos + 56, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/enchanted_book.png"), this.leftPos + 224, this.topPos + 56, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/enchanted_book.png"), this.leftPos + 214, this.topPos + 57, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/enchanted_book.png"), this.leftPos + 233, this.topPos + 58, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/for_gui.png"), this.leftPos + 229, this.topPos + 60, 0, 0, 8, 8, 8, 8);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/nether_wart.png"), this.leftPos + 47, this.topPos + 83, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/water_bucket.png"), this.leftPos + 135, this.topPos + 84, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/plus.png"), this.leftPos + 91, this.topPos + 85, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/arrow.png"), this.leftPos + 177, this.topPos + 84, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/potion.png"), this.leftPos + 210, this.topPos + 83, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/potion.png"), this.leftPos + 217, this.topPos + 83, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/potion.png"), this.leftPos + 224, this.topPos + 83, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(new ResourceLocation("trademine_item_random:textures/screens/for_gui.png"), this.leftPos + 221, this.topPos + 88, 0, 0, 8, 8, 8, 8);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.trademine_item_random.random_trader_gui.label_7"), 62, 66, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_receive_item = Button.builder(Component.translatable("gui.trademine_item_random.random_trader_gui.button_receive_item"), e -> {
			int x = RandomTraderGUIScreen.this.x;
			int y = RandomTraderGUIScreen.this.y;
			if (true) {
				PacketDistributor.SERVER.noArg().send(new RandomTraderGUIButtonMessage(0, x, y, z));
				RandomTraderGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 104, this.topPos + 113, 87, 20).build();
		this.addRenderableWidget(button_receive_item);
	}
}