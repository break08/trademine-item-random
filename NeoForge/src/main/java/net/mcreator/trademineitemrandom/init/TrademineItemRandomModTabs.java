/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trademineitemrandom.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.trademineitemrandom.TrademineItemRandomMod;

@EventBusSubscriber
public class TrademineItemRandomModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TrademineItemRandomMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RANDOM = REGISTRY.register("random",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.trademine_item_random.random")).icon(() -> new ItemStack(TrademineItemRandomModItems.RAINBOW_DYE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TrademineItemRandomModBlocks.ORE_OF_RANDOMNESS.get().asItem());
				tabData.accept(TrademineItemRandomModBlocks.DEEPSLATE_ORE_OF_RANDOMNESS.get().asItem());
				tabData.accept(TrademineItemRandomModBlocks.NETHER_ORE_OF_RANDOMNESS.get().asItem());
				tabData.accept(TrademineItemRandomModBlocks.FLOWER_OF_RANDOMNESS.get().asItem());
				tabData.accept(TrademineItemRandomModItems.RAINBOW_DYE.get());
				tabData.accept(TrademineItemRandomModItems.RANDOM_SEED.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(TrademineItemRandomModItems.RANDOMNESS_HOSTILE_SPAWN_EGG.get());
		}
	}
}