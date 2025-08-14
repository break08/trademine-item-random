/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trademineitemrandom.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.trademineitemrandom.block.OreOfRandomnessBlock;
import net.mcreator.trademineitemrandom.block.NetherOreOfRandomnessBlock;
import net.mcreator.trademineitemrandom.block.FlowerOfRandomnessBlock;
import net.mcreator.trademineitemrandom.block.DeepslateOreOfRandomnessBlock;
import net.mcreator.trademineitemrandom.TrademineItemRandomMod;

import java.util.function.Function;

public class TrademineItemRandomModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(TrademineItemRandomMod.MODID);
	public static final DeferredBlock<Block> ORE_OF_RANDOMNESS = register("ore_of_randomness", OreOfRandomnessBlock::new);
	public static final DeferredBlock<Block> DEEPSLATE_ORE_OF_RANDOMNESS = register("deepslate_ore_of_randomness", DeepslateOreOfRandomnessBlock::new);
	public static final DeferredBlock<Block> NETHER_ORE_OF_RANDOMNESS = register("nether_ore_of_randomness", NetherOreOfRandomnessBlock::new);
	public static final DeferredBlock<Block> FLOWER_OF_RANDOMNESS = register("flower_of_randomness", FlowerOfRandomnessBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}