package exercise1;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSameWordsOf20Version2 {

	public static void main(String[] args) {
		
		ArrayList<String> word = new ArrayList<String>();
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Please enter 20 words: ");
		
		for (int i = 1; i < 21; i++) {
			System.out.format("Enter the %d word: ", i);
			word.add(input.nextLine());
		}
		
		System.out.println(word.toString());
		
		Map<String, Integer> words= createWordsCount(word.toString().replaceAll("[^a-zA-Z ]", ""));

		printCountedWords(words);
		input.close();
	}
	
	
	static Map<String,Integer> createWordsCount(String text) {
		
		Scanner input = new Scanner(text);
		Map<String, Integer> words = new TreeMap<String, Integer>();

		while (input.hasNext()) {
			String word = input.next();
			Integer count = words.get(word);
				if (count == null) {
					count = 0;
				}
			words.put(word, count + 1);
			}
		
		input.close();
		return words;
			
	}
	static void printCountedWords(Map<String, Integer> wordsCounts) {
		
			for (Map.Entry<String, Integer> wordEntry: wordsCounts.entrySet()) {
			System.out.printf("The text contains the word \'%s\' %d time/s.\n", wordEntry.getKey(), wordEntry.getValue());
			}
	}
	
}
