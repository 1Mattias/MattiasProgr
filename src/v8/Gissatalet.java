package v8;

import java.util.Scanner;
import java.util.Random;

public class Gissatalet {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);

		// den b�rjar med att fr�ga dig hur sv�rt du vill g�ra det f�r dig sj�lv och
		// sparar ditt svar till en variabel.

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

			/*
			 * Denna while-loopen ser om du har r�tt eller fel och sedan skriver ut om din
			 * gissning �r f�r h�g eller f�r l�g. Den l�gger �ven till hur m�nga g�nger du
			 * f�rs�ker varje g�ng du k�r (R�knar antal spel ocks�) och l�gger ihop det i
			 * slutet till ett total.
			 */
			while (win == false) {
				guess = Scanner.nextInt();
				numberOfTries++;
				numberOfTriesTotal++;

				if (guess == numberToGuess) {
					win = true;
					games++;
				} else if (guess < numberToGuess) {
					System.out.println("Your guess is too low");
				} else if (guess > numberToGuess) {
					System.out.println("Your guess is too high");
				}

			}

			// Skriver hur m�nga g�nger du gissat denna "rundan" och hur m�nga g�nger totalt
			// och sedan fr�gar om du vill k�ra igen.

			System.out.println("You Have Won!");
			System.out.println("You guessed " + numberOfTries + " Times");
			System.out.println("You Have guessed " + numberOfTriesTotal + " Times In Total");

			System.out.println("");

			System.out.println("Press 1 if you would like to play again");
			System.out.println("Type 2 if you would like to quit");

			// Koden f�r de olika valen

			int choice = Scanner.nextInt();
			switch (choice) {

			// S�tter om de variabler till 0 som skall vara det, fr�gar hur sv�rt och sedan
			// startar while-loopen genom att g�ra win = false.

			case 1:
				win = false;
				numberToGuess = Random.nextInt(difficulty + 1);
				numberOfTries = 0;
				difficulty = 0;
				System.out.println("Type your desired guessing range(0 and X)");
				difficulty = Scanner.nextInt();
				break;

			// Skriver ut ditt totala antal gissningar och antalet spel spelade

			case 2:
				System.out.println("Thanks for playing");
				System.out.println("Here are your final results:");
				System.out.println("You guessed " + numberOfTriesTotal + " times and played " + games + " game(s)");

				running = false;
				break;

			}

		}

		Scanner.close();
	}

}