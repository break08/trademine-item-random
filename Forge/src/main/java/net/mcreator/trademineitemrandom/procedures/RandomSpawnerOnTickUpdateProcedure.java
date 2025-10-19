package net.mcreator.trademineitemrandom.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class RandomSpawnerOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random_spawn = 0;
		Entity passenger = null;
		Entity be_riden = null;
		boolean jockey = false;
		if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
			jockey = false;
			if (Math.random() <= 0.2) {
				jockey = true;
			}
			if (jockey == false) {
				random_spawn = Mth.nextInt(RandomSource.create(), 1, 17);
				if (random_spawn == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.ZOMBIE.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (random_spawn == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.SKELETON.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (random_spawn == 3) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.CREEPER.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (random_spawn == 4) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.SLIME.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (random_spawn == 5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.GUARDIAN.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (random_spawn == 6) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.VINDICATOR.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (random_spawn == 7) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.ILLUSIONER.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (random_spawn == 8) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.PIGLIN_BRUTE.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (random_spawn == 9) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.EVOKER.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (random_spawn == 10) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.ZOMBIE_VILLAGER.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (random_spawn == 11) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.BLAZE.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (random_spawn == 12) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.HUSK.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (random_spawn == 13) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.VEX.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (random_spawn == 14) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.SILVERFISH.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (random_spawn == 15) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.SHULKER.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (random_spawn == 16) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.STRAY.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (random_spawn == 17) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.ENDERMITE.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			} else {
				random_spawn = Mth.nextInt(RandomSource.create(), 1, 5);
				if (random_spawn == 1) {
					passenger = world instanceof ServerLevel _level20 ? EntityType.SKELETON.spawn(_level20, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED) : null;
					be_riden = world instanceof ServerLevel _level21 ? EntityType.SPIDER.spawn(_level21, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED) : null;
				} else if (random_spawn == 2) {
					passenger = world instanceof ServerLevel _level22 ? EntityType.SKELETON.spawn(_level22, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED) : null;
					be_riden = world instanceof ServerLevel _level23 ? EntityType.SKELETON_HORSE.spawn(_level23, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED) : null;
				} else if (random_spawn == 3) {
					passenger = world instanceof ServerLevel _level24 ? EntityType.STRAY.spawn(_level24, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED) : null;
					be_riden = world instanceof ServerLevel _level25 ? EntityType.BAT.spawn(_level25, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED) : null;
				} else if (random_spawn == 4) {
					passenger = world instanceof ServerLevel _level26 ? EntityType.ZOMBIE.spawn(_level26, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED) : null;
					be_riden = world instanceof ServerLevel _level27 ? EntityType.CHICKEN.spawn(_level27, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED) : null;
				} else if (random_spawn == 5) {
					passenger = world instanceof ServerLevel _level28 ? EntityType.ZOMBIE.spawn(_level28, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED) : null;
					be_riden = world instanceof ServerLevel _level29 ? EntityType.ZOMBIE_HORSE.spawn(_level29, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED) : null;
				}
				passenger.startRiding(be_riden);
			}
		}
	}
}