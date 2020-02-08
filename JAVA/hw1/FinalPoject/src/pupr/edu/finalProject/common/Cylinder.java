package edu.pupr.final_proyect.views;

public class Cylinder implements SurfaceArea, Volume {
	private double height; //The height of the cylinder.
	private double radius; //The radius of the cylinder.
	private double area; //The area of the cylinder.
	private double volume; //The volume of the cylinder.
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
	public void calculateVolume() {	
		volume = Math.PI * Math.pow(radius, 2) * height;
	}
	@Override
	public void calculateArea() {
		area = 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius,  2);
	}
}
