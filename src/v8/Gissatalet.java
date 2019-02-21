package v8;

import java.util.Scanner;
import java.util.Random;

public class Gissatalet {

	public static void main(String[] args) {

		Random Random = new Random();
		
		
		int numberToGuess = Random.nextInt(50 + 1);
		int numberOfTries = 0;
		Scanner Scanner = new Scanner(System.in);
		int guess;
		boolean win = false;
		boolean running = true;
		
		while(running) {
		
		System.out.println("Guess a number between 1 and 50");

		while(win == false){
			guess = Scanner.nextInt();
			numberOfTries ++;
			
			if(guess == numberToGuess) {
				win = true;	
			}
			else if(guess < numberToGuess) {
				System.out.println("Your guess is too low");
			}
			else if(guess > numberToGuess) {
				System.out.println("Your guess is too high");
			}
			
			
		}
		System.out.println("You Have Won!");
		System.out.println("You guessed " + numberOfTries + " Times");
		
		boolean keepplaying = false;
		
		while(keepplaying == false) {
			System.out.println("Press 1 if you would like to play again");
			System.out.println("Type 2 if you would like to quit");
			
			int choice = Scanner.nextInt();
			switch (choice) {
			case 1: 
				keepplaying = true;
				
			case 2: 
				System.out.println("Thanks for playing");
				keepplaying = false;
				running = false;
			}
		}
			
		}
		
	}

}
