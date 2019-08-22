package game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Quiz {
	
	private GameLevel level;
	private HashMap<String, String> qas;
	private ArrayList<Shape> shapes;
	private Random random;
	
	public Quiz(GameLevel level) {
		this.level = level;
		qas = new HashMap<String, String>();
		shapes = new ArrayList<Shape>();
		random = new Random();
		shapes.add(new Rectangle(5, 4));
		shapes.add(new USAFlag(46, 15));
		shapes.add(new Triangle(4));
		shapes.add(new Circle(6));
		
		generateQuestions();
	}
	
	public HashMap<String, String> getQas() {
		return qas;
	}
	
	public void generateQuestions() {
		int shapeIndex = random.nextInt(shapes.size());
		switch (level) {
		case EASY:
			qas.put("What is the name of the shape? \n" +
					shapes.get(shapeIndex)
					.toString(), shapes.get(shapeIndex).getName());
			
			break;
		case MEDIUM:
			qas.put("What is the perimeter of the shape? \n" +
					shapes.get(shapeIndex)
					.toString(), shapes.get(shapeIndex).getPerimeter()+ "");
			break;
		default:
			qas.put("What is the surface area of the shape?" + 
					shapes.get(shapeIndex)
					.toString(), shapes.get(shapeIndex).getSurface()+ "");
			break;
		}
	}
}
