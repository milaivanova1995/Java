package exercise4;

public class Task4 {

	public static void main(String[] args) {
		int[] array = {4, 3, 9};
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i == j) {	
				} else {
					System.out.print(array[i] + "" + array[j] + " ");
				}
			}
		}

	}

}
