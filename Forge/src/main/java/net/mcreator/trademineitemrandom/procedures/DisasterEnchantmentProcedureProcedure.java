package net.mcreator.trademineitemrandom.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.trademineitemrandom.init.TrademineItemRandomForgeModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DisasterEnchantmentProcedureProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getSource(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, DamageSource damagesource, Entity entity, Entity sourceentity) {
		execute(null, world, damagesource, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, DamageSource damagesource, Entity entity, Entity sourceentity) {
		if (damagesource == null || entity == null || sourceentity == null)
			return;
		double disaster_id = 0;
		double bad_effect_id = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (damagesource.is(TagKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("minecraft:damage_arrow_check"))) && !(sourceentity == null)) {
			if (EnchantmentHelper.getItemEnchantmentLevel(TrademineItemRandomForgeModEnchantments.DISASTER.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
				disaster_id = Mth.nextInt(RandomSource.create(), 1, 3);
				if (disaster_id == 1) {
					bad_effect_id = Mth.nextInt(RandomSource.create(), 1, 5);
					if (disaster_id == 1) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 140, 0, false, true));
					} else if (disaster_id == 2) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1200, 1, false, true));
					} else if (disaster_id == 3) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.HARM, 140, 1, false, true));
					} else if (disaster_id == 4) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 140, 0, false, true));
					} else if (disaster_id == 5) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 140, 0, false, true));
					}
				} else if (disaster_id == 2) {
					sx = -2;
					for (int index0 = 0; index0 < 4; index0++) {
						sy = -2;
						for (int index1 = 0; index1 < 4; index1++) {
							sz = -2;
							for (int index2 = 0; index2 < 4; index2++) {
								world.setBlock(BlockPos.containing(sx, sy, sz), Blocks.COBWEB.defaultBlockState(), 3);
								sz = sz + 1;
							}
							sy = sy + 1;
						}
						sx = sx + 1;
					}
				} else if (disaster_id == 3) {
					entity.setSecondsOnFire(8);
				}
			}
		}
	}
}