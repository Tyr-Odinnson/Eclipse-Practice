package simpleGame;

import java.util.Scanner;

public class SimpleSumGame {
	//Todo 1: Declare 2 numbers
	private int number1;
	private int number2;
	
	//Todo 2: Declare the sum (answer)
	private int answer;
	
	//Todo 3: Declare relevant questions (messages)
	private String welcomeMessage = "Welcome to my game!";
	private String questionMessage = "What is the sum of the two numbers ";
	private String correctMessage = "You are so smart!";
	private String wrongMessage = "You are so...'wrong' >_>";
	
	//Todo 4: Generate game methods
	public String sayWelcomeMessage() {
		return welcomeMessage;
	}
	
	public String askQuestion() {
		return questionMessage;
	}
	
	public String sayCongrats() {
		return correctMessage;
	}
	
	public String sayBadWords() {
		return wrongMessage;
	}
	
	public void play(int n1, int n2) {
		//Procedure: prepare question and answer
		number1 = n1;
		number2 = n2;
		answer = number1 + number2;
		//Display welcome message
		System.out.println(welcomeMessage);
		
		//Get user input and compare
		System.out.println(askQuestion() + number1 + " and " + number2 + "?");
		Scanner scanner = new Scanner(System.in);
		int userAnswer = scanner.nextInt();
		
		//Print the result
		
		if(userAnswer == answer) {
			System.out.println(sayCongrats());
		} else {
			System.out.println(sayBadWords());
		}
		
	}
	
	public static void main(String[] args) {
		//Create a new game
		SimpleSumGame aGame = new SimpleSumGame();
		
		//and play it
		aGame.play(7, 21);
	}

}
