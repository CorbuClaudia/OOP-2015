package javasmmr.zoowsome.models.animals;


public class Aquatic extends Animal 
{
	private int avgSwimDepth;
	private TypesOfWater typeOfWater;
	
	public void setAvgSwimDepth (int avg) 
	{
		this.avgSwimDepth = avg;
	}
	public int getAvgSwimDepth(){
		return avgSwimDepth;
	}
	
	public TypesOfWater getTypeOfWater() 
	{
		return typeOfWater;
	}
	public void setTypeOfWater(TypesOfWater typeOfWater) 
	{
		this.typeOfWater = typeOfWater;
	}
}
