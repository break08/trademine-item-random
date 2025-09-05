package net.mcreator.trademineitemrandom.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AnyFoodItem extends Item {
	public AnyFoodItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}