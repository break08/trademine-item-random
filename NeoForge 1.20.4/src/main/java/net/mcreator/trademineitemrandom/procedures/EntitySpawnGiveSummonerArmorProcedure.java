package net.mcreator.trademineitemrandom.procedures;

import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.trademineitemrandom.init.TrademineItemRandomModItems;
import net.mcreator.trademineitemrandom.TrademineItemRandomMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EntitySpawnGiveSummonerArmorProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TrademineItemRandomMod.queueServerWork(1, () -> {
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("minecraft:give_summoner_helmet"))) && Math.random() <= 0.08) {
				if (entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(TrademineItemRandomModItems.SUMMONER_ARMOR_HELMET.get()));
				}
			} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("minecraft:skeleton_give_shelmet"))) && Math.random() <= 0.05) {
				if (entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(TrademineItemRandomModItems.SUMMONER_ARMOR_HELMET.get()));
				}
			}
		});
	}
}