package net.mcreator.trademineitemrandom.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class AnyMineralsRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 90) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(ResourceLocation.parse("minecraft:normal_minerals"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			if (Math.random() < 80) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.DIAMOND).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.NETHERITE_SCRAP).copy();
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
	}
}