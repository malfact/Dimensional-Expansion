package com.malfact.dimensionalexpansion.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DimExpBlocks {
	
	public static Block portalController;
	
	public static final void init(){
		GameRegistry.registerBlock(portalController = new BlockMachineBase("portalController", Material.iron), "portalController");
	}
}
