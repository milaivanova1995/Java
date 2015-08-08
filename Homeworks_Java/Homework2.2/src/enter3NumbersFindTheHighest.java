import java.util.Scanner;

public class enter3NumbersFindTheHighest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter 3 numbers, please.");
		System.out.print("Enter the first number: ");
		double number1 = input.nextDouble();
		System.out.print("Enter the second number: ");
		double number2 = input.nextDouble();
		System.out.print("Enter the third number: ");
		double number3 = input.nextDouble();
		
		if ((number1 > number2) && (number1 > number3)) {
			System.out.print("The first number is the highest one.");
		} else if ((number2 > number1) && (number2 > number3)) {
			System.out.print("The second number is the highest one.");
		} else if ((number3 > number1) && (number3 > number2)) {
			System.out.print("The third number is the highest one.");
		} else if ((number1 == number2) && (number1 == number3) && (number2 == number3)) {
			System.out.print("No highest number has been found. All the numbres are the same.");
		} else if ((number1 == number2) && (number1 > number3)) {
			System.out.print("The first and the second number are the highest.");
		} else if ((number1 == number3) && (number1 > number2)) {
			System.out.print("The first and the third number are the highest.");
		} else if ((number2 == number3) && (number2 > number1)) {
			System.out.print("The second and the third number are the highest.");
		} else if ((number1 == number2) && (number1 < number3)) {
			System.out.print("The third number is the highest one.");
		} else if ((number1 == number3) && (number1 < number2)) {
			System.out.print("The second number is the highest one.");
		} else if ((number2 == number3) && (number2 < number1)) {
			System.out.print("The first number is the highest one.");
		}
		input.close();
	}

}
