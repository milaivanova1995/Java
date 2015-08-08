import java.util.Scanner;

public class ArraysWith10ElementsVersion3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		int number = 10;
		int[] array = new int[number]; 
		
		for (int i = 0; i < array.length; i++) {	
			System.out.print("Element: ");
			array[i] = input.nextInt();
			}
		int n = 0;
		while (n < array.length) {
			System.out.printf("Element[%d]: %s%n", n, (10 * array[n]));
			n++;
		}
		input.close();
	}

}
