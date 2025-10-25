/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trademineitemrandom.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.trademineitemrandom.potion.InfestedMobMobEffect;
import net.mcreator.trademineitemrandom.potion.InfestedItemMobEffect;
import net.mcreator.trademineitemrandom.TrademineItemRandomMod;

public class TrademineItemRandomModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, TrademineItemRandomMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> INFESTED_ITEM = REGISTRY.register("infested_item", () -> new InfestedItemMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> INFESTED_MOB = REGISTRY.register("infested_mob", () -> new InfestedMobMobEffect());
}