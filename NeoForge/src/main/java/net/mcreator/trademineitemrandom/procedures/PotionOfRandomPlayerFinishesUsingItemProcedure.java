package net.mcreator.trademineitemrandom.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class PotionOfRandomPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double random_receive_effects = 0;
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		if (Math.random() <= 0.65) {
			random_receive_effects = Mth.nextInt(RandomSource.create(), 1, 6);
			if (random_receive_effects == 1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, Mth.nextInt(RandomSource.create(), 60, 180), 0, true, true));
			} else if (random_receive_effects == 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 0, 5), true, true));
			} else if (random_receive_effects == 3) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, Mth.nextInt(RandomSource.create(), 60, 180), 0, true, true));
			} else if (random_receive_effects == 4) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 0, 5), true, true));
			} else if (random_receive_effects == 5) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HEAL, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 0, 2), true, true));
			} else if (random_receive_effects == 6) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, Mth.nextInt(RandomSource.create(), 60, 180), 0, true, true));
			}
		} else {
			random_receive_effects = Mth.nextInt(RandomSource.create(), 1, 6);
			if (random_receive_effects == 1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, Mth.nextInt(RandomSource.create(), 60, 180), 0, true, true));
			} else if (random_receive_effects == 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.BAD_OMEN, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 0, 4), true, true));
			} else if (random_receive_effects == 3) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, Mth.nextInt(RandomSource.create(), 60, 180), 0, true, true));
			} else if (random_receive_effects == 4) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 0, 4), true, true));
			} else if (random_receive_effects == 5) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 0, 3), true, true));
			} else if (random_receive_effects == 6) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.POISON, Mth.nextInt(RandomSource.create(), 60, 180), 0, true, true));
			}
		}
	}
}