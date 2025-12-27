package net.mcreator.trademineitemrandom.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.trademineitemrandom.init.TrademineItemRandomModBlocks;

public class RandomCropStage4OnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_5.get().defaultBlockState(), 3);
	}
}