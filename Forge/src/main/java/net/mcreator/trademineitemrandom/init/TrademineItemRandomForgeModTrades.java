/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.trademineitemrandom.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class TrademineItemRandomForgeModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Blocks.BIRCH_WOOD, 12),

				new ItemStack(TrademineItemRandomForgeModBlocks.ORE_OF_RANDOMNESS.get(), 5), 10, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(TrademineItemRandomForgeModBlocks.ORE_OF_RANDOMNESS.get()), 8, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(TrademineItemRandomForgeModItems.ANY_MINERALS.get(), 2), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(TrademineItemRandomForgeModBlocks.ORE_OF_RANDOMNESS.get()), 8, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(TrademineItemRandomForgeModItems.ANY_MINERALS.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(TrademineItemRandomForgeModBlocks.ORE_OF_RANDOMNESS.get()), 8, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4),

					new ItemStack(TrademineItemRandomForgeModItems.ANY_ARMOR_TRIM.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(TrademineItemRandomForgeModItems.POTION_OF_RANDOM.get(), 3), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(TrademineItemRandomForgeModItems.RAINBOW_DYE.get(), 3), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(TrademineItemRandomForgeModItems.ANY_FOOD.get()), 10, 5, 0.05f));
		}
	}
}