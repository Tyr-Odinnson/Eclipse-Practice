package cs105.w2;

import java.util.Scanner;

public class ICEx5 {

	public static void main(String[] args) {
		//Create a scanner object
		Scanner sc = new Scanner(System.in);
		//Print out message to users
		System.out.println("Please enter a sentence: ");
		//Store user input as a string variable
		String userInput = sc.nextLine();
		if (userInput.contains("exit")) {//check if the input contains exit
			System.out.println("Bye!");
			
		}	else {
			System.out.println("String length: " + userInput.length());
		}
		
		
	}

}
