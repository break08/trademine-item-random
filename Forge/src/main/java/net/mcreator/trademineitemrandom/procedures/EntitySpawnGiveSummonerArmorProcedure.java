package net.mcreator.trademineitemrandom.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
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
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("minecraft:give_summoner_helmet"))) && Math.random() <= 0.08) {
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(3, new ItemStack(TrademineItemRandomModItems.SUMMONER_ARMOR_HELMET.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(TrademineItemRandomModItems.SUMMONER_ARMOR_HELMET.get()));
					}
				}
			} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("minecraft:skeleton_give_shelmet"))) && Math.random() <= 0.05) {
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(3, new ItemStack(TrademineItemRandomModItems.SUMMONER_ARMOR_HELMET.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(TrademineItemRandomModItems.SUMMONER_ARMOR_HELMET.get()));
					}
				}
			}
		});
	}
}