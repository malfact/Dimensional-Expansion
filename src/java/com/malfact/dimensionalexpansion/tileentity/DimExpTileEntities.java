package com.malfact.dimensionalexpansion.tileentity;

import cpw.mods.fml.common.registry.GameRegistry;

public class DimExpTileEntities {
	
	public static void init() {
        GameRegistry.registerTileEntity(TileEntityMachineBase.class, "portal_emitter_tile_entity");
        
    }
	
}
