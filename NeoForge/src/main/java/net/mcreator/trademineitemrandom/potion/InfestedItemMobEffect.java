package net.mcreator.trademineitemrandom.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.trademineitemrandom.procedures.InfestedItemOnEntityHurtProcedure;

public class InfestedItemMobEffect extends MobEffect {
	public InfestedItemMobEffect() {
		super(MobEffectCategory.NEUTRAL, -65536, mobEffectInstance -> ParticleTypes.END_ROD);
	}

	@Override
	public void onMobHurt(ServerLevel level, LivingEntity entity, int amplifier, DamageSource damagesource, float damage) {
		InfestedItemOnEntityHurtProcedure.execute(level, entity.getX(), entity.getY(), entity.getZ());
	}
}