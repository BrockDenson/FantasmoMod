package com.brockstar.fantasmomod.init;

import java.util.ArrayList;
import java.util.List;

import com.brockstar.fantasmomod.items.ItemBase;
import com.brockstar.fantasmomod.items.tools.ToolAxe;
import com.brockstar.fantasmomod.items.tools.ToolHoe;
import com.brockstar.fantasmomod.items.tools.ToolPickaxe;
import com.brockstar.fantasmomod.items.tools.ToolSpade;
import com.brockstar.fantasmomod.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_FANTASMO_INGOT = EnumHelper.addToolMaterial("material_fantasmo_ingot", 3, 2000, 8.5F, 3.5F, 15);
	public static final ToolMaterial MATERIAL_VINTREAMO_INGOT = EnumHelper.addToolMaterial("vintreamo_ingot", 2, 100, 12.5F, 0.5F, 25);
	public static final ToolMaterial MATERIAL_AURAMO_INGOT = EnumHelper.addToolMaterial("material_auramo_ingot", 2, 500, 6.5F, 2.5F, 18);
	
	//Items
	public static final Item FANTASMO_STICK = new ItemBase("fantasmo_stick");
	public static final Item VINTREAMO_STICK = new ItemBase("vintreamo_stick");
	public static final Item AURAMO_STICK = new ItemBase("auramo_stick");
	public static final Item FANTASMO_FEATHER = new ItemBase("fantasmo_feather");
	public static final Item FANTASMO_FLINT = new ItemBase("fantasmo_flint");
	public static final Item FANTASMO_INGOT = new ItemBase("fantasmo_ingot");
	public static final Item FANTASMO_DUST = new ItemBase("fantasmo_dust");
	public static final Item VINTREAMO_INGOT = new ItemBase("vintreamo_ingot");
	public static final Item VINTREAMO_DUST = new ItemBase("vintreamo_dust");
	public static final Item AURAMO_INGOT = new ItemBase("auramo_ingot");
	public static final Item AURAMO_DUST = new ItemBase("auramo_dust");
	
	//Tools
	public static final ItemSword FANTASMO_SWORD = new ToolSword("fantasmo_sword", MATERIAL_FANTASMO_INGOT);
	public static final ItemSword VINTREAMO_SWORD = new ToolSword("vintreamo_sword", MATERIAL_VINTREAMO_INGOT);
	public static final ItemSword AURAMO_SWORD = new ToolSword("auramo_sword", MATERIAL_AURAMO_INGOT);
	public static final ItemSpade FANTASMO_SHOVEL = new ToolSpade("fantasmo_shovel", MATERIAL_FANTASMO_INGOT);
	public static final ItemSpade VINTREAMO_SHOVEL = new ToolSpade("vintreamo_shovel", MATERIAL_VINTREAMO_INGOT);
	public static final ItemSpade AURAMO_SHOVEL = new ToolSpade("auramo_shovel", MATERIAL_AURAMO_INGOT);
	public static final ItemPickaxe FANTASMO_PICKAXE = new ToolPickaxe("fantasmo_pickaxe", MATERIAL_FANTASMO_INGOT);
	public static final ItemPickaxe VINTREAMO_PICKAXE = new ToolPickaxe("vintreamo_pickaxe", MATERIAL_VINTREAMO_INGOT);
	public static final ItemPickaxe AURAMO_PICKAXE = new ToolPickaxe("auramo_pickaxe", MATERIAL_AURAMO_INGOT);
	public static final ItemAxe FANTASMO_AXE = new ToolAxe("fantasmo_axe", MATERIAL_FANTASMO_INGOT);
	public static final ItemAxe VINTREAMO_AXE = new ToolAxe("vintreamo_axe", MATERIAL_VINTREAMO_INGOT);
	public static final ItemAxe AURAMO_AXE = new ToolAxe("auramo_axe", MATERIAL_AURAMO_INGOT);
	public static final ItemHoe FANTASMO_HOE = new ToolHoe("fantasmo_hoe", MATERIAL_FANTASMO_INGOT);
	public static final ItemHoe VINTREAMO_HOE = new ToolHoe("vintreamo_hoe", MATERIAL_VINTREAMO_INGOT);
	public static final ItemHoe AURAMO_HOE = new ToolHoe("auramo_hoe", MATERIAL_AURAMO_INGOT);

}
