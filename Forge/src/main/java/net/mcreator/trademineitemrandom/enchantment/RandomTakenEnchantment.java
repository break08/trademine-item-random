package net.mcreator.trademineitemrandom.enchantment;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

public class RandomTakenEnchantment extends Enchantment {
	private static final EnchantmentCategory ENCHANTMENT_CATEGORY = EnchantmentCategory.create("trademine_item_random_forge_random_taken",
			item -> Ingredient.of(new ItemStack(Items.IRON_SWORD), new ItemStack(Items.GOLDEN_SWORD), new ItemStack(Items.DIAMOND_SWORD), new ItemStack(Items.NETHERITE_SWORD), new ItemStack(Blocks.AIR)).test(new ItemStack(item)));

	public RandomTakenEnchantment() {
		super(Enchantment.Rarity.COMMON, ENCHANTMENT_CATEGORY, EquipmentSlot.values());
	}

	@Override
	public int getMinCost(int level) {
		return 1 + level * 10;
	}

	@Override
	public int getMaxCost(int level) {
		return 6 + level * 10;
	}
}