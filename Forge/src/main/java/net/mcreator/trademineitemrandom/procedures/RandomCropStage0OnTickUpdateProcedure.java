package net.mcreator.trademineitemrandom.procedures;

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
		boolean found = false;
		boolean farmland_bool = false;
		boolean light_bool = false;
		stage0 = TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_0.get().defaultBlockState();
		stage1 = TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_1.get().defaultBlockState();
		stage2 = TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_2.get().defaultBlockState();
		stage3 = TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_3.get().defaultBlockState();
		stage4 = TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_4.get().defaultBlockState();
		stage5 = TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_5.get().defaultBlockState();
		sx = -3;
		found = false;
		farmland_bool = false;
		light_bool = false;
		if (!world.getLevelData().isRaining()) {
			for (int index0 = 0; index0 < 4; index0++) {
				sy = -2;
				for (int index1 = 0; index1 < 4; index1++) {
					sz = -2;
					for (int index2 = 0; index2 < 4; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.WATER) {
							found = true;
							break;
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
		} else {
			found = true;
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.FARMLAND) {
			farmland_bool = true;
		}
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y + 1, z)) >= 7) {
			light_bool = true;
		}
		if (found == true && farmland_bool == true && light_bool == true) {
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