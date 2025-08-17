package net.mcreator.trademineitemrandom.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class SplashPotionsOfRandomProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double random_receive_effect_splashpotion_of_randomness = 0;
		if (Math.random() <= 0.65) {
			random_receive_effect_splashpotion_of_randomness = Mth.nextInt(RandomSource.create(), 1, 6);
			if (random_receive_effect_splashpotion_of_randomness == 1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 0, 5), true, true));
			} else if (random_receive_effect_splashpotion_of_randomness == 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HEAL, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 0, 2), true, true));
			} else if (random_receive_effect_splashpotion_of_randomness == 3) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 0, 5), true, true));
			} else if (random_receive_effect_splashpotion_of_randomness == 4) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, Mth.nextInt(RandomSource.create(), 60, 180), 0, true, true));
			} else if (random_receive_effect_splashpotion_of_randomness == 5) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 0, 6), true, true));
			} else if (random_receive_effect_splashpotion_of_randomness == 6) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 0, 6), true, true));
			}
		} else {
			random_receive_effect_splashpotion_of_randomness = Mth.nextInt(RandomSource.create(), 1, 4);
			if (random_receive_effect_splashpotion_of_randomness == 1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, Mth.nextInt(RandomSource.create(), 60, 180), 0, true, true));
			} else if (random_receive_effect_splashpotion_of_randomness == 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, Mth.nextInt(RandomSource.create(), 60, 180), 0, true, true));
			} else if (random_receive_effect_splashpotion_of_randomness == 3) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, Mth.nextInt(RandomSource.create(), 60, 180), 0, true, true));
			} else if (random_receive_effect_splashpotion_of_randomness == 4) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.POISON, Mth.nextInt(RandomSource.create(), 60, 180), 0, true, true));
			}
		}
	}
}