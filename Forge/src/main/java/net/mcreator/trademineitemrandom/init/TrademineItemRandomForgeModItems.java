/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trademineitemrandom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.trademineitemrandom.item.RandomSeedItem;
import net.mcreator.trademineitemrandom.item.RainbowDyeItem;
import net.mcreator.trademineitemrandom.item.PotionOfRandomItem;
import net.mcreator.trademineitemrandom.item.AnyFoodItem;
import net.mcreator.trademineitemrandom.item.AnyArmorTrimItem;
import net.mcreator.trademineitemrandom.TrademineItemRandomForgeMod;

public class TrademineItemRandomForgeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TrademineItemRandomForgeMod.MODID);
	public static final RegistryObject<Item> ORE_OF_RANDOMNESS = block(TrademineItemRandomForgeModBlocks.ORE_OF_RANDOMNESS);
	public static final RegistryObject<Item> POTION_OF_RANDOM = REGISTRY.register("potion_of_random", () -> new PotionOfRandomItem());
	public static final RegistryObject<Item> RANDOMNESS_HOSTILE_SPAWN_EGG = REGISTRY.register("randomness_hostile_spawn_egg", () -> new ForgeSpawnEggItem(TrademineItemRandomForgeModEntities.RANDOMNESS_HOSTILE, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> DEEPSLATE_ORE_OF_RANDOMNESS = block(TrademineItemRandomForgeModBlocks.DEEPSLATE_ORE_OF_RANDOMNESS);
	public static final RegistryObject<Item> NETHER_ORE_OF_RANDOMNESS = block(TrademineItemRandomForgeModBlocks.NETHER_ORE_OF_RANDOMNESS);
	public static final RegistryObject<Item> FLOWER_OF_RANDOMNESS = block(TrademineItemRandomForgeModBlocks.FLOWER_OF_RANDOMNESS);
	public static final RegistryObject<Item> RAINBOW_DYE = REGISTRY.register("rainbow_dye", () -> new RainbowDyeItem());
	public static final RegistryObject<Item> RANDOM_SEED = REGISTRY.register("random_seed", () -> new RandomSeedItem());
	public static final RegistryObject<Item> RANDOM_CROP_STAGE_0 = block(TrademineItemRandomForgeModBlocks.RANDOM_CROP_STAGE_0);
	public static final RegistryObject<Item> RANDOM_CROP_STAGE_1 = block(TrademineItemRandomForgeModBlocks.RANDOM_CROP_STAGE_1);
	public static final RegistryObject<Item> RANDOM_CROP_STAGE_2 = block(TrademineItemRandomForgeModBlocks.RANDOM_CROP_STAGE_2);
	public static final RegistryObject<Item> RANDOM_CROP_STAGE_3 = block(TrademineItemRandomForgeModBlocks.RANDOM_CROP_STAGE_3);
	public static final RegistryObject<Item> RANDOM_CROP_STAGE_4 = block(TrademineItemRandomForgeModBlocks.RANDOM_CROP_STAGE_4);
	public static final RegistryObject<Item> RANDOM_CROP_STAGE_5 = block(TrademineItemRandomForgeModBlocks.RANDOM_CROP_STAGE_5);
	public static final RegistryObject<Item> ANY_FOOD = REGISTRY.register("any_food", () -> new AnyFoodItem());
	public static final RegistryObject<Item> ANY_ARMOR_TRIM = REGISTRY.register("any_armor_trim", () -> new AnyArmorTrimItem());
	public static final RegistryObject<Item> ANY_MINERALS = REGISTRY.register("any_minerals", () -> new AnyMineralsItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}