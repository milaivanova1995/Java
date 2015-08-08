import java.util.Scanner;

public class searchNumberReturnsItsIndex {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Please enter the number of the element of the array: ");
		int number = input.nextInt();
		int[] array = new int[number]; 
		int i = 0;
		
		for (; i < array.length; i++) {	
			System.out.print("Element: ");
			array[i] = input.nextInt();
			}
		
		System.out.print("Enter the number you search for: ");
		int numberS = input.nextInt();
		
		
		for (i = 0; i < array.length; i++) {
			 if (array[i] == numberS) {
				i = i + 1;
				System.out.println("The index is: " + i);
				break;
			} 
		}
		input.close();
	}

}
