package net.mcreator.trademineitemrandom.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.LlamaSpit;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.trademineitemrandom.init.TrademineItemRandomModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DisasterEnchantmentProcedureProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getSource(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, damagesource, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity, Entity sourceentity) {
		if (damagesource == null || entity == null || sourceentity == null)
			return;
		BlockState block_in_wall_chooser = Blocks.AIR.defaultBlockState();
		double disaster_id = 0;
		double bad_effect_id = 0;
		double sx = 0;
		double sz = 0;
		double throw_item = 0;
		if (damagesource.is(TagKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("minecraft:arrow_check"))) && !(sourceentity == null)) {
			if (EnchantmentHelper.getItemEnchantmentLevel(TrademineItemRandomModEnchantments.DISASTER.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
				disaster_id = Mth.nextInt(RandomSource.create(), 1, 5);
				if (disaster_id == 1) {
					bad_effect_id = Mth.nextInt(RandomSource.create(), 1, 5);
					if (bad_effect_id == 1) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 140, 1, false, true));
					} else if (bad_effect_id == 2) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1200, 1, false, true));
					} else if (bad_effect_id == 3) {
						if (entity instanceof LivingEntity _livEnt8 && _livEnt8.getMobType() == MobType.UNDEAD) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.HEAL, 140, 1, false, true));
						} else {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.HARM, 140, 1, false, true));
						}
					} else if (bad_effect_id == 4) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 140, 1, false, true));
					} else if (bad_effect_id == 5) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 140, 1, false, true));
					}
				} else if (disaster_id == 2) {
					block_in_wall_chooser = (ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(ResourceLocation.parse("minecraft:disaster_in_wall"))).getRandomElement(RandomSource.create()).orElseGet(() -> Blocks.AIR)).defaultBlockState();
					world.setBlock(BlockPos.containing(x, y, z), block_in_wall_chooser, 3);
					world.setBlock(BlockPos.containing(x, y + 1, z), block_in_wall_chooser, 3);
				} else if (disaster_id == 3) {
					entity.setSecondsOnFire(8);
				} else if (disaster_id == 4) {
					block_in_wall_chooser = (ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(ResourceLocation.parse("minecraft:disaster_under_block"))).getRandomElement(RandomSource.create()).orElseGet(() -> Blocks.AIR)).defaultBlockState();
					sx = -2;
					for (int index0 = 0; index0 < 3; index0++) {
						for (int index1 = 0; index1 < 3; index1++) {
							sz = -1;
							for (int index2 = 0; index2 < 3; index2++) {
								world.setBlock(BlockPos.containing(x + sx, y - 1, z + sz), block_in_wall_chooser, 3);
								sz = sz + 1;
							}
						}
						sx = sx + 1;
					}
				} else if (disaster_id == 5) {
					throw_item = Mth.nextInt(RandomSource.create(), 1, 2);
					if (throw_item == 1) {
						{
							Entity _shootFrom = sourceentity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = initProjectileProperties(new Snowball(EntityType.SNOWBALL, projectileLevel), sourceentity, Vec3.ZERO);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
					} else if (throw_item == 2) {
						{
							Entity _shootFrom = sourceentity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = initProjectileProperties(new LlamaSpit(EntityType.LLAMA_SPIT, projectileLevel), sourceentity, Vec3.ZERO);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
					}
				}
			}
		}
	}

	private static Projectile initProjectileProperties(Projectile entityToSpawn, Entity shooter, Vec3 acceleration) {
		entityToSpawn.setOwner(shooter);
		if (!Vec3.ZERO.equals(acceleration)) {
			entityToSpawn.setDeltaMovement(acceleration);
			entityToSpawn.hasImpulse = true;
		}
		return entityToSpawn;
	}
}