package hangman;

import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {

		boolean playing = true;
		int tries = 0; // hur många gånger man har gissat fel
		
		while(playing) {
		
		Scanner Scanner = new Scanner(System.in);
		String[] wordToGuess = { "test", "banan", "stockholm", "sverige" }; // ordlista
		String word = wordToGuess[(int) Math.floor(Math.random() * wordToGuess.length)]; // väljer ett av orden
		String[] answer = new String[word.length()]; // gör answer lika long som ordet som valts
		String[] answerUnderscore = new String[word.length()];
		
		for (int i = 0; i < word.length(); i++) { // En for-loop som klipper upp word och lägger in det i answer
			answer[i] = word.substring(i, i + 1);
			System.out.println(answer[i]);
		}

		for (int i = 0; i < word.length(); i++) { // gör en sträckad version av answer arrayen
			answerUnderscore[i] = "_";
		}
		/*
		 * Välkommnar en till spelet
		 * Startar while loopen som är själva spelet
		 * 
		 */
		
		
		
		
		int lettersLeft = word.length();
		
		System.out.println("Gissa en bokstav i taget! (BARA BOKSTÄVER)");
		System.out.println("Du bara gissa fel 8 gånger så var försiktig! Lycka till!");
		tries++;
		
		//Själva spelet hanteras i denna while loop
		while (lettersLeft > 0 & tries <= 7) {
			String guess;
			guess = Scanner.nextLine();

			for (int j = 0; j < word.length(); j++) {
					
					//Om gissningen är redan gissad
				if (guess.equals(answerUnderscore[j])) {
					System.out.println("Du behöver inte skriva samma bokstav igen");
					break;
					//om man gissar rätt sätter den in det i answerUnderscore
				} else if (answer[j].equals(guess)) {

					answerUnderscore[j] = guess;
					lettersLeft--;
					tries--;
					System.out.print(answerUnderscore[j] + " ");
					//Skriver ut ordet med understräck och bokstäver man gissat
				} else {
					System.out.print(answerUnderscore[j] + " ");
					
				}
				
				
			}
			
			//skriver ut hur många gånger du har gissat fel
			tries ++;
			System.out.println();
			System.out.println();
			System.out.println("Felgissningar: " + tries);
			System.out.println("Kom ihåg att efter 8 så förlorar du!");

		}
		/*
		 * Gratulerar om du vann eller säger att du har förlorat.
		 * Sätter playing till false
		 * 
		 */
		System.out.println("");
		System.out.println("");
		if(tries < 8) {System.out.println("Grattis, du vann, och tack för att du har spelat!");}
		else if(tries >= 8) {System.out.println("Du förlorade tyvärr");}
		
		playing = false;

		System.out.println("");

		
		// frågar om du vill spela igen och utför ditt val med hjälp av en switchcase
		System.out.println("Skriv 1 om du vill spela igen");
		System.out.println("Skriv 2 om du vill avsluta");
		
		
		
		int choice = Scanner.nextInt();
		switch (choice) {

		//gör playing till true som får loppen att starta om, och gör tries till noll
		case 1:
			playing = true;
			tries = 0;
			
			break;

		// Tackar or får spelet att stängas av
		case 2:
			
			System.out.println("tack för att du har spelat!");

			
			break;

		}
		
		}
		
		
		
	}
}