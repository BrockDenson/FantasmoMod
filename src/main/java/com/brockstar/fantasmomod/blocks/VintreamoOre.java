package com.brockstar.fantasmomod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class VintreamoOre extends BlockBase 
{

	public VintreamoOre(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}

}
