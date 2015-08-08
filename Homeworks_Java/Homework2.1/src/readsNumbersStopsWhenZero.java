import java.util.Scanner;

public class readsNumbersStopsWhenZero {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.print("How many numbers do you want to sum: ");
		int number = input.nextInt();
		float[] array = new float[number];
		float sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Number: ");
			array[i] = input.nextFloat();
		}
		for (int m = 0; m <= number -1; m++) {
				sum = sum + array[m];
		}
		System.out.printf("The sum is: %f", sum);
		 input.close();
	}

}
