/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trademineitemrandom.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.trademineitemrandom.client.renderer.RandomnessHostileRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TrademineItemRandomModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TrademineItemRandomModEntities.RANDOMNESS_HOSTILE.get(), RandomnessHostileRenderer::new);
		event.registerEntityRenderer(TrademineItemRandomModEntities.SPLASH_POTIONS_OF_RANDOM.get(), ThrownItemRenderer::new);
	}
}