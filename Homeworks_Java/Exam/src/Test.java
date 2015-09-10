import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.print("Enter the length /length should be bewtween 2-9/ of the array: ");
		int length = input.nextInt();
		MethodsNeeded test = new MethodsNeeded(length);
		
		while (length < 2 || length > 9) {
			System.out.print("Wrong input. Enter a length between 2-9: ");
			length = input.nextInt();
		}
		int[][] matrix = test.fillMatrix(length);
		System.out.println();
		test.printMatrix(matrix, length);
		
		System.out.println("Choose an option:\n1.Rotate the array on 90 degrees clockwise.\n2.Calculate the sum.\n");
		System.out.print("Your choice is /1 or 2/: ");
		int choice = input.nextInt();

		while (choice < 1 || choice > 2) {
			System.out.print("Wrong input. Enter 1 or 2: ");
			choice = input.nextInt();
		}



		

		System.out.println();
		
		String fileName = null;
		if (choice == 1) {
			matrix = test.rotateMatrix(matrix);
			test.printMatrix(matrix, length);
			System.out.print("Enter file name to save the matrix: ");
			fileName = input.next();
			try {
				test.writeInFile(matrix, fileName);
			} catch (IOException e) {
				System.out.println("Error while writing.");
				e.printStackTrace();
			} finally {
				System.out.println("Program completed.");
			}
			
		} else if (choice == 2) {
			int sum = test.sum(matrix, length);
			System.out.println("The sum is: " + sum);
		}
		input.close();

	}
	

}
