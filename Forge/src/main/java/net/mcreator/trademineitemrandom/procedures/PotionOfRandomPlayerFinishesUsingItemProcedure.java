package net.mcreator.trademineitemrandom.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.trademineitemrandom.init.TrademineItemRandomModItems;

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
		if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(TrademineItemRandomModItems.POTION_OF_RANDOM.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (Math.random() <= 0.8) {
			random_receive_effects = Mth.nextInt(RandomSource.create(), 1, 7);
			if (random_receive_effects == 1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, Mth.nextInt(RandomSource.create(), 7200, 9600), 1, false, true));
			} else if (random_receive_effects == 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, Mth.nextInt(RandomSource.create(), 7200, 9600), Mth.nextInt(RandomSource.create(), 1, 5), false, true));
			} else if (random_receive_effects == 3) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, Mth.nextInt(RandomSource.create(), 7200, 9600), 1, false, true));
			} else if (random_receive_effects == 4) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, Mth.nextInt(RandomSource.create(), 7200, 9600), Mth.nextInt(RandomSource.create(), 1, 5), false, true));
			} else if (random_receive_effects == 5) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HEAL, Mth.nextInt(RandomSource.create(), 7200, 9600), Mth.nextInt(RandomSource.create(), 1, 2), false, true));
			} else if (random_receive_effects == 6) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, Mth.nextInt(RandomSource.create(), 7200, 9600), 1, false, true));
			} else if (random_receive_effects == 7) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, Mth.nextInt(RandomSource.create(), 7200, 9600), 1, true, true));
			}
		} else {
			if (Math.random() < 50) {
				random_receive_effects = Mth.nextInt(RandomSource.create(), 1, 7);
				if (random_receive_effects == 1) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, Mth.nextInt(RandomSource.create(), 7200, 9600), 1, false, true));
				} else if (random_receive_effects == 2) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.BAD_OMEN, Mth.nextInt(RandomSource.create(), 7200, 9600), Mth.nextInt(RandomSource.create(), 1, 4), false, true));
				} else if (random_receive_effects == 3) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, Mth.nextInt(RandomSource.create(), 7200, 9600), 1, false, true));
				} else if (random_receive_effects == 4) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, Mth.nextInt(RandomSource.create(), 7200, 9600), Mth.nextInt(RandomSource.create(), 1, 4), false, true));
				} else if (random_receive_effects == 5) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, Mth.nextInt(RandomSource.create(), 7200, 9600), Mth.nextInt(RandomSource.create(), 1, 3), false, true));
				} else if (random_receive_effects == 6) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.POISON, Mth.nextInt(RandomSource.create(), 200, 300), 1, false, true));
				} else if (random_receive_effects == 7) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, Mth.nextInt(RandomSource.create(), 140, 200), 1, false, true));
				}
			} else {
				random_receive_effects = Mth.nextInt(RandomSource.create(), 1, 3);
				if (random_receive_effects == 1) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, Mth.nextInt(RandomSource.create(), 7200, 9600), 1, false, true));
				} else if (random_receive_effects == 2) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, Mth.nextInt(RandomSource.create(), 7200, 9600), 1, false, true));
				} else if (random_receive_effects == 3) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, Mth.nextInt(RandomSource.create(), 7200, 9600), 1, false, true));
				} else if (random_receive_effects == 4) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, Mth.nextInt(RandomSource.create(), 7200, 9600), 1, false, true));
				} else if (random_receive_effects == 5) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, Mth.nextInt(RandomSource.create(), 7200, 9600), 1, false, true));
				}
			}
		}
	}
}