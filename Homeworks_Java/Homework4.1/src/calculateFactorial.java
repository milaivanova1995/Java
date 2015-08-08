import java.util.Scanner;

public class calculateFactorial {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		int factorial = calculateFactorial(number);
		System.out.format("%d! = %d", number, factorial);
		input.close();

	}
	
	private static int calculateFactorial(int number) {
				
				if (number == 1 || number == 0) {
				    return 1;
				} else {
				    return number * calculateFactorial(number - 1);
				}
		
	}

}
