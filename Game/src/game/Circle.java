package game;

public class Circle extends Shape {
	
	private int radius;
	public Circle() {
		this.name = "Circle";
	}
	
	public Circle(int radius) {
		this();
		this.radius = radius;
	}

	@Override
	public void setSurface() {
		this.surface = Math.PI * radius * radius;
	}

	@Override
	public void setPerimeter() {
		this.perimeter = 2 * Math.PI * radius;

	}
	@Override
	public String toString() {
		String shape = "";
		for (int i = 0; i <= 2 * radius; i++) {
			for (int j = 0; j <=2 * radius; j++) {
				int xSquared = (i - radius)*(i-radius);
				int ySquared = (j - radius)*(j-radius);
				double distance = Math.sqrt(xSquared + ySquared);
				if((int)Math.sqrt(xSquared + ySquared - radius*radius)< radius) {
					shape += "**";
				} else {
					shape +="  ";
				}
			}
			shape += "\n";
		}
		return shape;
	}

}
