package exercise1;

import java.util.Scanner;
import java.util.HashMap;

public class CountSameWordOf20 {


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		String word = null;
		int n = 21;
		HashMap<String, Integer> repeat = new HashMap<String, Integer>();
		
		for (int i = 1; i < n; i++) {
			System.out.format("Enter the %d word: ", i);
			word = input.nextLine();
			CountRepeatedWords(repeat, word);
		}
		
		System.out.println(repeat);
		input.close();
	}
	
	public static void CountRepeatedWords(HashMap<String, Integer> repeat, String word) {
		
		if (repeat.containsKey(word)) {
			int count = repeat.get(word);
			count++;
			repeat.replace(word, count);
		} else {
			repeat.put(word, 1);
		}
	}

}
