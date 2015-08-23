package exercise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import Sort10Numbers.Sorting;

public class SortNumbers {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		ArrayList<Integer> evenList = new ArrayList<Integer>();
		ArrayList<Integer> oddList = new ArrayList<Integer>();
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("How many numbers would you like to add?");
		int number = input.nextInt();
		int[] array = new int[number]; 
		int[] even = null, odd = null;

		for (int i = 0; i < array.length; i++) {	
			System.out.format("Element %d: ", i);
			array[i] = input.nextInt();
		}
	
		System.out.println("\nArray:" + Arrays.toString(array));
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				evenList.add(array[i]);
			} else {
				oddList.add(array[i]);
			}
		}
		
		even = new int[evenList.size()];
		odd = new int[oddList.size()];
		for (int i = 0; i < even.length; i++) {
			even[i] = evenList.get(i);
		}
		for (int i = 0; i < odd.length; i++) {
			odd[i] = oddList.get(i);
		}

		System.out.println("\nArray with even numbers:" + Arrays.toString(even));
		System.out.println("Array with odd numbers:" + Arrays.toString(odd));
		
		Sorting sort = new Sorting();
		sort.BubbleSort(even);
		bubbleSortDescending(odd);
		
		System.out.println("\nSorted array with even numbers (ascending): " +  Arrays.toString(even));
		System.out.println("Sorted array with odd numbers (descending): " +  Arrays.toString(odd));
		input.close();
	}
	
	private static void bubbleSortDescending(int []array) {
		int swap;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j - 1] < array[j]) {
					swap = array[j - 1];
					array[j - 1] = array[j];
					array[j] = swap;
				}
			}
		}
	}

	

}
