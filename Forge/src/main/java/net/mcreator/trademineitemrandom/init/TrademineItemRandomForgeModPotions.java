/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trademineitemrandom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.trademineitemrandom.TrademineItemRandomForgeMod;

public class TrademineItemRandomForgeModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, TrademineItemRandomForgeMod.MODID);
	public static final RegistryObject<Potion> POTION_OF_INFESTED_ITEM = REGISTRY.register("potion_of_infested_item", () -> new Potion(new MobEffectInstance(TrademineItemRandomForgeModMobEffects.INFESTED_ITEM.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> POTION_OF_INFESTED_MOB = REGISTRY.register("potion_of_infested_mob", () -> new Potion(new MobEffectInstance(TrademineItemRandomForgeModMobEffects.INFESTED_MOB.get(), 6000, 0, false, true)));
}