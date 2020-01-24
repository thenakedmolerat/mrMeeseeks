public abstract class Mammal extends Animal
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

	public Mammal()
	{
		super(0, 0, 0, "None");
		this.fur = false;
		this.order = "None";
		this.claws = false;
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
		return super.toString() + "Does it have fur?: " + this.fur 
		+ "The order is: " + this.order + "Does it have claws?: " + this.claws;

	}

}