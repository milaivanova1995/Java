import java.util.Scanner;

public class BinarySearch {

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
			System.out.print(array[n] + " ");
		}
		
		int startElement = 0;
		int lastElement = number;
		int index = (startElement + lastElement) / 2;
		
		System.out.print("\nPlease enter the number you are searching for: ");
		int searchedNumber = input.nextInt();
		
		while ((array[index] != searchedNumber) && (startElement <= lastElement)) {
			if (array[index] > searchedNumber) {
				lastElement = index - 1;

			} else {
				startElement = index + 1;
			}

			index = (startElement + lastElement) / 2;
		}

		if (startElement <= lastElement) {
			System.out.println("\nYour number is on position ¹ " + (index + 1));
		} else {
			
			for (int i = 0; i < array.length; i++) {
				
				if (array[i] != searchedNumber) {
					System.out.println("This number does not exist in this array!");
					break;
				}
			}
		}
		
		input.close();
	}

}
