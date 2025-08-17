package net.mcreator.trademineitemrandom.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class RandomCropStage0BlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) >= 9 && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FARMLAND) {
			return true;
		}
		return false;
	}
}