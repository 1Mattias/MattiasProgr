package hangman;

public class Hangman {


	private static String[] words = { "terminator", "banana", "computer", "cow", "rain", "water" }; // Ord siom går det kan bli
	private static String word = words[(int) (Math.random() * words.length)]; // väljer ett slumpmässigt ord
	private static String guessWord = new String(new char[word.length()]).replace("\0", "_");
	private static int count = 0;  //Räknar fel
	private static HangmanConsoleWindow window; // Fönstret som öppnas

	public static void main(String[] args) {
		
		//öppnar fönstret
		window = new HangmanConsoleWindow();

	//skriver ut frågan om en ny bokstav så länge count < 10 och det inte finns _ kvar
		while (count < 10 && guessWord.contains("_")) {
			window.clear();
			hangmanImage();
			
			
			window.println("Guess any letter in the word");

			for (int i = 0; i < guessWord.length(); i++) {
				window.print(guessWord.charAt(i) + " ");
			}
			
			
			window.println();


			String guess = window.nextString();
			
			hang(guess);

		}
		
		window.exit();

	}

	
	// skriver ut ordet tomt, sen skriver det med dina gissningar
	public static void hang(String guess) {
		String newWord = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				newWord += guess.charAt(0);
			} else if (guessWord.charAt(i) != '_') {
				newWord += word.charAt(i);
			} else {
				newWord += "_";
			}
		}

		// lägger till på count om du gissar fel
		
		if (guessWord.equals(newWord)) {
			count++;
		} else {
		//else ingenting	
			guessWord = newWord;
		}
		//när man har vunnit så skrivs grattis och stänger programmet
		if (guessWord.equals(word)) {
			window.println("Correct! You win! The word was " + word);
			window.println("Exiting in 3 seconds");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.exit(0);
		}
	}

	// switchcase för att skriva ut/rita den hängda gubben
	
	public static void hangmanImage() {
		switch (count) {
		case 1:
			window.println("Wrong guess, try again");
			window.println();
			window.println();
			window.println();
			window.println();
			window.println("___|___");
			window.println();
			break;

		case 2:
			window.println("Wrong guess, try again");
			window.println("   |");
			window.println("   |");
			window.println("   |");
			window.println("   |");
			window.println("   |");
			window.println("   |");
			window.println("   |");
			window.println("___|___");
			break;

		case 3:
			window.println("Wrong guess, try again");
			window.println("   ____________");
			window.println("   |");
			window.println("   |");
			window.println("   |");
			window.println("   |");
			window.println("   |");
			window.println("   |");
			window.println("   | ");
			window.println("___|___");
			break;

		case 4:
			window.println("Wrong guess, try again");
			window.println("   ____________");
			window.println("   |          _|_");
			window.println("   |         /   \\");
			window.println("   |        |     |");
			window.println("   |         \\_ _/");
			window.println("   |");
			window.println("   |");
			window.println("   |");
			window.println("___|___");
			break;

		case 5:
			window.println("Wrong guess, try again");
			window.println("   ____________");
			window.println("   |          _|_");
			window.println("   |         /   \\");
			window.println("   |        |     |");
			window.println("   |         \\_ _/");
			window.println("   |           |");
			window.println("   |           |");
			window.println("   |");
			window.println("___|___");
			break;
			
		case 6:
			window.println("Wrong guess, try again");
			window.println("   ____________");
			window.println("   |          _|_");
			window.println("   |         /   \\");
			window.println("   |        |     |");
			window.println("   |         \\_ _/");
			window.println("   |           |");
			window.println("   |           |");
			window.println("   |            \\");
			window.println("___|___          \\");
			break;
	
		case 7:
			window.println("Wrong guess, try again");
			window.println("   ____________");
			window.println("   |          _|_");
			window.println("   |         /   \\");
			window.println("   |        |     |");
			window.println("   |         \\_ _/");
			window.println("   |           |");
			window.println("   |           |");
			window.println("   |          / \\ ");
			window.println("___|___      /   \\");
			break;
			
		case 8:
			window.println("Wrong guess, try again");
			window.println("   ____________");
			window.println("   |          _|_");
			window.println("   |         /   \\");
			window.println("   |        |     |");
			window.println("   |         \\_ _/");
			window.println("   |           |_");
			window.println("   |           | \\");
			window.println("   |          / \\ ");
			window.println("___|___      /   \\");
			break;
			
		case 9:
			window.println("GAME OVER!");
			window.println("   ____________");
			window.println("   |          _|_");
			window.println("   |         /   \\");
			window.println("   |        |     |");
			window.println("   |         \\_ _/");
			window.println("   |          _|_");
			window.println("   |         / | \\");
			window.println("   |          / \\ ");
			window.println("___|___      /   \\");
			window.println("GAME OVER! The word was " + word);
			break;
			
		case 10:
			window.println(" ");
			break;
			
		}
	}
}