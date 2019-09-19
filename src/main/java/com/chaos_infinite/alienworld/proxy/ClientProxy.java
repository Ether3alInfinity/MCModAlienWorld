package com.chaos_infinite.alienworld.proxy;

import com.chaos_infinite.alienworld.entities.floater.EntityFloater;
import com.chaos_infinite.alienworld.entities.floater.ModelFloater;
import com.chaos_infinite.alienworld.entities.floater.RenderFloater;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	public void registerItemRenderer(Item item, int meta, String id) {
		
		ModelLoader.setCustomModelResourceLocation(
				item, meta, new ModelResourceLocation(item.getRegistryName(), id));
		
	}
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		//RenderingRegistry.registerEntityRenderingHandler(EntityFloater.class, 
		//	      new RenderFloater(new ModelFloater(), 0.5F));

	}
}
