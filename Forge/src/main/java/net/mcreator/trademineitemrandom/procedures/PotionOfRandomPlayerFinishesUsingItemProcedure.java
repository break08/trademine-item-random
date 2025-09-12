package net.mcreator.trademineitemrandom.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.trademineitemrandom.init.TrademineItemRandomForgeModItems;

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
				ItemStack _stktoremove = new ItemStack(TrademineItemRandomForgeModItems.POTION_OF_RANDOM.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}