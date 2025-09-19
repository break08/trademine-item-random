package net.mcreator.trademineitemrandom.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class CreativeCheckProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof Player _plr ? _plr.getAbilities().instabuild : false) {
			return true;
		}
		return false;
	}
}