import java.util.Scanner;

public class spiralMatrix {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.print("Enter the size of the quadratic matrix: ");
		int number = input.nextInt();
		
		int[][] matrix = new int[number][number];
		int rk = 1, row = 0, row1 = number - 1, col = 0, col1 = number - 1;
		
		while (rk <= number * number) {
			for (int j = col; j <= col1; j++) {
				matrix[row][j] = rk;
				rk++;
			}
			
			for (int i = row + 1; i <= row1; i++) {
				matrix[i][col1] = rk;
				rk++;
			}
			
			for (int j = col1 - 1; j >= col; j--) {
				matrix[row1][j] = rk;
				rk++;
			}
			
			for (int i = row1 - 1; i >= row + 1; i--) {
				matrix[i][col] = rk;
				rk++;
			}
			
			row++;
			row1--;
			col++;
			col1--;
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		input.close();

	}

}
