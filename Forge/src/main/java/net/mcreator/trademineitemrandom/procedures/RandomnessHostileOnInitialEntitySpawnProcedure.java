package net.mcreator.trademineitemrandom.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class RandomnessHostileOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double random_inventory = 0;
		double random_offhand = 0;
		double random_helmet = 0;
		double random_chestplate = 0;
		double random_leg_armor = 0;
		double random_boots = 0;
		if (Math.random() < 0.25 && (world.getLevelData().isRaining() || world.getLevelData().isThundering())) {
			random_inventory = Mth.nextInt(RandomSource.create(), 1, 10);
			random_offhand = Mth.nextInt(RandomSource.create(), 1, 4);
			random_helmet = Mth.nextInt(RandomSource.create(), 1, 6);
			random_chestplate = Mth.nextInt(RandomSource.create(), 1, 6);
			random_leg_armor = Mth.nextInt(RandomSource.create(), 1, 6);
			random_boots = Mth.nextInt(RandomSource.create(), 1, 6);
			if (random_inventory == 1) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.STONE_SWORD).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (random_inventory == 2) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.IRON_SWORD).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (random_inventory == 3) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GOLDEN_SWORD).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (random_inventory == 4) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.DIAMOND_SWORD).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (random_inventory == 5) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.STONE_AXE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (random_inventory == 6) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.IRON_SHOVEL).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (random_inventory == 7) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (random_inventory == 8) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GOLDEN_AXE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (random_inventory == 9) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.WOODEN_HOE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
			if (random_offhand == 1) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.TOTEM_OF_UNDYING).copy();
					_setstack.setCount(2);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (random_offhand == 2) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.SHIELD).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (random_offhand == 3) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Blocks.BARRIER).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
			if (random_helmet == 1) {
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(103, new ItemStack(Items.GOLDEN_HELMET));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, 103), new ItemStack(Items.GOLDEN_HELMET));
					}
				}
			} else if (random_helmet == 2) {
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(103, new ItemStack(Items.LEATHER_HELMET));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, 103), new ItemStack(Items.LEATHER_HELMET));
					}
				}
			} else if (random_helmet == 3) {
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(103, new ItemStack(Items.IRON_HELMET));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, 103), new ItemStack(Items.IRON_HELMET));
					}
				}
			} else if (random_helmet == 4) {
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(103, new ItemStack(Items.DIAMOND_HELMET));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, 103), new ItemStack(Items.DIAMOND_HELMET));
					}
				}
			} else if (random_helmet == 5) {
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(103, new ItemStack(Items.CHAINMAIL_HELMET));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, 103), new ItemStack(Items.CHAINMAIL_HELMET));
					}
				}
			}
			if (random_chestplate == 1) {
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(102, new ItemStack(Items.LEATHER_CHESTPLATE));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, 102), new ItemStack(Items.LEATHER_CHESTPLATE));
					}
				}
			} else if (random_chestplate == 2) {
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(102, new ItemStack(Items.CHAINMAIL_CHESTPLATE));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, 102), new ItemStack(Items.CHAINMAIL_CHESTPLATE));
					}
				}
			} else if (random_chestplate == 3) {
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(102, new ItemStack(Items.IRON_CHESTPLATE));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, 102), new ItemStack(Items.IRON_CHESTPLATE));
					}
				}
			} else if (random_chestplate == 4) {
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(102, new ItemStack(Items.GOLDEN_CHESTPLATE));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, 102), new ItemStack(Items.GOLDEN_CHESTPLATE));
					}
				}
			} else if (random_chestplate == 5) {
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(102, new ItemStack(Items.DIAMOND_CHESTPLATE));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, 102), new ItemStack(Items.DIAMOND_CHESTPLATE));
					}
				}
			}
			if (random_leg_armor == 1) {
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(101, new ItemStack(Items.LEATHER_LEGGINGS));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, 101), new ItemStack(Items.LEATHER_LEGGINGS));
					}
				}
			} else if (random_leg_armor == 2) {
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(101, new ItemStack(Items.CHAINMAIL_LEGGINGS));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, 101), new ItemStack(Items.CHAINMAIL_LEGGINGS));
					}
				}
			} else if (random_leg_armor == 3) {
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(101, new ItemStack(Items.IRON_LEGGINGS));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, 101), new ItemStack(Items.IRON_LEGGINGS));
					}
				}
			} else if (random_leg_armor == 4) {
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(101, new ItemStack(Items.GOLDEN_LEGGINGS));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, 101), new ItemStack(Items.GOLDEN_LEGGINGS));
					}
				}
			} else if (random_leg_armor == 5) {
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(101, new ItemStack(Items.DIAMOND_LEGGINGS));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, 101), new ItemStack(Items.DIAMOND_LEGGINGS));
					}
				}
			}
			if (random_boots == 1) {
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(100, new ItemStack(Items.LEATHER_BOOTS));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, 100), new ItemStack(Items.LEATHER_BOOTS));
					}
				}
			} else if (random_boots == 2) {
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(100, new ItemStack(Items.CHAINMAIL_BOOTS));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, 100), new ItemStack(Items.CHAINMAIL_BOOTS));
					}
				}
			} else if (random_boots == 3) {
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(100, new ItemStack(Items.IRON_BOOTS));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, 100), new ItemStack(Items.IRON_BOOTS));
					}
				}
			} else if (random_boots == 4) {
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(100, new ItemStack(Items.GOLDEN_BOOTS));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, 100), new ItemStack(Items.GOLDEN_BOOTS));
					}
				}
			} else if (random_boots == 5) {
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(100, new ItemStack(Items.DIAMOND_BOOTS));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, 100), new ItemStack(Items.DIAMOND_BOOTS));
					}
				}
			}
		}
	}
}