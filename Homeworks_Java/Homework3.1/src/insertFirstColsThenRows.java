import java.util.Scanner;

public class insertFirstColsThenRows {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.print("Enter the size of the quadratic matrix: ");
		int number = input.nextInt();
		int[][] matrix = new int[number][number];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.format("Number [%d][%d]: ", j, i);
				matrix[i][j] = input.nextInt();
			}
		}
		
		
		System.out.println("\nThe matrix is:");
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				
				System.out.print("  " + matrix[j][i]);
			}
			
			System.out.println();
		}
		
		input.close();
	

	}

}
