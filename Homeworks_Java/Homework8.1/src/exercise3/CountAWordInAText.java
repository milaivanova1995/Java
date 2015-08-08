package exercise3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountAWordInAText {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in, "UTF-8");
			
		System.out.print("Enter your text: ");
		String text = input.nextLine();
		System.out.print("Enter your word: ");
		String word = input.nextLine();

		Pattern pattern = Pattern.compile(word); 
		Matcher matcher = pattern.matcher(text);
		
		int count = 0;
		while (matcher.find()) {
			count++;
		}

		 System.out.format("The text contain the word \"%s\" %d time/s.", word, count);
		 input.close();
		 
	}

}
