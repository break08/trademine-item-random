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
import net.minecraft.util.Mth;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.trademineitemrandom.init.TrademineItemRandomModMenus;
import net.mcreator.trademineitemrandom.init.TrademineItemRandomModItems;

public class RTGUIProcdureProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		String command_give = "";
		String enchant_level = "";
		double random_runner = 0;
		double enchant_level_chooser = 0;
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
				}.getAmount(0) >= 5
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TrademineItemRandomModMenus.MenuAccessor _menu14 ? _menu14.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.WATER_BUCKET) {
			if (entity instanceof Player _player && _player.containerMenu instanceof TrademineItemRandomModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(2);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof TrademineItemRandomModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			random_runner = Mth.nextInt(RandomSource.create(), 1, 8);
			if (random_runner == 1) {
				command_give = "minecraft:potion{Potion:\"minecraft:swiftness\"}";
			} else if (random_runner == 2) {
				command_give = "minecraft:potion{Potion:\"minecraft:water_breathing\"}";
			} else if (random_runner == 3) {
				command_give = "minecraft:potion{Potion:\"minecraft:leaping\"}";
			} else if (random_runner == 4) {
				command_give = "minecraft:potion{Potion:\"minecraft:poison\"}";
			} else if (random_runner == 5) {
				command_give = "minecraft:potion{Potion:\"minecraft:regeneration\"}";
			} else if (random_runner == 6) {
				command_give = "minecraft:potion{Potion:\"minecraft:fire_resistance\"}";
			} else if (random_runner == 7) {
				command_give = "minecraft:potion{Potion:\"minecraft:night_vision\"}";
			} else if (random_runner == 8) {
				command_give = "minecraft:potion{Potion:\"minecraft:strength\"}";
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), ("give" + " " + entity.getDisplayName().getString() + " " + command_give));
				}
			}
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.BUCKET));
				entityToSpawn.setPickUpDelay(1);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TrademineItemRandomModMenus.MenuAccessor _menu25 ? _menu25.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.GOLD_INGOT
				&& new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof Player player && player.containerMenu instanceof TrademineItemRandomModMenus.MenuAccessor _menu) {
							ItemStack stack = _menu.getSlots().get(sltid).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(0) >= 7
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TrademineItemRandomModMenus.MenuAccessor _menu28 ? _menu28.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.BOOK) {
			if (entity instanceof Player _player && _player.containerMenu instanceof TrademineItemRandomModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(7);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof TrademineItemRandomModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			random_runner = Mth.nextInt(RandomSource.create(), 1, 8);
			enchant_level_chooser = Mth.nextInt(RandomSource.create(), 1, 3);
			if (random_runner == 1) {
				command_give = "id:\"minecraft:sharpness\",";
			} else if (random_runner == 2) {
				command_give = "id:\"minecraft:knockback\",";
			} else if (random_runner == 3) {
				command_give = "id:\"minecraft:efficiency\",";
			} else if (random_runner == 4) {
				command_give = "id:\"minecraft:looting\",";
			} else if (random_runner == 5) {
				command_give = "id:\"minecraft:fire_aspect\",";
			} else if (random_runner == 6) {
				command_give = "id:\"minecraft:fortune\",";
			} else if (random_runner == 7) {
				command_give = "id:\"minecraft:protection\",";
			} else if (random_runner == 8) {
				command_give = "id:\"minecraft:frost_walker\",";
			}
			if (enchant_level_chooser == 1) {
				enchant_level = "lvl:1";
			} else if (enchant_level_chooser == 2) {
				enchant_level = "lvl:2";
			} else if (enchant_level_chooser == 3) {
				enchant_level = "lvl:3";
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands()
							.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
									_ent.getDisplayName(), _ent.level().getServer(), _ent),
									("give" + " " + entity.getDisplayName().getString() + " " + "minecraft:enchanted_book" + "{" + "StoredEnchantments:" + "[{" + command_give + enchant_level + "}]" + "}"));
				}
			}
		}
		if (!(entity instanceof ServerPlayer _plr36 && _plr36.level() instanceof ServerLevel
				&& _plr36.getAdvancements().getOrStartProgress(_plr36.server.getAdvancements().getAdvancement(ResourceLocation.parse("trademine_item_random:trader_machine"))).isDone())) {
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