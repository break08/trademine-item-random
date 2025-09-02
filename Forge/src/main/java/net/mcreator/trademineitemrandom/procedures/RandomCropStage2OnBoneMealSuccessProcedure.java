package net.mcreator.trademineitemrandom.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.trademineitemrandom.init.TrademineItemRandomForgeModBlocks;

public class RandomCropStage2OnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), TrademineItemRandomForgeModBlocks.RANDOM_CROP_STAGE_3.get().defaultBlockState(), 3);
	}
}