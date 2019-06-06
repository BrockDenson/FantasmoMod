package com.brockstar.fantasmomod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AuramoBlock extends BlockBase 
{

	public AuramoBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(3.5F);
		setResistance(20.0F);
		setHarvestLevel("pickaxe", 1);
	}

}
