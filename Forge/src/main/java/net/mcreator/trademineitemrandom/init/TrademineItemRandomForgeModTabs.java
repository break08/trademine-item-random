/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trademineitemrandom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.trademineitemrandom.TrademineItemRandomForgeMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TrademineItemRandomForgeModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TrademineItemRandomForgeMod.MODID);
	public static final RegistryObject<CreativeModeTab> RANDOM = REGISTRY.register("random",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.trademine_item_random_forge.random")).icon(() -> new ItemStack(TrademineItemRandomForgeModItems.RAINBOW_DYE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TrademineItemRandomForgeModBlocks.ORE_OF_RANDOMNESS.get().asItem());
				tabData.accept(TrademineItemRandomForgeModItems.POTION_OF_RANDOM.get());
				tabData.accept(TrademineItemRandomForgeModBlocks.DEEPSLATE_ORE_OF_RANDOMNESS.get().asItem());
				tabData.accept(TrademineItemRandomForgeModBlocks.NETHER_ORE_OF_RANDOMNESS.get().asItem());
				tabData.accept(TrademineItemRandomForgeModBlocks.FLOWER_OF_RANDOMNESS.get().asItem());
				tabData.accept(TrademineItemRandomForgeModItems.RAINBOW_DYE.get());
				tabData.accept(TrademineItemRandomForgeModItems.RANDOM_SEED.get());
				tabData.accept(TrademineItemRandomForgeModItems.ANY_FOOD.get());
				tabData.accept(TrademineItemRandomForgeModItems.ANY_ARMOR_TRIM.get());
				tabData.accept(TrademineItemRandomForgeModItems.ANY_MINERALS.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(TrademineItemRandomForgeModItems.RANDOMNESS_HOSTILE_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(TrademineItemRandomForgeModItems.ANY_FOOD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(TrademineItemRandomForgeModItems.ANY_MINERALS.get());
		}
	}
}