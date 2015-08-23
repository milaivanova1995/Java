package exercise3_AlphabeticalOrder;

import java.util.Scanner;

public class SortAlphabetically {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		String[] array = sentence.split(" ");
		System.out.println("Words from the sentence in alphabetical order:");
		sort(array);
		input.close();

	}

	public static void sort(String[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

			System.out.println(array[i].toString());
		}

	}
}
