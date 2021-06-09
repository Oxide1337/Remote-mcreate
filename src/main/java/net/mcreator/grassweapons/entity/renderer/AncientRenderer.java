package net.mcreator.grassweapons.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.grassweapons.entity.AncientEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AncientRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(AncientEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelhui(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("grass_weapons:textures/111.png");
					}
				};
			});
		}
	}

	// Made with Blockbench
	public static class Modelhui extends EntityModel<Entity> {
		ModelRenderer cube_0;
		ModelRenderer cube_1;
		ModelRenderer cube_2;
		ModelRenderer cube_3;
		ModelRenderer cube_4;
		ModelRenderer cube_5;
		ModelRenderer cube_6;
		ModelRenderer cube_7;
		ModelRenderer cube_8;
		ModelRenderer cube_9;
	ModelRenderer тело_10;
		ModelRenderer cube_11;
		ModelRenderer cube_12;
		ModelRenderer cube_13;
		ModelRenderer cube_14;
		ModelRenderer cube_15;
		ModelRenderer cube_16;
		ModelRenderer cube_17;
		ModelRenderer cube_18;
		ModelRenderer cube_19;
		ModelRenderer cube_20;
		ModelRenderer cube_21;
		ModelRenderer cube_22;
		ModelRenderer cube_23;
		ModelRenderer cube_24;
		ModelRenderer cube_25;
		ModelRenderer cube_26;
		ModelRenderer cube_27;
		ModelRenderer cube_28;
		ModelRenderer cube_29;
		ModelRenderer cube_30;
		ModelRenderer cube_31;
		ModelRenderer cube_32;
		ModelRenderer cube_33;
		ModelRenderer cube_34;
		ModelRenderer cube_35;
		ModelRenderer cube_36;
	public Modelhui() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.cube_0 = new ModelRenderer(this, 16, 23);
        this.cube_0.addBox(6.874999999999999F, 5F, 4.799999999999996F, 1, 1, 0, 1.0F);
        this.cube_0.setRotationPoint(-1.125F, 0F, -1.7000000000000002F);
        this.setRotateAngle(cube_0, 0F, 0F, 0F);
        this.cube_1 = new ModelRenderer(this, 11, 10);
        this.cube_1.addBox(0.3749999999999999F, 9F, 3.7999999999999963F, 2, 1, 1, 1.0F);
        this.cube_1.setRotationPoint(-1.125F, 0F, -1.4500000000000006F);
        this.setRotateAngle(cube_1, 0F, 0F, -45F);
        this.cube_2 = new ModelRenderer(this, 13, 25);
        this.cube_2.addBox(2.875F, 9.25F, 4.049999999999996F, 0, 0, 0, 1.0F);
        this.cube_2.setRotationPoint(-1.125F, 0F, -1.4500000000000006F);
        this.setRotateAngle(cube_2, 0F, 0F, -45F);
        this.cube_3 = new ModelRenderer(this, 16, 13);
        this.cube_3.addBox(6.624999999999999F, 6.75F, 3.7999999999999963F, 2, 1, 1, 1.0F);
        this.cube_3.setRotationPoint(-1.125F, 0F, -1.4500000000000006F);
        this.setRotateAngle(cube_3, 0F, 0F, -22.5F);
        this.cube_4 = new ModelRenderer(this, 11, 0);
        this.cube_4.addBox(0.3749999999999999F, 9F, 10.049999999999992F, 2, 1, 1, 1.0F);
        this.cube_4.setRotationPoint(-1.125F, 0F, 4.799999999999996F);
        this.setRotateAngle(cube_4, 0F, 0F, -45F);
        this.cube_5 = new ModelRenderer(this, 25, 7);
        this.cube_5.addBox(2.875F, 9.25F, 10.299999999999992F, 0, 0, 0, 1.0F);
        this.cube_5.setRotationPoint(-1.125F, 0F, 4.799999999999996F);
        this.setRotateAngle(cube_5, 0F, 0F, -45F);
        this.cube_6 = new ModelRenderer(this, 16, 12);
        this.cube_6.addBox(6.624999999999999F, 6.75F, 10.049999999999992F, 2, 1, 1, 1.0F);
        this.cube_6.setRotationPoint(-1.125F, 0F, 4.799999999999996F);
        this.setRotateAngle(cube_6, 0F, 0F, -22.5F);
        this.cube_7 = new ModelRenderer(this, 17, 3);
        this.cube_7.addBox(6.874999999999999F, 5F, 9.799999999999992F, 1, 1, 0, 1.0F);
        this.cube_7.setRotationPoint(-1.125F, 0F, -2.2F);
        this.setRotateAngle(cube_7, 0F, 0F, 0F);
        this.cube_8 = new ModelRenderer(this, 17, 0);
        this.cube_8.addBox(6.874999999999999F, 0F, 6.049999999999996F, 1, 2, 1, 1.0F);
        this.cube_8.setRotationPoint(-1.125F, 0F, -1.95F);
        this.setRotateAngle(cube_8, 0F, 0F, 0F);
        this.cube_9 = new ModelRenderer(this, 7, 17);
        this.cube_9.addBox(6.874999999999999F, 0F, 8.049999999999994F, 1, 2, 1, 1.0F);
        this.cube_9.setRotationPoint(-1.125F, 0F, -1.95F);
        this.setRotateAngle(cube_9, 0F, 0F, 0F);
        this.тело_10 = new ModelRenderer(this, 0, 8);
        this.тело_10.addBox(6.124999999999999F, 2.025F, 5.299999999999996F, 2, 4, 4, 1.0F);
        this.тело_10.setRotationPoint(-1.125F, 0F, -1.95F);
        this.setRotateAngle(тело_10, 0F, 0F, 0F);
        this.cube_11 = new ModelRenderer(this, 0, 25);
        this.cube_11.addBox(-0.375F, 10.75F, 6.799999999999991F, 1, 0, 1, 1.0F);
        this.cube_11.setRotationPoint(-1.125F, 0F, -1.95F);
        this.setRotateAngle(cube_11, 0F, 0F, -45F);
        this.cube_12 = new ModelRenderer(this, 19, 12);
        this.cube_12.addBox(3.624999999999999F, 8F, 6.799999999999991F, 1, 1, 1, 1.0F);
        this.cube_12.setRotationPoint(-1.125F, 0F, -1.95F);
        this.setRotateAngle(cube_12, 0F, 0F, -22.5F);
        this.cube_13 = new ModelRenderer(this, 14, 19);
        this.cube_13.addBox(7.624999999999998F, 6.5F, 6.799999999999991F, 1, 1, 1, 1.0F);
        this.cube_13.setRotationPoint(-1.125F, 0F, -1.95F);
        this.setRotateAngle(cube_13, 0F, 0F, 0F);
        this.cube_14 = new ModelRenderer(this, 24, 25);
        this.cube_14.addBox(5.374999999999999F, 9.25F, 6.299999999999996F, 1, 0, 2, 1.0F);
        this.cube_14.setRotationPoint(-1.125F, 0F, -1.95F);
        this.setRotateAngle(cube_14, 0F, 0F, -22.5F);
        this.cube_15 = new ModelRenderer(this, 1, 24);
        this.cube_15.addBox(7.699999999999997F, 6.575F, 9.849999999999993F, 0, 1, 1, 1.0F);
        this.cube_15.setRotationPoint(-1.125F, 0F, -1.95F);
        this.setRotateAngle(cube_15, 0F, 0F, -22.5F);
        this.cube_16 = new ModelRenderer(this, 24, 6);
        this.cube_16.addBox(7.699999999999997F, 6.575F, 3.5999999999999943F, 0, 1, 1, 1.0F);
        this.cube_16.setRotationPoint(-1.125F, 0F, -1.95F);
        this.setRotateAngle(cube_16, 0F, 0F, -22.5F);
        this.cube_17 = new ModelRenderer(this, 22, 6);
        this.cube_17.addBox(1.6250000000000004F, 8.85F, 9.924999999999992F, 0, 1, 1, 1.0F);
        this.cube_17.setRotationPoint(-1.125F, 0F, -1.95F);
        this.setRotateAngle(cube_17, 0F, 0F, -45F);
        this.cube_18 = new ModelRenderer(this, 8, 22);
        this.cube_18.addBox(1.725F, 8.85F, 3.5999999999999943F, 0, 1, 1, 1.0F);
        this.cube_18.setRotationPoint(-1.125F, 0F, -1.95F);
        this.setRotateAngle(cube_18, 0F, 0F, -45F);
        this.cube_19 = new ModelRenderer(this, 3, 15);
        this.cube_19.addBox(8.5F, 6.225F, 6.299999999999996F, 1, 1, 2, 1.0F);
        this.cube_19.setRotationPoint(-1.125F, 0F, -1.95F);
        this.setRotateAngle(cube_19, 0F, 0F, 0F);
        this.cube_20 = new ModelRenderer(this, 0, 20);
        this.cube_20.addBox(7.801120467488703F, 2.929329396543258F, 7.833949059323708F, 1, 1, 1, 1.0F);
        this.cube_20.setRotationPoint(8.78862046748871F, 4.791829396543265F, 8.346449059323712F);
        this.setRotateAngle(cube_20, 0F, 0F, 22.5F);
        this.cube_21 = new ModelRenderer(this, 25, 1);
        this.cube_21.addBox(8.5F, 4.424999999999997F, 5.524999999999998F, 0, 1, 0, 1.0F);
        this.cube_21.setRotationPoint(8.862499999999999F, 4.924999999999999F, 5.9874999999999945F);
        this.setRotateAngle(cube_21, -22.5F, 0F, 0F);
        this.cube_22 = new ModelRenderer(this, 22, 2);
        this.cube_22.addBox(7.974999999999997F, 2.4000000000000004F, 5.349999999999997F, 1, 1, 1, 1.0F);
        this.cube_22.setRotationPoint(8.574999999999998F, 3.2F, 6.199999999999997F);
        this.setRotateAngle(cube_22, 0F, 0F, 22.5F);
        this.cube_23 = new ModelRenderer(this, 8, 24);
        this.cube_23.addBox(8.225000000000001F, 3.6249999999999982F, 6.799999999999991F, 0, 1, 1, 1.0F);
        this.cube_23.setRotationPoint(8.600000000000001F, 4.200000000000003F, 7.424999999999989F);
        this.setRotateAngle(cube_23, 0F, 22.5F, 0F);
        this.cube_24 = new ModelRenderer(this, 17, 19);
        this.cube_24.addBox(5.876120467488704F, 4.929329396543258F, 5.833949059323712F, 1, 1, 1, 1.0F);
        this.cube_24.setRotationPoint(8.78862046748871F, 4.791829396543265F, 8.346449059323712F);
        this.setRotateAngle(cube_24, 0F, 0F, 22.5F);
        this.cube_25 = new ModelRenderer(this, 18, 0);
        this.cube_25.addBox(5.574999999999999F, 4.0749999999999975F, 7.049999999999987F, 1, 1, 1, 1.0F);
        this.cube_25.setRotationPoint(6.374999999999999F, 2.9499999999999993F, 6.5499999999999945F);
        this.setRotateAngle(cube_25, 22.5F, 0F, 0F);
        this.cube_26 = new ModelRenderer(this, 20, 22);
        this.cube_26.addBox(5.574999999999998F, 2.3499999999999988F, 5.749999999999997F, 1, 1, 1, 1.0F);
        this.cube_26.setRotationPoint(5.849999999999999F, 3.0124999999999993F, 6.524999999999994F);
        this.setRotateAngle(cube_26, 0F, 22.5F, 0F);
        this.cube_27 = new ModelRenderer(this, 15, 24);
        this.cube_27.addBox(5.725000000000015F, 2.0749999999999997F, 7.649999999999989F, 0, 1, 1, 1.0F);
        this.cube_27.setRotationPoint(5.975000000000013F, 2.650000000000004F, 8.274999999999991F);
        this.setRotateAngle(cube_27, 0F, -22.5F, 0F);
        this.cube_28 = new ModelRenderer(this, 23, 22);
        this.cube_28.addBox(6.500000000000004F, 5.399999999999999F, 8.499999999999993F, 1, 1, 1, 1.0F);
        this.cube_28.setRotationPoint(6.925000000000007F, 5.899999999999999F, 9.224999999999996F);
        this.setRotateAngle(cube_28, 0F, 0F, -22.5F);
        this.cube_29 = new ModelRenderer(this, 17, 8);
        this.cube_29.addBox(8.224999999999996F, 6.399999999999995F, 5.899999999999994F, 1, 1, 0, 1.0F);
        this.cube_29.setRotationPoint(8.724999999999996F, 7.699999999999999F, 6.249999999999992F);
        this.setRotateAngle(cube_29, 0F, 22.5F, 0F);
        this.cube_30 = new ModelRenderer(this, 8, 20);
        this.cube_30.addBox(5.50925421036992F, 2.0000000000000004F, 9.277792455435703F, 1, 1, 1, 1.0F);
        this.cube_30.setRotationPoint(6.3592542103699214F, 2.750000000000001F, 9.977792455435702F);
        this.setRotateAngle(cube_30, 0F, -45F, 0F);
        this.cube_31 = new ModelRenderer(this, 22, 22);
        this.cube_31.addBox(10.600000000000009F, 6.700000000000001F, 6.450000000000011F, 1, 1, 1, 1.0F);
        this.cube_31.setRotationPoint(10.375F, 7.637500000000004F, 8.275000000000004F);
        this.setRotateAngle(cube_31, 0F, -22.5F, 0F);
        this.cube_32 = new ModelRenderer(this, 2, 26);
        this.cube_32.addBox(7.062867965644041F, 0.9750000000000003F, 4.828858223313756F, 0, 0, 2, 1.0F);
        this.cube_32.setRotationPoint(7.16286796564404F, 1.125F, 6.278858223313759F);
        this.setRotateAngle(cube_32, 22.5F, 0F, 0F);
        this.cube_33 = new ModelRenderer(this, 3, 24);
        this.cube_33.addBox(6.194868244448613F, 1.0055834884694654F, 8.399999999999997F, 3, 0, 0, 1.0F);
        this.cube_33.setRotationPoint(8.094868244448614F, 1.1555834884694658F, 8.549999999999997F);
        this.setRotateAngle(cube_33, 0F, 0F, 22.5F);
        this.cube_34 = new ModelRenderer(this, 2, 16);
        this.cube_34.addBox(8.975000000000003F, 4.899999999999992F, 7.84999999999999F, 0, 4, 0, 1.0F);
        this.cube_34.setRotationPoint(9.175000000000004F, 7.39999999999999F, 7.549999999999989F);
        this.setRotateAngle(cube_34, -45F, 0F, 0F);
        this.cube_35 = new ModelRenderer(this, 24, 21);
        this.cube_35.addBox(5.375000000000003F, 0.8F, 6.349999999999995F, 2, 0, 0, 1.0F);
        this.cube_35.setRotationPoint(6.825000000000004F, 0.9500000000000002F, 6.449999999999993F);
        this.setRotateAngle(cube_35, 0F, 22.5F, 0F);
        this.cube_36 = new ModelRenderer(this, 18, 10);
        this.cube_36.addBox(4.9384728967237725F, 7.271833749591637F, 8.349999999999993F, 8, 0, 0, 1.0F);
        this.cube_36.setRotationPoint(9.338472896723781F, 7.646833749591639F, 8.27499999999999F);
        this.setRotateAngle(cube_36, 0F, 22.5F, 0F);
    }

	@Override
    public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
        this.cube_0.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_1.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_2.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_3.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_4.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_5.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_6.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_7.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_8.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_9.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.тело_10.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_11.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_12.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_13.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_14.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_15.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_16.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_17.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_18.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_19.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_20.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_21.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_22.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_23.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_24.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_25.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_26.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_27.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_28.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_29.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_30.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_31.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_32.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_33.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_34.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_35.render(ms, vb, i1, i2, f1, f2, f3, f4);
        this.cube_36.render(ms, vb, i1, i2, f1, f2, f3, f4);
    }

		public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
