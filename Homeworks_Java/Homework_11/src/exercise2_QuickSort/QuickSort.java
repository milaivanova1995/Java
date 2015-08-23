package exercise2_QuickSort;

public class QuickSort {

	protected int array[], length;
	
	public void quickSort(int[] array) {
		
		if (array.length == 0) {
			return;
		}
		this.array = array;
		length = array.length;
		qSort(0, length - 1);
	}

	private void qSort(int left, int right) {
		
		int i = left;
		int j = right;
		int middle = array[left + (right - left) / 2];
		while (i <= j) {
			while (array[i] < middle) {
				i++;
			}
			while (array[j] > middle) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j);
				i++;
				j--;
			}
		}
		if (left < j)
			qSort(left, j);
		if (right > i)
			qSort(i, right);
	}

	private void exchangeNumbers(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	

}
