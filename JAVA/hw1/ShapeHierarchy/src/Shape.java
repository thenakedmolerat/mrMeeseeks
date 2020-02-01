
public class Shape
{
	public double length;
	public double width;
	
	public Shape(double aLength, double aWidth)
	{
		this.length = aLength;
		this.width = aWidth;
		
	}
	
	public double getLength()
	{
		return this.length;
	}
	
	public double getWidth()
	{
		return this.width;
	}
	
	@Override
	public String toString()
	{
		return "Length: " + this.length + "  Width: " + this.width;
	}
	
}
