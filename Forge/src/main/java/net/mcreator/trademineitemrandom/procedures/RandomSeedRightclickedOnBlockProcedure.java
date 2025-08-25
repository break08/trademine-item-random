package net.mcreator.trademineitemrandom.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.trademineitemrandom.init.TrademineItemRandomForgeModItems;
import net.mcreator.trademineitemrandom.init.TrademineItemRandomForgeModBlocks;

public class RandomSeedRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack random_seeds = ItemStack.EMPTY;
		BlockState stage0 = Blocks.AIR.defaultBlockState();
		random_seeds = new ItemStack(TrademineItemRandomForgeModItems.RANDOM_SEED.get()).copy();
		stage0 = TrademineItemRandomForgeModBlocks.RANDOM_CROP_STAGE_0.get().defaultBlockState();
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == random_seeds.getItem()
				&& (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FARMLAND && ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.CAVE_AIR || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.VOID_AIR)
				&& stage0.canSurvive(world, BlockPos.containing(x, y + 1, z))) {
			world.setBlock(BlockPos.containing(x, y + 1, z), stage0, 3);
			if (!(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).copy();
					_setstack.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		}
	}
}