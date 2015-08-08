import java.util.Scanner;

public class numbers1To999InEnglish {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in, "UTF-8");
		String[] first = {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" ,"eight" , "nine"};
		String[] decimal = {"twenty" , "thirty" , "forty" , "fifty" , "sixty" , "seventy" , "eighty" , "ninety"};
		String[] teen = {"ten" , "eleven" , "twelve" , "thirteen" , "fourteen" , "fifteen" , "sixteen" , "seventeen" , "eighteen" , "nineteen"};
		
		System.out.print("Enter a number between 0-999 and the program will convert it to english words: ");
		int inputNum = inputs.nextInt();
		int hundreds = inputNum / 100;
		inputNum = inputNum % 100;
		int tenths = inputNum / 10;
		int units = inputNum % 10;
		
		
		
		if (hundreds >= 1 && hundreds <= 9) {
			System.out.print(first[hundreds] + " hundred ");
			
			if (tenths == 1 || (tenths == 0 && units != 0)) {
				System.out.print("and ");
			}
		} else if (hundreds > 9) {
			System.out.println("Invalid number!");
			tenths=0;
			units=0;
		}
		
		if (tenths == 1) {
			System.out.print(teen[units]);
		} else if (tenths > 1 && tenths <= 9) {
			System.out.print(decimal[tenths-2] + " ");
		}
		
		if (tenths != 1) {
			if (units!=0) {
				System.out.print(first[units]);
			} else if (units == 0 && tenths == 0 && hundreds == 0){
				System.out.print("Zero");
			}
		}
		inputs.close();
	}

}
