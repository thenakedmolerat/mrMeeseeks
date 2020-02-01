public class threeDimensionalShape extends Shape
{
	private double depth

	public threeDimensionalShape(double aLength, double aWeight, double aDepth)
	{
		super(aLength, aWidth);
		this.depth = aDepth;
	}

	public abstract double getArea();
	public abstract double getVolume();

}