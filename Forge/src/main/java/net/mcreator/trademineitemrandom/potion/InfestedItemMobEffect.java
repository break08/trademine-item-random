package net.mcreator.trademineitemrandom.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class InfestedItemMobEffect extends MobEffect {
	public InfestedItemMobEffect() {
		super(MobEffectCategory.NEUTRAL, -65536);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}