/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trademineitemrandom.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.trademineitemrandom.item.SummonerArmorItem;
import net.mcreator.trademineitemrandom.item.RandomSeedItem;
import net.mcreator.trademineitemrandom.item.RainbowDyeItem;
import net.mcreator.trademineitemrandom.item.PotionOfRandomItem;
import net.mcreator.trademineitemrandom.item.AnyMineralsItem;
import net.mcreator.trademineitemrandom.item.AnyFoodItem;
import net.mcreator.trademineitemrandom.item.AnyArmorTrimItem;
import net.mcreator.trademineitemrandom.TrademineItemRandomMod;

public class TrademineItemRandomModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TrademineItemRandomMod.MODID);
	public static final DeferredItem<Item> ORE_OF_RANDOMNESS = block(TrademineItemRandomModBlocks.ORE_OF_RANDOMNESS);
	public static final DeferredItem<Item> POTION_OF_RANDOM = REGISTRY.register("potion_of_random", PotionOfRandomItem::new);
	public static final DeferredItem<Item> DEEPSLATE_ORE_OF_RANDOMNESS = block(TrademineItemRandomModBlocks.DEEPSLATE_ORE_OF_RANDOMNESS);
	public static final DeferredItem<Item> NETHER_ORE_OF_RANDOMNESS = block(TrademineItemRandomModBlocks.NETHER_ORE_OF_RANDOMNESS);
	public static final DeferredItem<Item> FLOWER_OF_RANDOMNESS = block(TrademineItemRandomModBlocks.FLOWER_OF_RANDOMNESS);
	public static final DeferredItem<Item> RAINBOW_DYE = REGISTRY.register("rainbow_dye", RainbowDyeItem::new);
	public static final DeferredItem<Item> RANDOM_SEED = REGISTRY.register("random_seed", RandomSeedItem::new);
	public static final DeferredItem<Item> RANDOM_CROP_STAGE_0 = block(TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_0);
	public static final DeferredItem<Item> RANDOM_CROP_STAGE_1 = block(TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_1);
	public static final DeferredItem<Item> RANDOM_CROP_STAGE_2 = block(TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_2);
	public static final DeferredItem<Item> RANDOM_CROP_STAGE_3 = block(TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_3);
	public static final DeferredItem<Item> RANDOM_CROP_STAGE_4 = block(TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_4);
	public static final DeferredItem<Item> RANDOM_CROP_STAGE_5 = block(TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_5);
	public static final DeferredItem<Item> ANY_FOOD = REGISTRY.register("any_food", AnyFoodItem::new);
	public static final DeferredItem<Item> ANY_ARMOR_TRIM = REGISTRY.register("any_armor_trim", AnyArmorTrimItem::new);
	public static final DeferredItem<Item> ANY_MINERALS = REGISTRY.register("any_minerals", AnyMineralsItem::new);
	public static final DeferredItem<Item> SUMMONER_ARMOR_HELMET = REGISTRY.register("summoner_armor_helmet", SummonerArmorItem.Helmet::new);
	public static final DeferredItem<Item> RANDOM_TRADER = block(TrademineItemRandomModBlocks.RANDOM_TRADER);
	public static final DeferredItem<Item> RANDOM_SPAWNER = block(TrademineItemRandomModBlocks.RANDOM_SPAWNER);

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}