import java.util.Arrays;
import java.util.Scanner;

public class ArrayWith10Elements {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		int number = 10;
		int[] array = new int[number]; 
		
		for (int i = 0; i < array.length; i++) {	
			System.out.print("Element: ");
			array[i] = input.nextInt();
			}
		
		for (int i = 0; i < array.length; i ++) {
			array[i] = 10 * array[i];
		}
		System.out.println(Arrays.toString(array));
		input.close();

	}

}
