package exercise1;

import java.util.Scanner;

public class ReadsFromBackToFrontVersion2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		String word = null;
		
		System.out.print("Enter a word or a sentense: ");
		word = input.nextLine();
		StringBuilder sb = new StringBuilder(word);
		sb.reverse();
		
		System.out.println("The reverse word/sentense is: " + sb.toString());
		
		input.close();
	}
	
}
