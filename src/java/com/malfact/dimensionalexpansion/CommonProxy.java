package com.malfact.dimensionalexpansion;

import com.malfact.dimensionalexpansion.block.DimExpBlocks;
import com.malfact.dimensionalexpansion.tileentity.DimExpTileEntities;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent e){
		//Test Commit ;)
	}
	
	public void init(FMLInitializationEvent e){
		DimExpBlocks.init();
		DimExpTileEntities.init();
	}
	
	public void postInit(FMLPostInitializationEvent e){
		
	}
}
