public class Circle extends twoDimensionalShape
{
	public double radius

	public Circle(double aRadius)
	{
		this.radius = aRadius;
	}

	public void setRadius(double aRadius)
	{
		this.radius = aRadius;
	}

	public double getRadius()
	{
		return this.radius;
	}

	@Override
	public double getArea()
	{
		return Math.PI*Math.pow(getRadius(), 2);
	}
}