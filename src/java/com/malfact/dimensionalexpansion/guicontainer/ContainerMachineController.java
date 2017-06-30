package com.malfact.dimensionalexpansion.guicontainer;

import com.malfact.dimensionalexpansion.tileentity.TileEntityMachineBase;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;

public class ContainerMachineController extends Container{

	private TileEntityMachineBase tileEntity;
	
	public ContainerMachineController(IInventory playerInv, TileEntityMachineBase tileEntity) {
        this.tileEntity = tileEntity;
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return this.tileEntity.isUseableByPlayer(player);
	}
	
}
