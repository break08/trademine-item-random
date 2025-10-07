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

import net.mcreator.trademineitemrandom.TrademineItemRandomMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TrademineItemRandomModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TrademineItemRandomMod.MODID);
	public static final RegistryObject<CreativeModeTab> RANDOM = REGISTRY.register("random",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.trademine_item_random.random")).icon(() -> new ItemStack(TrademineItemRandomModItems.RAINBOW_DYE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TrademineItemRandomModBlocks.ORE_OF_RANDOMNESS.get().asItem());
				tabData.accept(TrademineItemRandomModBlocks.DEEPSLATE_ORE_OF_RANDOMNESS.get().asItem());
				tabData.accept(TrademineItemRandomModBlocks.NETHER_ORE_OF_RANDOMNESS.get().asItem());
				tabData.accept(TrademineItemRandomModItems.POTION_OF_RANDOM.get());
				tabData.accept(TrademineItemRandomModBlocks.FLOWER_OF_RANDOMNESS.get().asItem());
				tabData.accept(TrademineItemRandomModItems.RAINBOW_DYE.get());
				tabData.accept(TrademineItemRandomModItems.RANDOM_SEED.get());
				tabData.accept(TrademineItemRandomModItems.ANY_FOOD.get());
				tabData.accept(TrademineItemRandomModItems.ANY_ARMOR_TRIM.get());
				tabData.accept(TrademineItemRandomModItems.ANY_MINERALS.get());
				tabData.accept(TrademineItemRandomModItems.SUMMONER_ARMOR_HELMET.get());
				tabData.accept(TrademineItemRandomModBlocks.RANDOM_TRADER.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(TrademineItemRandomModItems.ANY_FOOD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(TrademineItemRandomModItems.ANY_MINERALS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(TrademineItemRandomModItems.SUMMONER_ARMOR_HELMET.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(TrademineItemRandomModBlocks.RANDOM_TRADER.get().asItem());
		}
	}
}