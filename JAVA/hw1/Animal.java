

public abstract class Animal
{
	

	protected double weight;
	protected int legs;
	protected double height;
	protected String color;

	public Animal(double aWeight, int aLegs, double aHeight, String aColor)
	{
		this.weight = aWeight;
		this.legs = aLegs;
		this.height = aHeight;
		this.color = aColor;
	}


	public double getWeight()
	{
		return this.weight;
	}

	public int getLegs()
	{
		return this.legs;
	}

	public String getColor()
	{
		return this.color;
	}

	
	public String toString()
	{
		return "Weight: " + this.weight + " Height: " + this.height
		+ " Color: " + this.color;
	}

}