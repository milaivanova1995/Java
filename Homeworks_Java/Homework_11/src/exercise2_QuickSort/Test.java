package exercise2_QuickSort;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("How many element would you like to add?");
		int number = input.nextInt();
		int[] array = new int[number]; 

		for (int i = 0; i < array.length; i++) {	
			System.out.format("Element %d: ", i);
			array[i] = input.nextInt();
		}
		
		System.out.printf("Before sorting: " + Arrays.toString(array));
		QuickSort qsort = new QuickSort();
		qsort.quickSort(array);
		System.out.printf("\nAfter sorting: " + Arrays.toString(array));
		input.close();
	}

}
