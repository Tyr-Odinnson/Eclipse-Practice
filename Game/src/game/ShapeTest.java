package game;

import java.util.HashMap;
import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		
		HashMap<String, String> qas = new Quiz(GameLevel.EASY).getQas();
				for (String question : qas.keySet()){
					System.out.println(question);
				}
		Scanner scanner = new Scanner(System.in);
		String uinput = scanner.nextLine();
		
		if (uinput.equalsIgnoreCase(qas.values().toArray()[0].toString())) {
			System.out.println("Congrats!");
		} else {
			System.out.println("Loser!!!! You Suck!");
		}
	}

}
