/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trademineitemrandom.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.trademineitemrandom.item.PotionOfRandomItem;
import net.mcreator.trademineitemrandom.TrademineItemRandomMod;

import java.util.function.Function;

public class TrademineItemRandomModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TrademineItemRandomMod.MODID);
	public static final DeferredItem<Item> ORE_OF_RANDOMNESS = block(TrademineItemRandomModBlocks.ORE_OF_RANDOMNESS);
	public static final DeferredItem<Item> POTION_OF_RANDOM = register("potion_of_random", PotionOfRandomItem::new);
	public static final DeferredItem<Item> RANDOMNESS_HOSTILE_SPAWN_EGG = register("randomness_hostile_spawn_egg", properties -> new SpawnEggItem(TrademineItemRandomModEntities.RANDOMNESS_HOSTILE.get(), properties));

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}