/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trademineitemrandom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;

import net.mcreator.trademineitemrandom.block.entity.RandomTraderBlockEntity;
import net.mcreator.trademineitemrandom.block.entity.RandomCropStage5BlockEntity;
import net.mcreator.trademineitemrandom.block.entity.RandomCropStage4BlockEntity;
import net.mcreator.trademineitemrandom.block.entity.RandomCropStage3BlockEntity;
import net.mcreator.trademineitemrandom.block.entity.RandomCropStage2BlockEntity;
import net.mcreator.trademineitemrandom.block.entity.RandomCropStage1BlockEntity;
import net.mcreator.trademineitemrandom.block.entity.RandomCropStage0BlockEntity;
import net.mcreator.trademineitemrandom.TrademineItemRandomMod;

public class TrademineItemRandomModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TrademineItemRandomMod.MODID);
	public static final RegistryObject<BlockEntityType<RandomCropStage0BlockEntity>> RANDOM_CROP_STAGE_0 = register("random_crop_stage_0", TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_0, RandomCropStage0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<RandomCropStage1BlockEntity>> RANDOM_CROP_STAGE_1 = register("random_crop_stage_1", TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_1, RandomCropStage1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<RandomCropStage2BlockEntity>> RANDOM_CROP_STAGE_2 = register("random_crop_stage_2", TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_2, RandomCropStage2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<RandomCropStage3BlockEntity>> RANDOM_CROP_STAGE_3 = register("random_crop_stage_3", TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_3, RandomCropStage3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<RandomCropStage4BlockEntity>> RANDOM_CROP_STAGE_4 = register("random_crop_stage_4", TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_4, RandomCropStage4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<RandomCropStage5BlockEntity>> RANDOM_CROP_STAGE_5 = register("random_crop_stage_5", TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_5, RandomCropStage5BlockEntity::new);
	public static final RegistryObject<BlockEntityType<RandomTraderBlockEntity>> RANDOM_TRADER = register("random_trader", TrademineItemRandomModBlocks.RANDOM_TRADER, RandomTraderBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> RegistryObject<BlockEntityType<T>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}