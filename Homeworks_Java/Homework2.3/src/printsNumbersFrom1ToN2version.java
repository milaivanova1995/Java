import java.util.Scanner;

public class printsNumbersFrom1ToN2version {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Enter the limit number: ");
		int number = input.nextInt();
		
		for (int counter = 1; counter <= number; counter++) {
			System.out.format("The number is: %d\n", counter);
		}
		input.close();
	}

}
