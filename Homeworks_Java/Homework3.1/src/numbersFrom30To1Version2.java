
public class numbersFrom30To1Version2 {

	public static void main(String[] args) {
		
		int numbers = 30, rows = 5, cols = 6;
		int[][] matrix = new int[rows][cols];
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				
				matrix[i][j] = numbers;
				numbers--;
				System.out.print(matrix[i][j] + "\t");
				
			}
			
			System.out.println();
		}
	}

}
