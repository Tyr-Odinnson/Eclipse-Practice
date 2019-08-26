package cs105.w4.s1;

import java.util.Scanner;

public class MarvelTest {

	public static void main(String[] args) {
		//TODO 1: create a spiderman obj normally
		Spiderman spiderman = new Spiderman();
		//TODO 2: create 2nd spiderman obj with Spider declaration
		Spider incyWincy = new Spiderman(); 
		//TODO 3: create 3rd spiderman obj with Human declaration
		Human peterParker = new Spiderman();
		//Check type of the 1st spiderman using instanceof operator
		if(spiderman instanceof Spider) {
			System.out.println("Yes, Im a spider");
		} 
		
//		if(Spider.class.isAssignableFrom(Scanner.class)) {
//			System.out.println("Yes, Im a Scanner");
//		} 

	}

}
