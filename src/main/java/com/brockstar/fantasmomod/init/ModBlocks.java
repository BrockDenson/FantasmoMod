package com.brockstar.fantasmomod.init;

import java.util.ArrayList;
import java.util.List;

import com.brockstar.fantasmomod.blocks.AuramoOre;
import com.brockstar.fantasmomod.blocks.BlockBase;
import com.brockstar.fantasmomod.blocks.FantasmoBlock;
import com.brockstar.fantasmomod.blocks.FantasmoOre;
import com.brockstar.fantasmomod.blocks.VintreamoBlock;
import com.brockstar.fantasmomod.blocks.VintreamoOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block FANTASMO_BLOCK = new FantasmoBlock("fantasmo_block", Material.IRON);
	public static final Block AURAMO_BLOCK = new BlockBase("auramo_block", Material.IRON);
	public static final Block VINTREAMO_BLOCK = new VintreamoBlock("vintreamo_block", Material.IRON);
	public static final Block FANTASMO_ORE = new FantasmoOre("fantasmo_ore", Material.ROCK);
	public static final Block AURAMO_ORE = new AuramoOre("auramo_ore", Material.ROCK);
	public static final Block VINTREAMO_ORE = new VintreamoOre("vintreamo_ore", Material.ROCK);
	
}
