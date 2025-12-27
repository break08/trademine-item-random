/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trademineitemrandom.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.mcreator.trademineitemrandom.TrademineItemRandomMod;

public class TrademineItemRandomModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, TrademineItemRandomMod.MODID);
	public static final DeferredHolder<Potion, Potion> POTION_OF_INFESTED_ITEM = REGISTRY.register("potion_of_infested_item", () -> new Potion(new MobEffectInstance(TrademineItemRandomModMobEffects.INFESTED_ITEM.get(), 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> POTION_OF_INFESTED_MOB = REGISTRY.register("potion_of_infested_mob", () -> new Potion(new MobEffectInstance(TrademineItemRandomModMobEffects.INFESTED_MOB.get(), 6000, 0, false, true)));
}