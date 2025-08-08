package net.mcreator.trademineitemrandom.procedures;

import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PotionOfRandomPlayerFinishesUsingItemProcedure {
	@SubscribeEvent
	public static void onUseItemStart(LivingEntityUseItemEvent.Start event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() <= 0.03) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 1, 5), true, true));
		}
		if (Math.random() <= 0.03) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.BAD_OMEN, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 1, 5), true, true));
		}
		if (Math.random() <= 0.03) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, Mth.nextInt(RandomSource.create(), 60, 180), 0, true, true));
		}
		if (Math.random() <= 0.03) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 1, 5), true, true));
		}
	}
}