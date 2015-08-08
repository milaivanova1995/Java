import java.util.Scanner;

public class fillArray4x4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in , "UTF-8");
		int n1 = 4, n2 = n1;
		int[][] matrix = new int[n1][n2];
		
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				System.out.format("Element [%d][%d]: ", i, j);
				matrix[i][j]=input.nextInt();
			}
		}
		
		System.out.println("\nThe matrix is:");
		for (int[] numbers: matrix) {
			for (int numbers2: numbers) {
				System.out.format("%4d", numbers2);
			}
			System.out.println();
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (matrix[i][j] % 2 == 0) {
					
				} else {
					matrix[i][j] = matrix[i][j] * 2;
				}
			}
		}
		System.out.println("\nThe odd numbers after multiflying the matrix by 2 are:");
		for (int[] numbers: matrix) {
			for (int numbers2: numbers) {
				System.out.format("%4d", numbers2);
			}
			System.out.println();
		}
		
		input.close();
	}

}
