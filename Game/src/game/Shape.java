package game;

public abstract class Shape {
	protected double perimeter;
	protected double surface;
	protected String name;
	
	public String getName() {
		return name;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public double getSurface() {
		return surface;
	}
	
	public abstract void setSurface();
	public abstract void setPerimeter();

}
