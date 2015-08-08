import java.util.Scanner;

public class cannotBeDividedBy3Or7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Enter the limit number: ");
		int number = input.nextInt();
		int counter;
	
	
		for (counter = 1; counter <= number; counter ++) {
			if ((counter % 3 == 0) || (counter % 7 == 0)) {	
			} else {
				System.out.format("Number: %d\n", counter);	
			}	
		}
		input.close();

	}

}
