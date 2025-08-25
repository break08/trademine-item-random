package net.mcreator.trademineitemrandom.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.trademineitemrandom.entity.RandomnessHostileEntity;

public class RandomnessHostileRenderer extends HumanoidMobRenderer<RandomnessHostileEntity, HumanoidModel<RandomnessHostileEntity>> {
	public RandomnessHostileRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<RandomnessHostileEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(RandomnessHostileEntity entity) {
		return ResourceLocation.parse("trademine_item_random_forge:textures/entities/randomness_hostile.png");
	}
}