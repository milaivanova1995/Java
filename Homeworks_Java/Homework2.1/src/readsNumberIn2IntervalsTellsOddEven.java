import java.util.Scanner;

public class readsNumberIn2IntervalsTellsOddEven {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		int number;
		System.out.print("Enter the number: ");
		number = input.nextInt();
		
		
		if ((number >= 1) && (number <= 5)) {
			
			if (number % 2 == 0) {
				System.out.print("The number is even."); 
			} else {
				System.out.print("The number is odd.");
			}
			
		} else if ((number >= 6) && (number <= 15)) {
			
			if (number % 3 == 0) {
				int result = number / 3;
				System.out.format("The number %d can be divided by 3 without a remainder:\n%d / 3 = %d", number, number, result);	
			} else {
				System.out.print("The number can't be divided by 3 without a remainder.");
			}
		} else if (number > 0) {
			System.out.print("The number is positive.");
		} else if (number < 0){
			System.out.print("The number is negative.");
		} else if (number == 0) {
			System.out.print("The number is 0.");
		}
		 input.close();
		
	}

}
