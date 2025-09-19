package net.mcreator.trademineitemrandom.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class RandomnessHostileEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random_spawn = 0;
		if (Math.random() <= 0.95) {
			random_spawn = Mth.nextInt(RandomSource.create(), 1, 12);
			if (random_spawn == 1) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.ZOMBIE.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (random_spawn == 2) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.SKELETON.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (random_spawn == 3) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.CREEPER.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (random_spawn == 4) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.SLIME.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (random_spawn == 5) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.GUARDIAN.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (random_spawn == 6) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.VINDICATOR.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (random_spawn == 7) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.ILLUSIONER.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (random_spawn == 8) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.CAVE_SPIDER.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (random_spawn == 9) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.ZOMBIFIED_PIGLIN.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (random_spawn == 10) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.ZOMBIE_VILLAGER.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (random_spawn == 11) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.BLAZE.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (random_spawn == 12) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.GHAST.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
		}
	}
}