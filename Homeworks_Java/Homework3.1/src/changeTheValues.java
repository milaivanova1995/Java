import java.util.Arrays;
import java.util.Scanner;

public class changeTheValues {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Please enter the number of the element of the array: ");
		int number = input.nextInt();
		int[] array = new int[number]; 
		System.out.println("Please enter the elements.");
		
		for (int i = 0; i < array.length; i++) {	
			
			System.out.print("Element: ");
			array[i] = input.nextInt();
			}
		System.out.println("\nThe array is: ");
		System.out.println(Arrays.toString(array));
		
		int length = array.length;
		int[] reversed = new int[length];
		
		for (int i = 0; i < length; i++) {
			reversed[length - i - 1] = array[i];
			}
		System.out.println("The reversed array is: ");
		System.out.println(Arrays.toString(reversed));
		input.close();
	}

}
