package TestSpeed;

public class TestSpeed {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Sort10Numbers.Sorting sorter = new Sort10Numbers.Sorting();
		int size = 10000;
		int[] arr1 = new int[size], arr2 = new int[size], arr3 = new int[size], arr4 = new int[size], arr5 = new int[size], arr6 = new int[size];
		long startTime = 0, endTime = 0;
		double result = 0;
		
		for (int i = 0; i < size; i++) {
			arr1[i] = arr2[i] = arr3[i] = arr4[i] = arr5[i] = arr6[i] = size - i;
		}
		
//		startTime = System.nanoTime();
//		sorter.BogoSort(arr1);
//		endTime = System.nanoTime();
//		result = (endTime - startTime) / Math.pow(10, 9);
//		System.out.println("Bogo sort time: " + result + " s");
		
		startTime = System.nanoTime();
		sorter.BubbleSort(arr2);
		endTime = System.nanoTime();
		result = (endTime - startTime) / Math.pow(10, 9);
		System.out.println("Bubble sort time: " + result + " s");
		
		startTime = System.nanoTime();
		sorter.CocktailSort(arr3);
		endTime = System.nanoTime();
		result = (endTime - startTime) / Math.pow(10, 9);
		System.out.println("Cocktail sort time: " + result + " s");
		
		startTime = System.nanoTime();
		sorter.MergeSort(arr4);
		endTime = System.nanoTime();
		result = (endTime - startTime) / Math.pow(10, 9);
		System.out.println("Merge sort time: " + result + " s");

		startTime = System.nanoTime();
		sorter.QuickSort(arr5, 0, arr5.length - 1);
		endTime = System.nanoTime();
		result = (endTime - startTime) / Math.pow(10, 9);
		System.out.println("Quick sort time: " + result + " s");
		
		startTime = System.nanoTime();
		sorter.ShellSort(arr6);
		endTime = System.nanoTime();
		result = (endTime - startTime) / Math.pow(10, 9);
		System.out.println("Shell sort time: " + result + " s");
	}
}
