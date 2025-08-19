/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trademineitemrandom.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.trademineitemrandom.block.entity.RandomCropStage5BlockEntity;
import net.mcreator.trademineitemrandom.block.entity.RandomCropStage4BlockEntity;
import net.mcreator.trademineitemrandom.block.entity.RandomCropStage3BlockEntity;
import net.mcreator.trademineitemrandom.block.entity.RandomCropStage2BlockEntity;
import net.mcreator.trademineitemrandom.block.entity.RandomCropStage1BlockEntity;
import net.mcreator.trademineitemrandom.block.entity.RandomCropStage0BlockEntity;
import net.mcreator.trademineitemrandom.TrademineItemRandomMod;

@EventBusSubscriber
public class TrademineItemRandomModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, TrademineItemRandomMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RandomCropStage0BlockEntity>> RANDOM_CROP_STAGE_0 = register("random_crop_stage_0", TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_0, RandomCropStage0BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RandomCropStage1BlockEntity>> RANDOM_CROP_STAGE_1 = register("random_crop_stage_1", TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_1, RandomCropStage1BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RandomCropStage2BlockEntity>> RANDOM_CROP_STAGE_2 = register("random_crop_stage_2", TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_2, RandomCropStage2BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RandomCropStage3BlockEntity>> RANDOM_CROP_STAGE_3 = register("random_crop_stage_3", TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_3, RandomCropStage3BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RandomCropStage4BlockEntity>> RANDOM_CROP_STAGE_4 = register("random_crop_stage_4", TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_4, RandomCropStage4BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RandomCropStage5BlockEntity>> RANDOM_CROP_STAGE_5 = register("random_crop_stage_5", TrademineItemRandomModBlocks.RANDOM_CROP_STAGE_5, RandomCropStage5BlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> new BlockEntityType(supplier, block.get()));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RANDOM_CROP_STAGE_0.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RANDOM_CROP_STAGE_1.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RANDOM_CROP_STAGE_2.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RANDOM_CROP_STAGE_3.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RANDOM_CROP_STAGE_4.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RANDOM_CROP_STAGE_5.get(), SidedInvWrapper::new);
	}
}