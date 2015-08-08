package exercise5;

import java.util.Scanner;

public class MathsBrackets {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		String text = null;
		int count = 0;
		
		System.out.print("Enter some math text: ");
		text = input.nextLine();

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '(') {
				count++;
			} else if (text.charAt(i) == ')') {
				count--;
			}
		}
		
		System.out.println("You entered:\n" + text);
		System.out.println("\nMisplaced brackets: " + (count != 0));
		
		input.close();

	}

}
