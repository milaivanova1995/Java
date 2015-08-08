package exercise4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintsAllSentensesWhichContainWord {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in, "UTF-8");
			String text = null, word = null,  regex = null;
			Pattern pattern = null;
			Matcher matcher = null;
			
			System.out.print("Enter some text: ");
			text = input.nextLine();
			System.out.print("Enter a word: ");
			word = input.nextLine();
			
			regex = "([A-Z][^.?!]*?)?(?<!\\w)(?i)(" + word + "|" + word + "s)(?!\\w)[^.?!]*?[.?!]{1,2}\"?";
			pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
			matcher = pattern.matcher(text);
			
			while(matcher.find()) {
				System.out.println(matcher.group());
				
			}
			
			input.close();
		}
	}
