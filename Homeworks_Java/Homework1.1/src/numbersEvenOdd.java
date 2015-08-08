import java.util.Scanner;

public class numbersEvenOdd {

	public static void main(String[] args) {
		int a;
		
		Scanner input = new Scanner(System. in, "UTF-8");
		
		System.out.print("The value of \'a\' is :\n a = ");
		a = input.nextInt();
	
		System.out.format("Value of \'a\':\n a = %d\n\n", a);
		
		if ((a % 2) == 0) {
			System.out.format("\nThe number %d is even", a);
		}
		else {
			System.out.format("The number %d is odd", a);
		}
		input.close();
	}

}
