package exercise1_Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseOrder {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.print("Enter a sentence: ");
		String sentence = input.nextLine();
		input.close();
		input = new Scanner(sentence);
		Stack<String> text = new Stack<String>();
		String word = null;
		
		while (input.hasNext()) {
			word = input.next();
			text.push(word);
		}
		
		while (!text.isEmpty()) {
			System.out.print(text.pop() + " ");
		}
		
		input.close();
	}

}