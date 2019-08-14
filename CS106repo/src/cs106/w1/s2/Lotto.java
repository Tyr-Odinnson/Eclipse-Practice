package cs106.w1.s2;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	
	private int secretNumber;
	private int userInput;
	
	private String welcome = "Welcome to ....";
	private String goodbye = "Bye Felicia!";
	
	private String requestInput = "Please guess the winning number (1-5)";
	private String congrats = "Here is $100k. You can retire young!";
	private String tryAgain = "Your luck is coming! Just $1 more please!";
	
	public void sayWelcome() {
		System.out.println(welcome);
	}
	
	public void askForInput() {
		System.out.println(requestInput);
	}
	
	public void sayGoodBye() {
		System.out.println(goodbye);
	}
	
	public void sayCongrats() {
		System.out.println(congrats);
	}
	
	public void sayTryAgain() {
		System.out.println(tryAgain);
	}
	
	public void play() {
		//The loop
		Scanner scanner = new Scanner(System.in);
		userInput = scanner.nextInt();
		Random random = new Random();
		while(userInput > 0) {
			secretNumber = random.nextInt(4)+1;//random number 1->5
			if(userInput == secretNumber) {
				sayCongrats();
			}
			else {
				sayTryAgain();
			}
			askForInput();
			userInput = scanner.nextInt();
		}
		
		sayGoodBye();
		
	}
	
	

}
