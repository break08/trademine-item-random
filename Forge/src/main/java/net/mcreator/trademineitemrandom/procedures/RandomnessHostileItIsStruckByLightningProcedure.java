package net.mcreator.trademineitemrandom.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class RandomnessHostileItIsStruckByLightningProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double boss = 0;
		boss = Mth.nextInt(RandomSource.create(), 1, 3);
		if (boss == 1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.WITHER.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (boss == 2) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.ELDER_GUARDIAN.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (boss == 3) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.WARDEN.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
	}
}