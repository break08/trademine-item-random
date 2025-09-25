/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trademineitemrandom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.trademineitemrandom.enchantment.RandomTakenEnchantment;
import net.mcreator.trademineitemrandom.enchantment.DisasterEnchantment;
import net.mcreator.trademineitemrandom.TrademineItemRandomMod;

public class TrademineItemRandomModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, TrademineItemRandomMod.MODID);
	public static final RegistryObject<Enchantment> RANDOM_TAKEN = REGISTRY.register("random_taken", () -> new RandomTakenEnchantment());
	public static final RegistryObject<Enchantment> DISASTER = REGISTRY.register("disaster", () -> new DisasterEnchantment());
}