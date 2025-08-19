package net.mcreator.trademineitemrandom.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.trademineitemrandom.procedures.InfestedMobOnEntityHurtProcedure;

public class InfestedMobMobEffect extends MobEffect {
	public InfestedMobMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16724992, mobEffectInstance -> ParticleTypes.OMINOUS_SPAWNING);
	}

	@Override
	public void onMobHurt(ServerLevel level, LivingEntity entity, int amplifier, DamageSource damagesource, float damage) {
		InfestedMobOnEntityHurtProcedure.execute(level, entity.getX(), entity.getY(), entity.getZ());
	}
}