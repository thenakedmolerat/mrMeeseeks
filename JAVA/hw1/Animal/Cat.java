public class Cat extends Mammal
{
	

	private boolean whiskers;
	public static int catCounter;


	public Cat(double aWeight, double aHeight,String aColor, boolean aWhiskers)
	{
		super(aWeight, 4, aHeight, aColor, true, "Felines", true);
		this.whiskers = whiskers;
		catCounter++;
	}


	public boolean getWhiskers()
	{
		return this.whiskers;
	}

	public void changeColor(String color)
	{
		this.color = color;
	}

	@Override
	public String toString()
	{
		return super.toString() + "Does it have whiskers?: " + this.whiskers;
	}
}