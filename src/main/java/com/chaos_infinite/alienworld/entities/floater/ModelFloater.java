//Made with Blockbench
//Paste this code into your mod.

package com.chaos_infinite.alienworld.entities.floater;

import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelFloater extends ModelBase {
	private final ModelRenderer CentralBlock;
	private final ModelRenderer Teeth;
	private final ModelRenderer Tail;

	public ModelFloater () {
		textureWidth = 16;
		textureHeight = 16;

		CentralBlock = new ModelRenderer(this);
		CentralBlock.setRotationPoint(0.0F, 24.0F, 0.0F);
		CentralBlock.cubeList.add(new ModelBox(CentralBlock, 0, 0, -6.0F, -13.0F, -4.0F, 3, 5, 8, 0.0F, false));
		CentralBlock.cubeList.add(new ModelBox(CentralBlock, 0, 0, -7.0F, -12.0F, -3.0F, 3, 3, 6, 0.0F, false));
		CentralBlock.cubeList.add(new ModelBox(CentralBlock, 0, 0, -3.0F, -12.0F, -3.0F, 1, 3, 6, 0.0F, false));

		Teeth = new ModelRenderer(this);
		Teeth.setRotationPoint(0.0F, 24.0F, 0.0F);
		Teeth.cubeList.add(new ModelBox(Teeth, 0, 0, -8.0F, -10.0F, 2.0F, 1, 1, 1, 0.0F, false));
		Teeth.cubeList.add(new ModelBox(Teeth, 0, 0, -8.0F, -10.0F, -1.0F, 1, 1, 2, 0.0F, false));
		Teeth.cubeList.add(new ModelBox(Teeth, 0, 0, -8.0F, -10.0F, -3.0F, 1, 1, 1, 0.0F, false));
		Teeth.cubeList.add(new ModelBox(Teeth, 0, 0, -8.0F, -12.0F, -1.0F, 1, 1, 2, 0.0F, false));
		Teeth.cubeList.add(new ModelBox(Teeth, 0, 0, -8.0F, -12.0F, 2.0F, 1, 1, 1, 0.0F, false));
		Teeth.cubeList.add(new ModelBox(Teeth, 0, 0, -8.0F, -12.0F, -3.0F, 1, 1, 1, 0.0F, false));

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 24.0F, 0.0F);
		Tail.cubeList.add(new ModelBox(Tail, 0, 0, -2.0F, -13.0F, -4.0F, 3, 5, 8, 0.0F, false));
		Tail.cubeList.add(new ModelBox(Tail, 0, 0, 1.0F, -11.0F, -2.0F, 1, 2, 4, 0.0F, false));
		Tail.cubeList.add(new ModelBox(Tail, 0, 0, 2.0F, -12.0F, -3.0F, 2, 4, 6, 0.0F, false));
		Tail.cubeList.add(new ModelBox(Tail, 0, 0, 4.0F, -11.0F, -2.0F, 2, 2, 4, 0.0F, false));
		Tail.cubeList.add(new ModelBox(Tail, 0, 0, 6.0F, -10.0F, -2.0F, 1, 1, 4, 0.0F, false));
		Tail.cubeList.add(new ModelBox(Tail, 0, 0, 7.0F, -10.0F, -1.0F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		CentralBlock.render(f5);
		Teeth.render(f5);
		Tail.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}