package net.mcreator.trademineitemrandom.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.trademineitemrandom.procedures.PotionOfRandomPlayerFinishesUsingItemProcedure;

public class PotionOfRandomItem extends Item {
	public PotionOfRandomItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public ItemUseAnimation getUseAnimation(ItemStack itemstack) {
		return ItemUseAnimation.DRINK;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		PotionOfRandomPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}