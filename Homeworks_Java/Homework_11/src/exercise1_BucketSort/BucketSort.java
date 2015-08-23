package exercise1_BucketSort;

import java.util.Arrays;
import java.util.Scanner;

public class BucketSort {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("How many element would you like to add?");
		int number = input.nextInt();
		int[] array = new int[number]; 

		for (int i = 0; i < array.length; i++) {	
			System.out.format("Element %d [0, 2 147 483 647]: ", i);
			array[i] = input.nextInt();
			if (array[i] < 0) {
				throw new ArrayIndexOutOfBoundsException("The number must be >= 0!");
			}
		}
		
		System.out.printf("Before sorting: " + Arrays.toString(array));
		bucketSort(array);
		System.out.printf("\nAfter sorting: " + Arrays.toString(array));

		input.close();
	}
	
	public static void bucketSort(int[] array) {
		int maxValue = maxValue(array);
		int[] bucket = new int[maxValue + 1];

		for (int i = 0; i < bucket.length; i++) {
			bucket[i] = 0;
		}

		for (int i = 0; i < array.length; i++) {
			bucket[array[i]]++;
		}

		int outPos = 0;
		for (int i = 0; i < bucket.length; i++) {
			for (int j = 0; j < bucket[i]; j++) {
				array[outPos++] = i;
			}
		}
		
		
	}

	private static int maxValue(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) { 
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
}
