import java.util.Scanner;

public class booleanExercise {

	public static void main(String[] args) {
		int a, b;
		boolean result;
		
		Scanner input = new Scanner(System. in, "UTF-8");
		
		System.out.print("The value of \'a\' is :\n a = ");
		a = input.nextInt();
		System.out.print("The value of \'b\' is :\n b = ");
		b = input.nextInt();
		System.out.format("Values of \'a\' and \'b\':\n a = %d\n b = %d\n\n", a, b);
		
		
		
		System.out.format("Checking for the reminder of: %d / 5\n", a);
		if (a % 5 == 0) {
			result = true;
			System.out.println(result);
		}
		else {
			result = false;
			System.out.println(result);
		}
		
		
		
		System.out.format("Checking for the reminder of: %d / 5\n", b);
		if (b % 5 == 0) {
			result = true;
			System.out.println(result);
		}
		else {
			result = false;
			System.out.println(result);
		}
		
		
		
		System.out.format("Checking for the reminder of: %d / 7\n", a);
		if (a % 7 == 0) {
			result = true;
			System.out.println(result);
		}
		else {
			result = false;
			System.out.println(result);
		}
		
		
		System.out.format("Checking for the reminder of: %d / 7\n", b);
		if (b % 7 == 0) {
			result = true;
			System.out.println(result);
		}
		else {
			result = false;
			System.out.println(result);
		}
		input.close();

	}

}
