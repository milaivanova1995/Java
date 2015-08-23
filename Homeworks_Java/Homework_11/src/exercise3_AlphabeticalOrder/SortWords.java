package exercise3_AlphabeticalOrder;

import java.util.Scanner;

public class SortWords {

	public static void main(String[] args) {
	    	
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("How many words would you like to sort: ");
		int n = input.nextInt();
		String names[] = new String[n];
		Scanner input2 = new Scanner(System.in, "UTF-8");
		System.out.println("Enter the words:");
		for (int i = 0; i < n; i++) {
			names[i] = input2.nextLine();
		}
		sort(names);
		System.out.print("Words in alphabetical order: ");
		for (int i = 0; i < n - 1; i++) {
			System.out.print(names[i] + ", ");
		}
		System.out.print(names[n - 1]);
		input2.close();
		input.close();
	}
	
	private static String[] sort(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                	exchangeWords(words, i, j);
                }
            }
        }
        return words;
	}
	
	private static void exchangeWords(String[] words, int i, int j) {
		 String temp = words[i];
         words[i] = words[j];
         words[j] = temp;
	}
}
