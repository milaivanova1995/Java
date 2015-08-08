import java.util.Scanner;

public class printsNumbersFrom1ToN {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Enter the limit number: ");
		int number = input.nextInt();
		int counter = 1;
		
		while (counter <= number) {
				System.out.format("The number is: %d\n", counter);
				counter++;
		}
		input.close();
	}

}
