package net.mcreator.trademineitemrandom.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

public class RandomnessHostileItIsStruckByLightningProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		ItemStack helmet = ItemStack.EMPTY;
		ItemStack chest = ItemStack.EMPTY;
		ItemStack legging = ItemStack.EMPTY;
		ItemStack boots = ItemStack.EMPTY;
		ItemStack sword = ItemStack.EMPTY;
		ItemStack offhand = ItemStack.EMPTY;
		helmet = new ItemStack(Items.NETHERITE_HELMET).copy();
		chest = new ItemStack(Items.NETHERITE_CHESTPLATE).copy();
		legging = new ItemStack(Items.NETHERITE_LEGGINGS).copy();
		sword = new ItemStack(Items.NETHERITE_SWORD).copy();
		offhand = new ItemStack(Items.TOTEM_OF_UNDYING).copy();
		helmet.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 1);
		chest.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 1);
		legging.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 1);
		boots.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 1);
		sword.enchant(Enchantments.SHARPNESS, 1);
		sword.enchant(Enchantments.KNOCKBACK, 1);
		sword.enchant(Enchantments.FIRE_ASPECT, 2);
		if (entity instanceof LivingEntity _entity) {
			ItemStack _setstack = sword.copy();
			_setstack.setCount(1);
			_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
			if (_entity instanceof Player _player)
				_player.getInventory().setChanged();
		}
		if (entity instanceof LivingEntity _entity) {
			ItemStack _setstack = offhand.copy();
			_setstack.setCount(1);
			_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
			if (_entity instanceof Player _player)
				_player.getInventory().setChanged();
		}
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(3, helmet);
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.HEAD, helmet);
			}
		}
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(2, chest);
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.CHEST, chest);
			}
		}
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(1, legging);
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.LEGS, legging);
			}
		}
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(0, boots);
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.FEET, boots);
			}
		}
	}
}