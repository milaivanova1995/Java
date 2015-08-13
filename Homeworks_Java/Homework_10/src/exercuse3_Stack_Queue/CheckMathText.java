package exercuse3_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckMathText {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		Stack<String> mathSigns = new Stack<String>();
		Queue<String> digits = new LinkedList<String>();
		int number1 = 0, number2 = 0;
		
		System.out.print("Enter some math text: ");
		String text = input.nextLine();
		
		if ((text = inputValidation(text)) == null) {
			return;
		}
		
		for (int i = 1; i < text.length(); i += 2) {
			mathSigns.push(Character.toString(text.charAt(i)));
		}
		
		for (int i = 0; i < text.length(); i += 2) {
			digits.offer(Character.toString(text.charAt(i)));
		}
		
		while (!mathSigns.isEmpty()) {
			if (mathSigns.pop().contains("+")) {
				number1 = Integer.parseInt(digits.poll());
				number2 = Integer.parseInt(digits.poll());
				digits.offer(Integer.toString(number1 + number2));
			} else {
				number1 = Integer.parseInt(digits.poll());
				number2 = Integer.parseInt(digits.poll());
				digits.offer(Integer.toString(number1 - number2));
			}
		}
		
		System.out.println("Result: " + digits.poll());
		input.close();

	}
	
	public static String inputValidation(String input) {
		
		input = input.replaceAll("\\s+","");
		
		if (input.isEmpty()) {
			System.out.println("The string is empty.");
			return null;
		}
		
		if (input.length() % 2 == 0) {
			System.out.println("Invalid input. The string has to contain odd characters.");
			return null;
		}
		
		for (int i = 0; i < input.length(); i++) {
			if (i % 2 == 0 && !Character.isDigit(input.charAt(i)) && i >= 0 && i <= 9) {
				System.out.println("Invalid input. The even characters have to be digits from 0 to 9.");
				return null;
			} else if (i % 2 != 0 && input.charAt(i) != '+' && input.charAt(i) != '-') {
				System.out.println("Invalid input. The odd characters have to be \'+\' or \'-\'.");
					return null;
			} else if (i == 0) {
				System.out.println("Invalid input. The string has to contain more than one character.");
				return null;
			}
		}
		return input;
	}
	
}
