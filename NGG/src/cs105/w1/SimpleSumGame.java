package cs105.w1;

import java.util.Scanner;

public class SimpleSumGame {
	//TODO 1: declare 2 numbers
	private int number1;
	private int number2;
	//TODO 2:  declare the sum (answer)
	private int answer;
	//TODO 3: declare relevant questions (messages)
	private String welcomeMessage = "Welcome to my game!";
	private String questionMessage ="What is the sum of the two numbers?";
	private String correctMessage = "You are so smart!";
	private String wrongMessage = "You are so T__T!";
	//TODO 4: create game methods
	
	public String sayWelcomeMessage() {
		return welcomeMessage;
	}
	
	public String askAQuestion() {
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
		System.out.println(askAQuestion() + number1 + " and " + number2);
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
		//create a new game
		SimpleSumGame aGame = new SimpleSumGame();
		//and play it
		aGame.play(5, 7);

	}

}
