import java.util.Scanner;

public class showsPlusOrMinus {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Enter the first number: ");
		double number1 = input.nextDouble();
		System.out.print("Enter the second number: ");
		double number2 = input.nextDouble();
		
		if (((number1 / number2) == 0) || ((number2 / number1) == 0)) {
			System.out.println("The result is : 0");
		} else if (((number1 / number2) > 0) || ((number2 / number1) > 0)) {
			System.out.println("The result's sign is \"+\".");
		} else {
			System.out.println("The result's sign is \"-\".");
		}
		input.close();
	}

}
