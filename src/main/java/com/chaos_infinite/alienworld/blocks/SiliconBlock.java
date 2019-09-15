package com.chaos_infinite.alienworld.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SiliconBlock extends BlockBase{

	
	public SiliconBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.GLASS);
		setHardness(2.0f);
		setResistance(5.0f);
		setHarvestLevel("any", 0);
		setLightLevel(0.5f);
		setLightOpacity(0);
		
	}
}
