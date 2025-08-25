package net.mcreator.trademineitemrandom.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.trademineitemrandom.init.TrademineItemRandomForgeModBlocks;

public class FlowerOfRandomnessOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.CAVE_AIR
				|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.VOID_AIR) && TrademineItemRandomForgeModBlocks.FLOWER_OF_RANDOMNESS.get().defaultBlockState().canSurvive(world, BlockPos.containing(x + 1, y, z))) {
			world.setBlock(BlockPos.containing(x + 1, y, z), TrademineItemRandomForgeModBlocks.FLOWER_OF_RANDOMNESS.get().defaultBlockState(), 3);
		}
		if (((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.CAVE_AIR
				|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.VOID_AIR) && TrademineItemRandomForgeModBlocks.FLOWER_OF_RANDOMNESS.get().defaultBlockState().canSurvive(world, BlockPos.containing(x - 1, y, z))) {
			world.setBlock(BlockPos.containing(x - 1, y, z), TrademineItemRandomForgeModBlocks.FLOWER_OF_RANDOMNESS.get().defaultBlockState(), 3);
		}
		if (((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.CAVE_AIR
				|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.VOID_AIR) && TrademineItemRandomForgeModBlocks.FLOWER_OF_RANDOMNESS.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z - 1))) {
			world.setBlock(BlockPos.containing(x, y, z - 1), TrademineItemRandomForgeModBlocks.FLOWER_OF_RANDOMNESS.get().defaultBlockState(), 3);
		}
		if (((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.CAVE_AIR
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.VOID_AIR) && TrademineItemRandomForgeModBlocks.FLOWER_OF_RANDOMNESS.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z + 1))) {
			world.setBlock(BlockPos.containing(x, y, z + 1), TrademineItemRandomForgeModBlocks.FLOWER_OF_RANDOMNESS.get().defaultBlockState(), 3);
		}
	}
}