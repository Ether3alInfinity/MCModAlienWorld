package com.chaos_infinite.alienworld.init;

import java.util.ArrayList;
import java.util.List;

import com.chaos_infinite.alienworld.blocks.BlockBase;
import com.chaos_infinite.alienworld.blocks.GoopBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block GOOP_BLOCK = new GoopBlock("goop_block", Material.CLAY);
	
}
