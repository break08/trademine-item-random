/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trademineitemrandom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.trademineitemrandom.block.RandomTraderBlock;
import net.mcreator.trademineitemrandom.block.RandomSpawnerBlock;
import net.mcreator.trademineitemrandom.block.RandomCropStage5Block;
import net.mcreator.trademineitemrandom.block.RandomCropStage4Block;
import net.mcreator.trademineitemrandom.block.RandomCropStage3Block;
import net.mcreator.trademineitemrandom.block.RandomCropStage2Block;
import net.mcreator.trademineitemrandom.block.RandomCropStage1Block;
import net.mcreator.trademineitemrandom.block.RandomCropStage0Block;
import net.mcreator.trademineitemrandom.block.OreOfRandomnessBlock;
import net.mcreator.trademineitemrandom.block.NetherOreOfRandomnessBlock;
import net.mcreator.trademineitemrandom.block.FlowerOfRandomnessBlock;
import net.mcreator.trademineitemrandom.block.DeepslateOreOfRandomnessBlock;
import net.mcreator.trademineitemrandom.TrademineItemRandomMod;

public class TrademineItemRandomModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TrademineItemRandomMod.MODID);
	public static final RegistryObject<Block> ORE_OF_RANDOMNESS = REGISTRY.register("ore_of_randomness", () -> new OreOfRandomnessBlock());
	public static final RegistryObject<Block> DEEPSLATE_ORE_OF_RANDOMNESS = REGISTRY.register("deepslate_ore_of_randomness", () -> new DeepslateOreOfRandomnessBlock());
	public static final RegistryObject<Block> NETHER_ORE_OF_RANDOMNESS = REGISTRY.register("nether_ore_of_randomness", () -> new NetherOreOfRandomnessBlock());
	public static final RegistryObject<Block> FLOWER_OF_RANDOMNESS = REGISTRY.register("flower_of_randomness", () -> new FlowerOfRandomnessBlock());
	public static final RegistryObject<Block> RANDOM_CROP_STAGE_0 = REGISTRY.register("random_crop_stage_0", () -> new RandomCropStage0Block());
	public static final RegistryObject<Block> RANDOM_CROP_STAGE_1 = REGISTRY.register("random_crop_stage_1", () -> new RandomCropStage1Block());
	public static final RegistryObject<Block> RANDOM_CROP_STAGE_2 = REGISTRY.register("random_crop_stage_2", () -> new RandomCropStage2Block());
	public static final RegistryObject<Block> RANDOM_CROP_STAGE_3 = REGISTRY.register("random_crop_stage_3", () -> new RandomCropStage3Block());
	public static final RegistryObject<Block> RANDOM_CROP_STAGE_4 = REGISTRY.register("random_crop_stage_4", () -> new RandomCropStage4Block());
	public static final RegistryObject<Block> RANDOM_CROP_STAGE_5 = REGISTRY.register("random_crop_stage_5", () -> new RandomCropStage5Block());
	public static final RegistryObject<Block> RANDOM_TRADER = REGISTRY.register("random_trader", () -> new RandomTraderBlock());
	public static final RegistryObject<Block> RANDOM_SPAWNER = REGISTRY.register("random_spawner", () -> new RandomSpawnerBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}