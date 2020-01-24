

public abstract class Animal implements AnimalInterface
{
	

	protected double weight;
	protected int legs;
	protected double height;
	protected String color;
	public static int animalCount = 0;

	public Animal(double aWeight, int aLegs, double aHeight, String aColor)
	{
		this.weight = aWeight;
		this.legs = aLegs;
		this.height = aHeight;
		this.color = aColor;
		animalCount++;
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

	@Override
	public String toString()
	{
		return "Weight: " + this.weight + " Height: " + this.height
		+ " Color: " + this.color;
	}

}