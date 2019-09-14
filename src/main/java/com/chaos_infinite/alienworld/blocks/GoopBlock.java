package com.chaos_infinite.alienworld.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GoopBlock extends BlockBase {

	
	/**
	 * @param name
	 * @param material
	 */
	public GoopBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.SLIME);
		setHardness(0.0f);
		setResistance(0.0f);
		setHarvestLevel("any", 0);
		setLightLevel(5.0f);
		setLightOpacity(8);
		
	}
	
}
