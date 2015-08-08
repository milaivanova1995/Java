import java.util.Scanner;

public class numbersOneToNineInEnglish {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Enter a number from 1-9: ");
		char number = input.next().charAt(0);
		
		switch (number) {
		case '1': System.out.print("1 - One.");
		break;
		case '2': System.out.print("2 - Two.");
		break;
		case '3': System.out.print("3 - Three.");
		break;
		case '4': System.out.print("4 - Four.");
		break;
		case '5': System.out.print("5 - Five.");
		break;
		case '6': System.out.print("6 - Six.");
		break;
		case '7': System.out.print("7 - Seven.");
		break;
		case '8': System.out.print("8 - Eight.");
		break;
		case '9': System.out.print("9 - Nine.");
		break;
		}
		input.close();

	}

}
