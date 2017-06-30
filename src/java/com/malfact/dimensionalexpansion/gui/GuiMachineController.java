package com.malfact.dimensionalexpansion.gui;

import com.malfact.dimensionalexpansion.guicontainer.ContainerMachineController;
import com.malfact.dimensionalexpansion.tileentity.TileEntityMachineBase;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.IInventory;

public class GuiMachineController extends GuiContainer{

	public GuiMachineController(IInventory playerInventory, TileEntityMachineBase tileEntity) {
		super(new ContainerMachineController(playerInventory, tileEntity));
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
		// TODO Auto-generated method stub
		
	}

}
