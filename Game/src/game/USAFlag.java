package game;

public class USAFlag extends Rectangle {
	
	public USAFlag() {
		this.name = "USA Flag";
	}
	
	public USAFlag(int width, int height) {
		super(width, height);
		this.name = "USA Flag";
	}
	
	@Override
	public String toString() {
		String shape = "";
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(((i< 9*height/15 && j < 12*width/46 )?
					(((i+j)%2==0 && j != 12*width/46 - 1)?"*":" "):"=" )
						+(j==width-1?"\n":""));
			}
		}
		return shape;
	}

}
