package hangman;

public class Hangman {

	private static String[] words = { "terminator", "banana", "computer", "cow", "rain", "water" };
	private static String word = words[(int) (Math.random() * words.length)];
	private static String guessWord = new String(new char[word.length()]).replace("\0", "_");
	private static int count = 0;
	private static HangmanConsoleWindow window;

	public static void main(String[] args) {
		window = new HangmanConsoleWindow();

		while (count < 7 && guessWord.contains("_")) {
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

		if (guessWord.equals(newWord)) {
			count++;
		} else {
			guessWord = newWord;
		}
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
			window.println("   |          / \\ ");
			window.println("___|___      /   \\");
			break;

		case 7:
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
		}
	}
}