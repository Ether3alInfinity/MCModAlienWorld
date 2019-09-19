package com.chaos_infinite.alienworld;

import com.chaos_infinite.alienworld.entities.floater.EntityFloater;
import com.chaos_infinite.alienworld.entities.floater.ModelFloater;
import com.chaos_infinite.alienworld.entities.floater.RenderFloater;
import com.chaos_infinite.alienworld.proxy.CommonProxy;
import com.chaos_infinite.alienworld.util.Reference;
import com.chaos_infinite.alienworld.util.handlers.RegistryHandler;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityFloater.class, 
			      new RenderFloater(new ModelFloater(), 0.5F));
		EntityRegistry.registerModEntity(new ResourceLocation("awm: name") ,EntityFloater.class, "Floater", 0, instance, 80, 3, true, 250, 0);
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
}
