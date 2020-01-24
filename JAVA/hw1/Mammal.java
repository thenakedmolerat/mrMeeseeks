public class Mammal extends Animal
{
	
	private boolean fur;
	private String order;
	private boolean claws;

	public Mammal(double aWeight, int aLegs, double aHeight,
	 String aColor, boolean aFur, String aOrder, boolean aClaws)
	{
		super(aWeight, aLegs, aHeight, aColor);
		this.fur = aFur;
		this.order = aOrder;
		this.claws = aClaws;
	}

	public boolean getFur()
	{
		return this.fur;
	}

	public String getOrder()
	{
		return this.order;
	}

	public boolean getClaws()
	{
		return this.claws;
	}

	public void setFur(boolean aFur)
	{
		this.fur = aFur;
	}

	@Override
	public String toString()
	{
		return this.toString() + "Does it have fur?: " + this.fur 
		+ "The order is: " + this.order + "Does it have claws?: " + this.claws;

	}

}