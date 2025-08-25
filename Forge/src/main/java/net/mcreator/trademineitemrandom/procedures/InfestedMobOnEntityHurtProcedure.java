package net.mcreator.trademineitemrandom.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.trademineitemrandom.init.TrademineItemRandomForgeModEntities;

public class InfestedMobOnEntityHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double SpawnRandom = 0;
		SpawnRandom = Mth.nextInt(RandomSource.create(), 1, 21);
		if (SpawnRandom == 1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = TrademineItemRandomForgeModEntities.RANDOMNESS_HOSTILE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (SpawnRandom == 2) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.CHICKEN.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (SpawnRandom == 3) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.COW.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (SpawnRandom == 4) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.BEE.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (SpawnRandom == 5) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.PIG.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (SpawnRandom == 6) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.ZOMBIE.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (SpawnRandom == 7) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.SKELETON.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (SpawnRandom == 8) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.CREEPER.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (SpawnRandom == 9) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.ENDERMAN.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (SpawnRandom == 10) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.ENDERMITE.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (SpawnRandom == 11) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.GHAST.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (SpawnRandom == 12) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.SHULKER.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (SpawnRandom == 13) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.SHEEP.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (SpawnRandom == 14) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.ELDER_GUARDIAN.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (SpawnRandom == 15) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.GUARDIAN.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (SpawnRandom == 16) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.IRON_GOLEM.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (SpawnRandom == 17) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.CAT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (SpawnRandom == 18) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.WOLF.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (SpawnRandom == 19) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.ALLAY.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (SpawnRandom == 20) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.AXOLOTL.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (SpawnRandom == 21) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.BLAZE.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
	}
}