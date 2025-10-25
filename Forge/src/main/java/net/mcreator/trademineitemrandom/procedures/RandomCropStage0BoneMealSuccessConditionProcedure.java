package net.mcreator.trademineitemrandom.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class RandomCropStage0BoneMealSuccessConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= 0.5 && ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("moisure") instanceof IntegerProperty _getip1
				? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip1)
				: -1) >= 1) {
			return true;
		}
		return false;
	}
}