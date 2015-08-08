import java.util.Arrays;
import java.util.Scanner;

public class symmetricArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Please enter the number of the element of the array: ");
		int number = input.nextInt();
		int[] array = new int[number]; 
		System.out.println("Please enter the elements.");
		boolean symmetric = true;
		
		for (int i = 0; i < array.length; i++) {	
			
			System.out.print("Element: ");
			array[i] = input.nextInt();
			}
		System.out.println("The array is: ");
		System.out.println(Arrays.toString(array));
		
		for (int i = 0; i < ((array.length + 1) / 2); i++) {
			if (array[i] !=  array[number - i - 1]) {
				symmetric = false;
			}
		}
		System.out.println("The array is symmetric?\n" + symmetric);
		input.close();
	}

}
