import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Please enter the number of the element of the array: ");
		int number = input.nextInt();
		int[] array = new int[number]; 

		array[1] = 1;
		
		for(int i = 2 ; i < array.length ; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}
		
		for(int elements: array) {
			System.out.print(elements + " ");
		}
		input.close();
	}

}
