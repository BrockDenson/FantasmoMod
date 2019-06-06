package com.brockstar.fantasmomod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModBlocks.FANTASMO_ORE, new ItemStack(ModItems.FANTASMO_INGOT, 1), 1.0f);
		GameRegistry.addSmelting(ModBlocks.VINTREAMO_ORE, new ItemStack(ModItems.VINTREAMO_INGOT, 1), 1.0f);
		GameRegistry.addSmelting(ModBlocks.AURAMO_ORE, new ItemStack(ModItems.AURAMO_INGOT, 1), 0.7f);
	}
}
