import java.util.Scanner;

public class theSumOftheEvenElements {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Please enter the number of the element of the array: ");
		int number = input.nextInt();
		int[] array = new int[number]; 
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {	
			System.out.print("Element: ");
			array[i] = input.nextInt();
			}
		
		for (int i = 0; i < array.length; i = i + 2) {
			sum = sum + array[i];
			}
		
		System.out.print("The sum is: " + sum);
		input.close();
	}

}
