package roboguy99.foodTech.common.tile.prefab;

public class TileMachine extends Tile
{
    int bufferSize;
    int energyPerTick;
    String desc;

    public TileMachine()
    {
        //Used for item metadata
        this.bufferSize = 0;
        this.energyPerTick = 0;
        this.desc = "";
    }

    public void setDesc(String desc)
    {
    	this.desc = desc;
    }
    
    public void setBufferSize(int bufferSize)
    {
    	this.bufferSize = bufferSize;
    }
    
    public void setEnergyPerTick(int energyPerTick)
    {
    	this.energyPerTick = energyPerTick;
    }
    
    public String getDesc()
    {
    	return this.desc;
    }
    
    public int getBufferSize()
    {
    	return this.bufferSize;
    }
    
    public int getEnergyPerTick()
    {
    	return this.energyPerTick;
    }
}