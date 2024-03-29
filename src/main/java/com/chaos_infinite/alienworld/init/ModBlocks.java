package com.chaos_infinite.alienworld.init;

import java.util.ArrayList;
import java.util.List;

import com.chaos_infinite.alienworld.blocks.AlienGrassBlock;
import com.chaos_infinite.alienworld.blocks.AlienSandBlock;
import com.chaos_infinite.alienworld.blocks.BlockBase;
import com.chaos_infinite.alienworld.blocks.GoopBlock;
import com.chaos_infinite.alienworld.blocks.SiliconBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block GOOP_BLOCK = new GoopBlock("goop_block", Material.CLAY);
	public static final Block ALIEN_SAND = new AlienSandBlock("alien_sand", Material.SAND);
	public static final Block SILICON_BLOCK = new SiliconBlock("silicon_block", Material.GLASS);
	public static final Block ALIEN_GRASS = new AlienGrassBlock("alien_grass", Material.GRASS);
	
}
