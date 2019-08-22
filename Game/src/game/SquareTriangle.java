package game;

public class SquareTriangle extends Triangle {
	private int width;

	public  SquareTriangle() {
		this.name = "Square Triangle";
	}
	
	public SquareTriangle(int w, int h) {
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
			for (int j = 0; j < i; j++) {
				shape += "*";
			}
			shape += "\n";
		}
		return shape;
	}

}
