import java.util.Scanner;

public class reads3IntsPrintsLargest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Enter a value for \'a\': ");
		int a = input.nextInt();
		System.out.print("Enter a value for \'b\': ");
		int b = input.nextInt();
		System.out.print("Enter a value for \'c\': ");
		int c = input.nextInt();

	
		System.out.print("The max value is: " + maxNumber(maxNumber(a,b), c));maxNumber(maxNumber(a,b), c);
	
		input.close();

	}
	
	private static int maxNumber (int number1, int number2) {
		
		if (number1 > number2) {
			return number1;
		} else if (number1 == number2) {
			return number1;
		} else  { 
			return number2;
		}
		
	}

}
