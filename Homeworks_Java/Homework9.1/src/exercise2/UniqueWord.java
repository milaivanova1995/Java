package exercise2;

import java.util.Scanner;
import java.util.HashMap;

public class UniqueWord {

	public static void main(String[] args) {
			

		Scanner input = new Scanner(System.in, "UTF-8");
		HashMap<String, Integer> repeat = new HashMap<String, Integer>();
		String text = null, word = null;
		
		System.out.print("Enter some text: ");
		text = input.nextLine();
		input.close();
		
		input = new Scanner(text);
		while (input.hasNext()) {
			word = input.next();
			CountRepeatedWords(repeat, word);
		}
		printWords(repeat);
		input.close();
	}

	public static void CountRepeatedWords(HashMap<String, Integer> repeat, String word) {
		
		if (repeat.containsKey(word)) {
			int count = repeat.get(word);
			count++;
			repeat.replace(word, count);
		}
		else {
			repeat.put(word, 1);
		}
	}
	
	public static void printWords(HashMap<String, Integer> repeat) {
		System.out.println();
		for (Object key : repeat.keySet()) {
			if (repeat.get(key) == 1) {
				System.out.print("\nUnique word: " + key);
			}
			if (repeat.get(key) > 1) {
				System.out.println("\nThe other words are contained more than 1 time in the text.");
			}
		}
	}
}
