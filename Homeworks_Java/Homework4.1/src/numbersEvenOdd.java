import java.util.Scanner;

public class numbersEvenOdd {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		checkZero(number);
		checkEven(number);
		checkOdd(number);
		
		input.close();
	}
	
	private static void checkEven(int number) {
		if (number != 0) {
			if (number % 2 == 0) {
				System.out.print("The number is even.");
			}
		}
	}
	
	private static void checkOdd(int number) {
		if (number != 0) {
			if (number % 2 != 0) {
				System.out.print("The number is even.");
			}
		}
	}
	
	private static void checkZero(int number) {
		if (number == 0) {
			System.out.print("The number is 0.");
		}
	}

}
