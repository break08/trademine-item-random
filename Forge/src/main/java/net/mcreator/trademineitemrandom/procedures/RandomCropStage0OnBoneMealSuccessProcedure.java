package net.mcreator.trademineitemrandom.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.trademineitemrandom.init.TrademineItemRandomForgeModBlocks;

public class RandomCropStage0OnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), TrademineItemRandomForgeModBlocks.RANDOM_CROP_STAGE_1.get().defaultBlockState(), 3);
	}
}