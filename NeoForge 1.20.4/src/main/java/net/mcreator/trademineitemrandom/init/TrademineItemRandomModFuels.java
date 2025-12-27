/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trademineitemrandom.init;

import net.neoforged.neoforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class TrademineItemRandomModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == TrademineItemRandomModItems.RAINBOW_DYE.get())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == TrademineItemRandomModItems.ANY_MINERALS.get())
			event.setBurnTime(2000);
	}
}