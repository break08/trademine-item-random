/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trademineitemrandom.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.core.registries.Registries;

import net.mcreator.trademineitemrandom.enchantment.RandomTakenEnchantment;
import net.mcreator.trademineitemrandom.enchantment.DisasterEnchantment;
import net.mcreator.trademineitemrandom.TrademineItemRandomMod;

public class TrademineItemRandomModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(Registries.ENCHANTMENT, TrademineItemRandomMod.MODID);
	public static final DeferredHolder<Enchantment, Enchantment> RANDOM_TAKEN = REGISTRY.register("random_taken", () -> new RandomTakenEnchantment());
	public static final DeferredHolder<Enchantment, Enchantment> DISASTER = REGISTRY.register("disaster", () -> new DisasterEnchantment());
}