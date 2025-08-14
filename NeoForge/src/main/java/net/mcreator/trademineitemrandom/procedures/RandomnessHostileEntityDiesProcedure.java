package net.mcreator.trademineitemrandom.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.trademineitemrandom.network.TrademineItemRandomModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class RandomnessHostileEntityDiesProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= 0.95) {
			TrademineItemRandomModVariables.MapVariables.get(world).random_spawn_by_randomnesshostile = Mth.nextInt(RandomSource.create(), 1, 14);
			TrademineItemRandomModVariables.MapVariables.get(world).syncData(world);
			if (TrademineItemRandomModVariables.MapVariables.get(world).random_spawn_by_randomnesshostile == 1) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.ZOMBIE.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (TrademineItemRandomModVariables.MapVariables.get(world).random_spawn_by_randomnesshostile == 2) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.SKELETON.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (TrademineItemRandomModVariables.MapVariables.get(world).random_spawn_by_randomnesshostile == 3) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.CREEPER.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (TrademineItemRandomModVariables.MapVariables.get(world).random_spawn_by_randomnesshostile == 4) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.SLIME.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (TrademineItemRandomModVariables.MapVariables.get(world).random_spawn_by_randomnesshostile == 5) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.GUARDIAN.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (TrademineItemRandomModVariables.MapVariables.get(world).random_spawn_by_randomnesshostile == 6) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.ELDER_GUARDIAN.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (TrademineItemRandomModVariables.MapVariables.get(world).random_spawn_by_randomnesshostile == 7) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.ILLUSIONER.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (TrademineItemRandomModVariables.MapVariables.get(world).random_spawn_by_randomnesshostile == 8) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.MAGMA_CUBE.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (TrademineItemRandomModVariables.MapVariables.get(world).random_spawn_by_randomnesshostile == 9) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.ZOMBIFIED_PIGLIN.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (TrademineItemRandomModVariables.MapVariables.get(world).random_spawn_by_randomnesshostile == 10) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.ZOMBIE_VILLAGER.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (TrademineItemRandomModVariables.MapVariables.get(world).random_spawn_by_randomnesshostile == 11) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.BREEZE.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (TrademineItemRandomModVariables.MapVariables.get(world).random_spawn_by_randomnesshostile == 12) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.BREEZE.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (TrademineItemRandomModVariables.MapVariables.get(world).random_spawn_by_randomnesshostile == 13) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.BLAZE.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (TrademineItemRandomModVariables.MapVariables.get(world).random_spawn_by_randomnesshostile == 14) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.GHAST.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
		} else {
			TrademineItemRandomModVariables.MapVariables.get(world).random_spawn_by_randomnesshostile = Mth.nextInt(RandomSource.create(), 1, 5);
			TrademineItemRandomModVariables.MapVariables.get(world).syncData(world);
			if (TrademineItemRandomModVariables.MapVariables.get(world).random_spawn_by_randomnesshostile == 1) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.WARDEN.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			} else {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.WITHER.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
		}
	}
}