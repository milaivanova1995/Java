import java.util.Random;

public class multiply3IntegerscallFunction20Times {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int i = 1;
		while (i <= 20) {
			
			int number1 = random.nextInt(500);
			int number2 = random.nextInt(500);
			int number3 = random.nextInt(500);
			int result = multiplyIntegers(number1, number2, number3);
			
			printResult(number1, number2, number3, result);
			System.out.println();
			
			i++;
		}
		
	}
	

	private static int multiplyIntegers(int a, int b, int c) {
		int result = 0;
		result = a * b * c;
		return result;
	}
	private static void printResult(int a, int b, int c, int result) {
		System.out.print("First number: " + a + "\t\t");
		System.out.print("Second number: " + b + "\t\t");
		System.out.print("Third number: " + c + "\t\t");
		System.out.print("Result: " + result + "\t\t");
		
	}
}
