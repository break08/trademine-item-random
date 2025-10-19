package net.mcreator.trademineitemrandom.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.trademineitemrandom.init.TrademineItemRandomModBlocks;

public class RandomCropStage0OnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState stage0 = Blocks.AIR.defaultBlockState();
		BlockState stage1 = Blocks.AIR.defaultBlockState();
		BlockState stage2 = Blocks.AIR.defaultBlockState();
		BlockState stage3 = Blocks.AIR.defaultBlockState();
		BlockState stage4 = Blocks.AIR.defaultBlockState();
		BlockState stage5 = Blocks.AIR.defaultBlockState();
		double sx = 0;
		double sy = 0;
		double sz = 0;
		boolean farmland_bool = false;
		boolean light_bool = false;
		stage0 = TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_0.get().defaultBlockState();
		stage1 = TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_1.get().defaultBlockState();
		stage2 = TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_2.get().defaultBlockState();
		stage3 = TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_3.get().defaultBlockState();
		stage4 = TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_4.get().defaultBlockState();
		stage5 = TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_5.get().defaultBlockState();
		sx = -3;
		farmland_bool = false;
		light_bool = false;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.FARMLAND) {
			farmland_bool = true;
		}
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y + 1, z)) >= 7) {
			light_bool = true;
		}
		if (((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("moisure") instanceof IntegerProperty _getip4 ? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip4) : -1) >= 1
				&& farmland_bool == true && light_bool == true) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == stage0.getBlock()) {
				world.setBlock(BlockPos.containing(x, y, z), stage1, 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == stage1.getBlock()) {
				world.setBlock(BlockPos.containing(x, y, z), stage2, 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == stage2.getBlock()) {
				world.setBlock(BlockPos.containing(x, y, z), stage3, 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == stage3.getBlock()) {
				world.setBlock(BlockPos.containing(x, y, z), stage4, 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == stage4.getBlock()) {
				world.setBlock(BlockPos.containing(x, y, z), stage5, 3);
			}
		}
	}
}