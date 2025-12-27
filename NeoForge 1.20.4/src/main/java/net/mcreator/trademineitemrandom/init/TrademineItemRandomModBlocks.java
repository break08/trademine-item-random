/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trademineitemrandom.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.trademineitemrandom.block.*;
import net.mcreator.trademineitemrandom.TrademineItemRandomMod;

public class TrademineItemRandomModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(TrademineItemRandomMod.MODID);
	public static final DeferredBlock<Block> ORE_OF_RANDOMNESS;
	public static final DeferredBlock<Block> DEEPSLATE_ORE_OF_RANDOMNESS;
	public static final DeferredBlock<Block> NETHER_ORE_OF_RANDOMNESS;
	public static final DeferredBlock<Block> FLOWER_OF_RANDOMNESS;
	public static final DeferredBlock<Block> RANDOM_CROP_STAGE_0;
	public static final DeferredBlock<Block> RANDOM_CROP_STAGE_1;
	public static final DeferredBlock<Block> RANDOM_CROP_STAGE_2;
	public static final DeferredBlock<Block> RANDOM_CROP_STAGE_3;
	public static final DeferredBlock<Block> RANDOM_CROP_STAGE_4;
	public static final DeferredBlock<Block> RANDOM_CROP_STAGE_5;
	public static final DeferredBlock<Block> RANDOM_TRADER;
	public static final DeferredBlock<Block> RANDOM_SPAWNER;
	static {
		ORE_OF_RANDOMNESS = REGISTRY.register("ore_of_randomness", OreOfRandomnessBlock::new);
		DEEPSLATE_ORE_OF_RANDOMNESS = REGISTRY.register("deepslate_ore_of_randomness", DeepslateOreOfRandomnessBlock::new);
		NETHER_ORE_OF_RANDOMNESS = REGISTRY.register("nether_ore_of_randomness", NetherOreOfRandomnessBlock::new);
		FLOWER_OF_RANDOMNESS = REGISTRY.register("flower_of_randomness", FlowerOfRandomnessBlock::new);
		RANDOM_CROP_STAGE_0 = REGISTRY.register("random_crop_stage_0", RandomCropStage0Block::new);
		RANDOM_CROP_STAGE_1 = REGISTRY.register("random_crop_stage_1", RandomCropStage1Block::new);
		RANDOM_CROP_STAGE_2 = REGISTRY.register("random_crop_stage_2", RandomCropStage2Block::new);
		RANDOM_CROP_STAGE_3 = REGISTRY.register("random_crop_stage_3", RandomCropStage3Block::new);
		RANDOM_CROP_STAGE_4 = REGISTRY.register("random_crop_stage_4", RandomCropStage4Block::new);
		RANDOM_CROP_STAGE_5 = REGISTRY.register("random_crop_stage_5", RandomCropStage5Block::new);
		RANDOM_TRADER = REGISTRY.register("random_trader", RandomTraderBlock::new);
		RANDOM_SPAWNER = REGISTRY.register("random_spawner", RandomSpawnerBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}