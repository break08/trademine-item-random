package net.mcreator.trademineitemrandom.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.trademineitemrandom.init.TrademineItemRandomModMenus;
import net.mcreator.trademineitemrandom.init.TrademineItemRandomModItems;

public class RTGUIProcdureProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TrademineItemRandomModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.EGG
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TrademineItemRandomModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(1).getItem() : ItemStack.EMPTY)
						.getItem() == TrademineItemRandomModItems.RAINBOW_DYE.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof TrademineItemRandomModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof TrademineItemRandomModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
						new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(ResourceLocation.parse("minecraft:all_spawn_egg"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))));
				entityToSpawn.setPickUpDelay(1);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TrademineItemRandomModMenus.MenuAccessor _menu11 ? _menu11.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.NETHER_WART.asItem()
				&& new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof Player player && player.containerMenu instanceof TrademineItemRandomModMenus.MenuAccessor _menu) {
							ItemStack stack = _menu.getSlots().get(sltid).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(0) == 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TrademineItemRandomModMenus.MenuAccessor _menu14 ? _menu14.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.WATER_BUCKET) {
			if (entity instanceof Player _player && _player.containerMenu instanceof TrademineItemRandomModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(2);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof TrademineItemRandomModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.BUCKET));
				entityToSpawn.setPickUpDelay(1);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TrademineItemRandomModMenus.MenuAccessor _menu22 ? _menu22.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.GOLD_INGOT
				&& new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof Player player && player.containerMenu instanceof TrademineItemRandomModMenus.MenuAccessor _menu) {
							ItemStack stack = _menu.getSlots().get(sltid).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(0) == 5
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TrademineItemRandomModMenus.MenuAccessor _menu25 ? _menu25.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.BOOK) {
			if (entity instanceof Player _player && _player.containerMenu instanceof TrademineItemRandomModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(5);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof TrademineItemRandomModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(1);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (!(entity instanceof ServerPlayer _plr29 && _plr29.level() instanceof ServerLevel
				&& _plr29.getAdvancements().getOrStartProgress(_plr29.server.getAdvancements().getAdvancement(ResourceLocation.parse("trademine_item_random:trader_machine"))).isDone())) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(ResourceLocation.parse("trademine_item_random:trader_machine"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
	}
}