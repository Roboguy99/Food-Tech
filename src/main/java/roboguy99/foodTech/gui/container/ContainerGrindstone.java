package roboguy99.foodTech.gui.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import roboguy99.foodTech.tileEntities.TileEntityGrindstone;

public class ContainerGrindstone extends Container
{
	public TileEntityGrindstone grindstone;
	
	public ContainerGrindstone(InventoryPlayer inventoryPlayer, TileEntityGrindstone grindstone)
	{
		this.grindstone = grindstone;
		
		this.addSlotToContainer(new Slot(grindstone, 0, 56, 17));
		this.addSlotToContainer(new Slot(grindstone, 1, 56, 53));
		this.addSlotToContainer(new Slot(grindstone, 2, 116, 35));
		
		for(int i = 0; i < 3; i++) //Create the inventory slots
		{
			for(int j = 0; j < 9; j++)
			{
				this.addSlotToContainer(new Slot(inventoryPlayer, 9+j+i*9, 8+j*18, 84+18*i));
			}
		}
		
		for(int i = 0; i < 9; i++) //Create the hotbar slots
		{
			this.addSlotToContainer(new Slot(inventoryPlayer, i, 8+18*i, 142));
		}
	}
	
	public boolean canInteractWith(EntityPlayer player) 
	{
		return true;
	}
	
}
