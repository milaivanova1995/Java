package exercise2_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RemovesWords {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.print("Enter a sentence: ");
		String sentence = input.nextLine();
		input.close();
		input = new Scanner(sentence);
		String word = null;
		Queue<String> text = new LinkedList<String>();
		
//		while (input.hasNext()) {
//			word = input.next();
//			text.offer(word);
//			if (word.length() <= 3) {
//				text.remove(word);
//			}
//		}
	
		while (input.hasNext()) {
			word = input.next();
			if (word.length() > 3) {
				text.offer(word);
			}
		}
		
		while (!text.isEmpty()) {
			System.out.print(text.poll() + " ");
		}
		
		input.close();
	}

}
