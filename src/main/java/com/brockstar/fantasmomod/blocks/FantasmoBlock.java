package com.brockstar.fantasmomod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class FantasmoBlock extends BlockBase 
{

	public FantasmoBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.5F);
	}

}
