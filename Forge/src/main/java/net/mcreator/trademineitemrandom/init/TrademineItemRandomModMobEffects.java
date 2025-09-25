/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trademineitemrandom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.trademineitemrandom.potion.InfestedMobMobEffect;
import net.mcreator.trademineitemrandom.potion.InfestedItemMobEffect;
import net.mcreator.trademineitemrandom.TrademineItemRandomMod;

public class TrademineItemRandomModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TrademineItemRandomMod.MODID);
	public static final RegistryObject<MobEffect> INFESTED_ITEM = REGISTRY.register("infested_item", () -> new InfestedItemMobEffect());
	public static final RegistryObject<MobEffect> INFESTED_MOB = REGISTRY.register("infested_mob", () -> new InfestedMobMobEffect());
}