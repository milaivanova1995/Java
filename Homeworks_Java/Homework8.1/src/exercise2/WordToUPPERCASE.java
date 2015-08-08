package exercise2;

import java.util.Scanner;

public class WordToUPPERCASE {

	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in, "UTF-8");
			String UP = null;
			
			System.out.print("Enter your text: ");
			String text = input.nextLine();
			
			System.out.print("Enter a word/words from the text: ");
			String word = input.nextLine();
			
			if (!text.contains(word)) {
				System.out.println("Your text does not contain the word \"" + word + "\".");
			} else {
				UP = text.replace(word, wordToUpperCase(word));
				System.out.println(UP);
			}
			
			
			input.close();
			
	}
	
	public static String wordToUpperCase(String word) {	
		String up = new String(word);
		return up.toUpperCase();
	}

}
