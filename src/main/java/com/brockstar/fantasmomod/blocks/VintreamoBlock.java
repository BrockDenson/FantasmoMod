package com.brockstar.fantasmomod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class VintreamoBlock extends BlockBase 
{

	public VintreamoBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(4.0F);
		setResistance(25.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.0F);
	}

}
