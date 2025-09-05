package net.mcreator.trademineitemrandom.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AnyMineralsItem extends Item {
	public AnyMineralsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}