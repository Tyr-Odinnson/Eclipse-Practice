package cs105;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int guessNumber = random.nextInt(100);
		int numberOfTries = 0;
		Scanner input = new Scanner(System.in);
		int guess;
		
		boolean win = false;
		
		while (win == false) {
		
			System.out.println("Guess a number between 1 and 100! ");
			guess = input.nextInt();
			numberOfTries++;
		
			if (guess == guessNumber) {
				win = true;
			}
			else if (guess < guessNumber) {
				System.out.println("Your guess is too low!");
			}
			else if (guess > guessNumber) { 
				System.out.println("Your guess is too high!");
			
			}
		}
		System.out.println("You win!");
		System.out.println("The number was " + guessNumber);
		System.out.println("It took you " + numberOfTries + " tries!");
		
	}

}
