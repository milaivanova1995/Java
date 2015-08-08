import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Please enter the number of the element of the array: ");
		int number = input.nextInt();
		int[] array = new int[number]; 
		System.out.println("Please enter the numbers.");
		
		for (int i = 0; i < array.length; i++) {	
			
			System.out.print("Nunber: ");
			array[i] = input.nextInt();
			}
		
		int swap;
		for (int i = 0; i < (array.length - 1); i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					swap = array[j];
					array[j] = array[j + 1];
					array[j + 1] = swap;
				}
			}
		}
		
		System.out.println("\nThe sorted list of numbers is:");
		
		for (int n = 0; n < array.length; n++) {
			System.out.println(array[n]);
		}
		
		input.close();		
	}

}
