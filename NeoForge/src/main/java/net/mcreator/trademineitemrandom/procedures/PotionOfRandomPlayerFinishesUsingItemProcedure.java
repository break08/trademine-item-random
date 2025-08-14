package net.mcreator.trademineitemrandom.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;
import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.trademineitemrandom.network.TrademineItemRandomModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PotionOfRandomPlayerFinishesUsingItemProcedure {
	@SubscribeEvent
	public static void onUseItemStart(LivingEntityUseItemEvent.Start event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		if (Math.random() <= 0.65) {
			TrademineItemRandomModVariables.MapVariables.get(world).random_number_ranpotion = Mth.nextInt(RandomSource.create(), 1, 6);
			TrademineItemRandomModVariables.MapVariables.get(world).syncData(world);
			if (TrademineItemRandomModVariables.MapVariables.get(world).random_number_ranpotion == 1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, Mth.nextInt(RandomSource.create(), 60, 180), 0, true, true));
			} else if (TrademineItemRandomModVariables.MapVariables.get(world).random_number_ranpotion == 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 0, 5), true, true));
			} else if (TrademineItemRandomModVariables.MapVariables.get(world).random_number_ranpotion == 3) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, Mth.nextInt(RandomSource.create(), 60, 180), 0, true, true));
			} else if (TrademineItemRandomModVariables.MapVariables.get(world).random_number_ranpotion == 4) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 0, 5), true, true));
			} else if (TrademineItemRandomModVariables.MapVariables.get(world).random_number_ranpotion == 5) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HEAL, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 0, 2), true, true));
			} else if (TrademineItemRandomModVariables.MapVariables.get(world).random_number_ranpotion == 6) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, Mth.nextInt(RandomSource.create(), 60, 180), 0, true, true));
			}
		} else {
			TrademineItemRandomModVariables.MapVariables.get(world).random_number_ranpotion = Mth.nextInt(RandomSource.create(), 1, 6);
			TrademineItemRandomModVariables.MapVariables.get(world).syncData(world);
			if (TrademineItemRandomModVariables.MapVariables.get(world).random_number_ranpotion == 1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, Mth.nextInt(RandomSource.create(), 60, 180), 0, true, true));
			} else if (TrademineItemRandomModVariables.MapVariables.get(world).random_number_ranpotion == 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.BAD_OMEN, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 0, 4), true, true));
			} else if (TrademineItemRandomModVariables.MapVariables.get(world).random_number_ranpotion == 3) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, Mth.nextInt(RandomSource.create(), 60, 180), 0, true, true));
			} else if (TrademineItemRandomModVariables.MapVariables.get(world).random_number_ranpotion == 4) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 0, 4), true, true));
			} else if (TrademineItemRandomModVariables.MapVariables.get(world).random_number_ranpotion == 5) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, Mth.nextInt(RandomSource.create(), 60, 180), Mth.nextInt(RandomSource.create(), 0, 3), true, true));
			} else if (TrademineItemRandomModVariables.MapVariables.get(world).random_number_ranpotion == 6) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.POISON, Mth.nextInt(RandomSource.create(), 60, 180), 0, true, true));
			}
		}
	}
}