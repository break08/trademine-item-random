/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trademineitemrandom.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

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

import java.util.function.Function;

public class TrademineItemRandomModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(TrademineItemRandomMod.MODID);
	public static final DeferredBlock<Block> ORE_OF_RANDOMNESS = register("ore_of_randomness", OreOfRandomnessBlock::new);
	public static final DeferredBlock<Block> DEEPSLATE_ORE_OF_RANDOMNESS = register("deepslate_ore_of_randomness", DeepslateOreOfRandomnessBlock::new);
	public static final DeferredBlock<Block> NETHER_ORE_OF_RANDOMNESS = register("nether_ore_of_randomness", NetherOreOfRandomnessBlock::new);
	public static final DeferredBlock<Block> FLOWER_OF_RANDOMNESS = register("flower_of_randomness", FlowerOfRandomnessBlock::new);
	public static final DeferredBlock<Block> RANDOM_CROP_STAGE_0 = register("random_crop_stage_0", RandomCropStage0Block::new);
	public static final DeferredBlock<Block> RANDOM_CROP_STAGE_1 = register("random_crop_stage_1", RandomCropStage1Block::new);
	public static final DeferredBlock<Block> RANDOM_CROP_STAGE_2 = register("random_crop_stage_2", RandomCropStage2Block::new);
	public static final DeferredBlock<Block> RANDOM_CROP_STAGE_3 = register("random_crop_stage_3", RandomCropStage3Block::new);
	public static final DeferredBlock<Block> RANDOM_CROP_STAGE_4 = register("random_crop_stage_4", RandomCropStage4Block::new);
	public static final DeferredBlock<Block> RANDOM_CROP_STAGE_5 = register("random_crop_stage_5", RandomCropStage5Block::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}