package exercise3;

public class Task3 {

	public static void main(String[] args) {
		int[] array = {3, 12, 8};
		permute(array, 0);
	}
	
	public static void permute(int[] array, int startIndex) {
		if (array.length == startIndex) {
			printVariations(array);
		} else {
			for (int i = startIndex; i < array.length; i++) {
				int temp = array[i];
				array[i] = array[startIndex];
				array[startIndex] = temp;
				permute(array, startIndex + 1);
			}
		}
	}
	
	public static void printVariations(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.print(" ");
	}

}
