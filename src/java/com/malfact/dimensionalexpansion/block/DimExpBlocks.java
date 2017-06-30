package com.malfact.dimensionalexpansion.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DimExpBlocks {
	
	public static Block portalController;
	public static Block portalEmitter;
	
	public static final void init(){
		GameRegistry.registerBlock(portalController = new MachinePortalController("portalController", Material.iron), "portalController");
		GameRegistry.registerBlock(portalEmitter = new BlockMachineBase("portalEmitter", Material.iron), "portalEmitter");
	}
}
