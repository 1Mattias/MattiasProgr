package hangman;

import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {

		boolean playing = true;
		int tries = 0; // hur m�nga g�nger man har gissat fel
		
		while(playing) {
		
		Scanner Scanner = new Scanner(System.in);
		String[] wordToGuess = { "test", "banan", "stockholm", "sverige" }; // ordlista
		String word = wordToGuess[(int) Math.floor(Math.random() * wordToGuess.length)]; // v�ljer ett av orden
		String[] answer = new String[word.length()]; // g�r answer lika long som ordet som valts
		String[] answerUnderscore = new String[word.length()];
		
		for (int i = 0; i < word.length(); i++) { // En for-loop som klipper upp word och l�gger in det i answer
			answer[i] = word.substring(i, i + 1);
			System.out.println(answer[i]);
		}

		for (int i = 0; i < word.length(); i++) { // g�r en str�ckad version av answer arrayen
			answerUnderscore[i] = "_";
		}
		/*
		 * V�lkommnar en till spelet
		 * Startar while loopen som �r sj�lva spelet
		 * 
		 */
		
		
		
		
		int lettersLeft = word.length();
		
		System.out.println("Gissa en bokstav i taget! (BARA BOKST�VER)");
		System.out.println("Du bara gissa fel 8 g�nger s� var f�rsiktig! Lycka till!");
		tries++;
		
		//Sj�lva spelet hanteras i denna while loop
		while (lettersLeft > 0 & tries <= 7) {
			String guess;
			guess = Scanner.nextLine();

			for (int j = 0; j < word.length(); j++) {
					
					//Om gissningen �r redan gissad
				if (guess.equals(answerUnderscore[j])) {
					System.out.println("Du beh�ver inte skriva samma bokstav igen");
					break;
					//om man gissar r�tt s�tter den in det i answerUnderscore
				} else if (answer[j].equals(guess)) {

					answerUnderscore[j] = guess;
					lettersLeft--;
					tries--;
					System.out.print(answerUnderscore[j] + " ");
					//Skriver ut ordet med understr�ck och bokst�ver man gissat
				} else {
					System.out.print(answerUnderscore[j] + " ");
					
				}
				
				
			}
			
			//skriver ut hur m�nga g�nger du har gissat fel
			tries ++;
			System.out.println();
			System.out.println();
			System.out.println("Felgissningar: " + tries);
			System.out.println("Kom ih�g att efter 8 s� f�rlorar du!");

		}
		/*
		 * Gratulerar om du vann eller s�ger att du har f�rlorat.
		 * S�tter playing till false
		 * 
		 */
		System.out.println("");
		System.out.println("");
		if(tries < 8) {System.out.println("Grattis, du vann, och tack f�r att du har spelat!");}
		else if(tries >= 8) {System.out.println("Du f�rlorade tyv�rr");}
		
		playing = false;

		System.out.println("");

		
		// fr�gar om du vill spela igen och utf�r ditt val med hj�lp av en switchcase
		System.out.println("Skriv 1 om du vill spela igen");
		System.out.println("Skriv 2 om du vill avsluta");
		
		
		
		int choice = Scanner.nextInt();
		switch (choice) {

		//g�r playing till true som f�r loppen att starta om, och g�r tries till noll
		case 1:
			playing = true;
			tries = 0;
			
			break;

		// Tackar or f�r spelet att st�ngas av
		case 2:
			
			System.out.println("tack f�r att du har spelat!");

			
			break;

		}
		
		}
		
		
		
	}
}