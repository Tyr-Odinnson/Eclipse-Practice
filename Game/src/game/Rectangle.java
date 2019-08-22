package game;

public class Rectangle extends Shape {
	
	protected int width;
	protected int height;
	
	public Rectangle() {
		this.name = "rectangle";
	}
	
	public Rectangle(int w, int h) {
		this();
		this.width = w;
		this.height = h;
	}
	
	@Override
	public void setSurface() {
		this.surface = width*height;
	}
	
	@Override
	public void setPerimeter() {
		this.perimeter = 2*(width + height);
	}
	
	@Override
	public String toString() {
		String shape = "";
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				shape += "*";
			}
			shape += "\n";
		}
		return shape;
	}

}
