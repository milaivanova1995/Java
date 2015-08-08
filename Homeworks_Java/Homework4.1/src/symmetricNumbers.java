
public class symmetricNumbers {

	public static void main(String[] args) {
		
			System.out.println("The symmetric numbers in the interval from 10 to 999 are:");
			for (int i = 10; i < 1000; i++) {
				printSymmetric(i);
			}
		}

		private static void printSymmetric(int number) {
			
			if (number / 100 == 0 && number % 10 == number / 10) {
				System.out.println(number);
			} else if (number / 100 != 0 && number / 100 == number % 10) {
				System.out.println(number);
			} else {
				return;
			}	

	}
	
}
