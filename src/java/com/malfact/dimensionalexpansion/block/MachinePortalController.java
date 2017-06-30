package com.malfact.dimensionalexpansion.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class MachinePortalController extends BlockMachineBase{

	public IIcon[] icons = new IIcon[6];
	
	public MachinePortalController(String unlocalizedName, Material material) {
		super(unlocalizedName, material);
	}

	@Override
	public void registerBlockIcons(IIconRegister reg) {
		this.icons[0] = reg.registerIcon(this.textureName + "_bottom");
		this.icons[1] = reg.registerIcon(this.textureName + "_top");
		this.icons[2] = reg.registerIcon(this.textureName + "_side");
		this.icons[3] = reg.registerIcon(this.textureName + "_side");
		this.icons[4] = reg.registerIcon(this.textureName + "_side");
		this.icons[5] = reg.registerIcon(this.textureName + "_side");
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
	    return this.icons[side];
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int metaData, float sideX, float sideY, float sideZ) {
		
		findSecondaryEmitters(world, x, y, z, player);
		return true;
	}
	
	public void findSecondaryEmitters(World world, int x, int y, int z, EntityPlayer player){
		for (int i = 1; i <= 2; i++){
			if (!world.isAirBlock(x, y+i, z)){
				player.addChatComponentMessage(new ChatComponentText("Portal Blocked"));
				return;
			}
		}
		player.addChatComponentMessage(new ChatComponentText("Portal Opened"));
		world.setBlock(x, y+1, z, Block.getBlockFromName("cobblestone"));
		world.setBlock(x, y+2, z, Block.getBlockFromName("cobblestone"));
	}
}
