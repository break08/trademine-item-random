package net.mcreator.trademineitemrandom.recipe.brewing;

import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;
import net.neoforged.neoforge.common.brewing.IBrewingRecipe;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

import net.mcreator.trademineitemrandom.init.TrademineItemRandomModPotions;
import net.mcreator.trademineitemrandom.init.TrademineItemRandomModItems;

@EventBusSubscriber
public class RecipePotionOfInfestedItemBrewingRecipe implements IBrewingRecipe {
	@SubscribeEvent
	public static void init(RegisterBrewingRecipesEvent event) {
		event.getBuilder().addRecipe(new RecipePotionOfInfestedItemBrewingRecipe());
	}

	@Override
	public boolean isInput(ItemStack input) {
		return Ingredient.of(TrademineItemRandomModItems.POTION_OF_RANDOM.get()).test(input);
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return Ingredient.of(TrademineItemRandomModItems.RAINBOW_DYE.get()).test(ingredient);
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return PotionContents.createItemStack(Items.POTION, TrademineItemRandomModPotions.POTION_OF_INFESTED_ITEM);
		}
		return ItemStack.EMPTY;
	}
}