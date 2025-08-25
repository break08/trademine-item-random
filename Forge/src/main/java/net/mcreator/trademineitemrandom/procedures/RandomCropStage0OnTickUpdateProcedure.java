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
		stage0 = TrademineItemRandomForgeModBlocks.RANDOM_CROP_STAGE_0.get().defaultBlockState();
		stage1 = TrademineItemRandomForgeModBlocks.RANDOM_CROP_STAGE_1.get().defaultBlockState();
		stage2 = TrademineItemRandomForgeModBlocks.RANDOM_CROP_STAGE_2.get().defaultBlockState();
		stage3 = TrademineItemRandomForgeModBlocks.RANDOM_CROP_STAGE_3.get().defaultBlockState();
		stage4 = TrademineItemRandomForgeModBlocks.RANDOM_CROP_STAGE_4.get().defaultBlockState();
		stage5 = TrademineItemRandomForgeModBlocks.RANDOM_CROP_STAGE_5.get().defaultBlockState();
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "GrowthTime") <= 0) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == stage0.getBlock() && stage1.canSurvive(world, BlockPos.containing(x, y, z))) {
				world.setBlock(BlockPos.containing(x, y, z), stage1, 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == stage1.getBlock() && stage2.canSurvive(world, BlockPos.containing(x, y, z))) {
				world.setBlock(BlockPos.containing(x, y, z), stage2, 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == stage2.getBlock() && stage3.canSurvive(world, BlockPos.containing(x, y, z))) {
				world.setBlock(BlockPos.containing(x, y, z), stage3, 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == stage3.getBlock() && stage4.canSurvive(world, BlockPos.containing(x, y, z))) {
				world.setBlock(BlockPos.containing(x, y, z), stage4, 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == stage4.getBlock() && stage5.canSurvive(world, BlockPos.containing(x, y, z))) {
				world.setBlock(BlockPos.containing(x, y, z), stage5, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("GrowthTime", 0);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("GrowthTime", ((new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x, y, z), "GrowthTime")) - 1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}