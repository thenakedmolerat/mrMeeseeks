public class Cat extends Mammal
{
	

	private boolean whiskers;


	public Cat(double weight, double height,String color, boolean whiskers)
	{
		super(weight, 4, height, color, true, "Felines", true);
		this.whiskers = whiskers;

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
		return this.toString() + "Does it have whiskers?: " + this.whiskers;
	}
}