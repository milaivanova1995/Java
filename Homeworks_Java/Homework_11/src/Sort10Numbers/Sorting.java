package Sort10Numbers;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in, "UTF-8");
		int number = 10;
		int[] array = new int[number]; 
		
		for (int i = 0; i < array.length; i++) {	
			System.out.format("Element %d: ", i);
			array[i] = input.nextInt();
			}
		
		System.out.printf("Before sorting: " + Arrays.toString(array));
		
		
//		BogoSort(array);
//		System.out.printf("\n-BogoSort- After sorting: " + Arrays.toString(array));
//		
//		BubbleSort(array);
//		System.out.printf("\n-BubbleSort- After sorting: " + Arrays.toString(array));
//	
//		CocktailSort(array);
//		System.out.printf("\n-CocktailSort- After sorting: " + Arrays.toString(array));
//			
//		MergeSort(array);
//		System.out.printf("\n-CocktailSort- After sorting: " + Arrays.toString(array));
//		
//		QuickSort(array, 0, array.length-1);
//		System.out.printf("\n-QuickSort- After sorting: " + Arrays.toString(array));
//			
		ShellSort(array);
		System.out.printf("\n-ShellSort- After sorting: " + Arrays.toString(array));
		
		
		input.close();

	}
		 
		 
	 public static void CocktailSort(int[] array ) {
		    boolean swapped;
		    do {
		      swapped = false;
		      for (int i = 0; i <= array.length - 2; i++) {
		        if (array[i] > array[i + 1]) {
		          int temp = array[i];
		          array[i] = array[i + 1];
		          array[i + 1] = temp;
		          swapped = true;
		        }
		      }
		      if (!swapped) {
		        break;
		      }
		      swapped = false;
		      for (int i = array.length - 2; i >= 0; i--) {
		        if (array[i] > array[i + 1]) {
		          int temp = array[i];
		          array[i] = array[i + 1];
		          array[i + 1] = temp;
		          swapped = true;
		        }
		      }
		    } while (swapped);
		  }
	 
	 
	 
	 
	 private static final Random generator = new Random();  
	 
	  public static void BogoSort(int[] array)  {  
	    while (!isSorted(array)) {  
	      for (int i = 0; i < array.length; i++) {  
	        int randomPosition = generator.nextInt(array.length);  
	        int temp = array[i];  
	        array[i] = array[randomPosition];  
	        array[randomPosition] = temp;  
	      }  
	    }  
	  }  
	 
	  private static boolean isSorted(int[] array)  {  
	    for (int i = 1; i < array.length; i++) {
	      if (array[i] < array[i - 1]) {
	        return false;  
	      }
	    }
	    return true;  
	  }  
	  
	  
	  
	  
	  
	 public static void MergeSort(int[] array) {
		 if (array.length > 1) {
			 int[] left = leftHalf(array);
		     int[] right = rightHalf(array);
		     
		     MergeSort(left);
		     MergeSort(right);
		 
		     merge(array, left, right);
		     }
	 }
		 
	 public static int[] leftHalf(int[] array) {
	    int size1 = array.length / 2;
	    int[] left = new int[size1];
	    for (int i = 0; i < size1; i++) {
	    	left[i] = array[i];
		}
	    return left;
	 }
		 
	 public static int[] rightHalf(int[] array) {
		 int size1 = array.length / 2;
		 int size2 = array.length - size1;
		 int[] right = new int[size2];
		 for (int i = 0; i < size2; i++) {
			 right[i] = array[i + size1];
		 }
		 return right;
	 }
	  
	 public static void merge(int[] result, int[] left, int[] right) {
		    int i1 = 0;  
		    int i2 = 0; 
		 
		    for (int i = 0; i < result.length; i++) {
		      if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
		        result[i] = left[i1]; 
		        i1++;
		      } else {
		        result[i] = right[i2]; 
		        i2++;
		      }
		    }
		  }
	 
	 
	 
	 
	 public static void QuickSort(int A[], int f, int l) {
	      if (f >= l) return;
	      int pivotIndex = partition(A, f, l);
	      QuickSort(A, f, pivotIndex);
	      QuickSort(A, pivotIndex+1, l);
	   }
 
	 public static void swap (int A[], int x, int y) {
	      int temp = A[x];
	      A[x] = A[y];
	      A[y] = temp;
	   }
	 
	  public static int partition(int A[], int f, int l) {
		  int pivot = A[f];
		  while (f < l) {
	         while (A[f] < pivot) {
	        	 f++;
	         }
	         while (A[l] > pivot) {
	        	 l--;
	         }
	         swap (A, f, l);
	      }
	      return f;
	  }
		  
		  
	  
	  public static void ShellSort(int[] array) {
		  int inner, outer;
		  int temp;
		  int h = 1;
		  
		  while (h <= array.length / 3) {
		      h = h * 3 + 1;
		    }
		  while (h > 0) {
			  for (outer = h; outer < array.length; outer++) {
				  temp = array[outer];
				  inner = outer;
				  
				  while (inner > h - 1 && array[inner - h] >= temp) {
					  array[inner] = array[inner - h];
					  inner = inner - h;
		        }
		        array[inner] = temp;
		      }
		      h = (h - 1) / 3;
		    }
	 }
			 

	  
	  public static void BubbleSort(int[] array) {
		  int swap;
		  for (int i = 0; i < (array.length - 1); i++) {
			  for (int j = 0; j < array.length - i - 1; j++) {
				  if (array[j] > array[j + 1]) {
					  swap = array[j];
					  array[j] = array[j + 1];
					  array[j + 1] = swap;
				  }
			  }
		  }
	  }
}
