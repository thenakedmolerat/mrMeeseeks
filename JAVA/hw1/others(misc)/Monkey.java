public class Monkey extends Mammal
{
	private String size;

	public Monkey(double aWeight, double aHeight, String aColor, String aSize)
	{
		super(aWeight, 2, aHeight, aColor, true, "Primates", false);
		this.size = aSize;
	}

	public String getSize()
	{
		return this.size;
	}

	public void setSize(String aSize)
	{
		this.size = aSize;
	}

	public String toString()
	{
		return this.toString() + "The size of the monkey is: " + this.getSize();
	}
}