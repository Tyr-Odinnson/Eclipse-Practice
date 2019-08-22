package game;

public class Triangle extends Shape {
	
	protected int height;
	
	public Triangle() {
		this.name = "Triangle";
	}
	
	public Triangle(int n) {
		this();
		this.height = n;
		this.setPerimeter();
		this.setSurface();
	}
	

	@Override
	public void setSurface() {
		this.surface = 0.5 * height*(2*height -1);
	}
	
	@Override
	public void setPerimeter() {
		this.perimeter = (2 * height - 1) + (2*height - 3);
//		   *
//		  ***
//		 *****
//		*******
	}
	@Override
	public String toString() {
		String shape = "";
		for (int i = 0; i <= height; i++) {
			for (int j = 0; j < height - i; j++) {
				shape += " ";
			}
			for (int j = 0; j < 2*i - 1; j++) {
				shape += "*";
			}
			
			shape += "\n";
		}
		return shape;
	}

}
