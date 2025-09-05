package net.mcreator.trademineitemrandom.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.trademineitemrandom.init.TrademineItemRandomForgeModBlocks;

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
		stage0 = TrademineItemRandomForgeModBlocks.RANDOM_CROP_STAGE_0.get().defaultBlockState();
		stage1 = TrademineItemRandomForgeModBlocks.RANDOM_CROP_STAGE_1.get().defaultBlockState();
		stage2 = TrademineItemRandomForgeModBlocks.RANDOM_CROP_STAGE_2.get().defaultBlockState();
		stage3 = TrademineItemRandomForgeModBlocks.RANDOM_CROP_STAGE_3.get().defaultBlockState();
		stage4 = TrademineItemRandomForgeModBlocks.RANDOM_CROP_STAGE_4.get().defaultBlockState();
		stage5 = TrademineItemRandomForgeModBlocks.RANDOM_CROP_STAGE_5.get().defaultBlockState();
		sx = -3;
		found = false;
		farmland_bool = false;
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
		if (found == true && farmland_bool == true) {
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "growing") <= 0) {
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
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("growing", 0);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("growing", ((new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, BlockPos.containing(x, y, z), "growing")) - 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
	}
}