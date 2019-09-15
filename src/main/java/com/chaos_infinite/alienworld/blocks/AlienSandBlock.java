package com.chaos_infinite.alienworld.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AlienSandBlock extends  BlockBase {

	
	public AlienSandBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.SAND);
		setHardness(0.7f);
		setResistance(2.5f);
		setHarvestLevel("shovel", 0);
		
	}
	
}
