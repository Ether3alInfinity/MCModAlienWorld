package com.chaos_infinite.alienworld.entities.floater;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderFloater extends RenderLiving
{
    protected ResourceLocation FloaterTexture;

    public RenderFloater(ModelBase par1ModelBase, float parShadowSize)
    {
        super(Minecraft.getMinecraft().getRenderManager(), par1ModelBase, parShadowSize);
        setEntityTexture();        
    }
 
    @Override
    protected void preRenderCallback(EntityLivingBase entity, float f)
    {
        preRenderCallbackFloater((EntityFloater) entity, f);
    }
  
    protected void preRenderCallbackFloater(EntityFloater entity, float f)
    {
        // some people do some G11 transformations or blends here, like you can do
        // GL11.glScalef(2F, 2F, 2F); to scale up the entity
        // which is used for Slime entities.  I suggest having the entity cast to
        // your custom type to make it easier to access fields from your 
        // custom entity, eg. GL11.glScalef(entity.scaleFactor, entity.scaleFactor, 
        // entity.scaleFactor); 
    	GL11.glScalef(2.2F, 1.5F, 2.2F);
    }

    protected void setEntityTexture()
    {
        FloaterTexture = new ResourceLocation("awm:textures/entity/floater/floater.png");
    }

    /**
    * Returns the location of an entity's texture. Doesn't seem to be called 
    * unless you call Render.bindEntityTexture.
    */
    @Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return FloaterTexture;
    }
}
