package net.mcreator.trademineitemrandom.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.trademineitemrandom.network.TrademineItemRandomModVariables;

public class SplashPotionsOfRandomProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() <= 0.65) {
			TrademineItemRandomModVariables.MapVariables.get(world).random_splash_potion_of_random = Mth.nextInt(RandomSource.create(), 1, 6);
			TrademineItemRandomModVariables.MapVariables.get(world).syncData(world);
			if (TrademineItemRandomModVariables.MapVariables.get(world).random_splash_potion_of_random == 1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 0, 5), true, true));
			} else if (TrademineItemRandomModVariables.MapVariables.get(world).random_splash_potion_of_random == 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HEAL, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 0, 2), true, true));
			} else if (TrademineItemRandomModVariables.MapVariables.get(world).random_splash_potion_of_random == 3) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 0, 5), true, true));
			} else if (TrademineItemRandomModVariables.MapVariables.get(world).random_splash_potion_of_random == 4) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, Mth.nextInt(RandomSource.create(), 60, 180), 0, true, true));
			} else if (TrademineItemRandomModVariables.MapVariables.get(world).random_splash_potion_of_random == 5) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 0, 6), true, true));
			} else if (TrademineItemRandomModVariables.MapVariables.get(world).random_splash_potion_of_random == 6) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 0, 6), true, true));
			}
		} else {
			TrademineItemRandomModVariables.MapVariables.get(world).random_splash_potion_of_random = Mth.nextInt(RandomSource.create(), 1, 4);
			TrademineItemRandomModVariables.MapVariables.get(world).syncData(world);
			if (TrademineItemRandomModVariables.MapVariables.get(world).random_splash_potion_of_random == 1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, Mth.nextInt(RandomSource.create(), 60, 180), 0, true, true));
			} else if (TrademineItemRandomModVariables.MapVariables.get(world).random_splash_potion_of_random == 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, Mth.nextInt(RandomSource.create(), 60, 180), 0, true, true));
			} else if (TrademineItemRandomModVariables.MapVariables.get(world).random_splash_potion_of_random == 3) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, Mth.nextInt(RandomSource.create(), 60, 180), 0, true, true));
			} else if (TrademineItemRandomModVariables.MapVariables.get(world).random_splash_potion_of_random == 4) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.POISON, Mth.nextInt(RandomSource.create(), 60, 180), 0, true, true));
			}
		}
	}
}