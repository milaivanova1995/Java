public class numbersFrom30To1 {

	public static void main(String[] args) {
		
		int[][] array = {
			{30, 29, 28, 27, 26, 25},
			{24, 23, 22, 21, 20, 19},
			{18, 17, 16, 15, 14, 13},
			{12, 11, 10, 9, 8, 7},
			{6, 5, 4, 3, 2, 1}
		};
		for (int rows = 0; rows < array.length; rows++) {
			for (int cols = 0; cols < array[0].length; cols++) {					
				System.out.printf("%d ", array[rows][cols]);	
			}
			System.out.println();
		}
	}

}
