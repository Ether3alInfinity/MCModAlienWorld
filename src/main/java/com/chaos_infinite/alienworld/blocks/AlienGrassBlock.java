package com.chaos_infinite.alienworld.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AlienGrassBlock extends BlockBase{

	public AlienGrassBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.PLANT);
		setHardness(0.5f);
		setResistance(2.5f);
		setHarvestLevel("shovel", 0);
		//overlay in model file does not work right
	}
}
