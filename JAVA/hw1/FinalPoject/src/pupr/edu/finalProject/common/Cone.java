package pupr.edu.finalProject.common;

public class Cone implements SurfaceArea, Volume {
	private double height; //The cone's height.
	private double radius; //The cone's radius.
	private double area; //The cone's area.
	private double volume; //The cone's volume.
//Setters:
	public void setHeight(double height) {
		this.height = height;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
//Getters:
	public double getHeight() {
		return height;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return area;
	}
	public double getVolume() {
		return volume;
	}
//Interface Methods:
	@Override
	public void calculateArea() {
		area = Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2)+Math.pow(radius, 2)));
	}
	@Override
	public void calculateVolume() {
		//This formula only applies to right circular cones.
		volume = Math.PI * Math.pow(radius, 2) * (height / 3);
	}
}
