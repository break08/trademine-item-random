/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.trademineitemrandom.init;

import net.neoforged.neoforge.event.village.WandererTradesEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@EventBusSubscriber
public class TrademineItemRandomModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Blocks.BIRCH_WOOD, 12), new ItemStack(TrademineItemRandomModBlocks.ORE_OF_RANDOMNESS.get(), 5), 10, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(TrademineItemRandomModBlocks.ORE_OF_RANDOMNESS.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(TrademineItemRandomModBlocks.ORE_OF_RANDOMNESS.get()), new ItemStack(Items.EMERALD, 3), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(TrademineItemRandomModBlocks.ORE_OF_RANDOMNESS.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(TrademineItemRandomModBlocks.ORE_OF_RANDOMNESS.get()), new ItemStack(Items.EMERALD, 3), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(TrademineItemRandomModBlocks.ORE_OF_RANDOMNESS.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(TrademineItemRandomModBlocks.ORE_OF_RANDOMNESS.get()), new ItemStack(Items.EMERALD), 10, 5, 0.05f));
		}
	}
}