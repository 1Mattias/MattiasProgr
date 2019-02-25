package v8;

import java.util.Scanner;
import java.util.Random;

public class Gissatalet {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		int difficulty = 0;
		System.out.println("Type your desired guessing range( between 0 and X)");
		difficulty = Scanner.nextInt();
		
		
		Random Random = new Random();

		int numberToGuess = Random.nextInt(difficulty + 1);
		int numberOfTries = 0;
		int numberOfTriesTotal = 0;
		int games = 0;
		int guess;
		boolean win = false;
		boolean running = true;

		while (running) {

			System.out.println("Guess a number between 0 and " + difficulty);

			while (win == false) {
				guess = Scanner.nextInt();
				numberOfTries++;
				numberOfTriesTotal++;

				if (guess == numberToGuess) {
					win = true;
					games ++;
				} else if (guess < numberToGuess) {
					System.out.println("Your guess is too low");
				} else if (guess > numberToGuess) {
					System.out.println("Your guess is too high");
				}

			}
			System.out.println("You Have Won!");
			System.out.println("You guessed " + numberOfTries + " Times");
			System.out.println("You Have guessed " + numberOfTriesTotal + " Times In Total");
			
			System.out.println("");
			
			System.out.println("Press 1 if you would like to play again");
			System.out.println("Type 2 if you would like to quit");

			int choice = Scanner.nextInt();
			switch (choice) {
			case 1:
				win = false;
				numberToGuess = Random.nextInt(difficulty + 1);
				numberOfTries = 0;
				difficulty = 0;
				System.out.println("Type your desired guessing range(0 and X)");
				difficulty = Scanner.nextInt();
				break;
			case 2:
				System.out.println("Thanks for playing");
				System.out.println("Here are your final results:");
				System.out.println("You guessed " + numberOfTriesTotal + " times and played " + games);

				running = false;
				break;

			}

		}

	}
}
