import java.util.Scanner;

public class sumFrom10To30000 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in,"UTF-8");
		
		System.out.print("Enter a number between 10 and 30 000: ");
		int number = input.nextInt();
		
		if (number < 10){
			
			while (number < 10) {
				System.out.print("Number must be between 10-30000. Enter a number: ");
				number = input.nextInt();
			}	
		} 
		
		if (number >= 10) {	
		System.out.print("The sum is: " + sum(number));
		}
		
		input.close();

	}
	private static long sum(int number) {
		if (number < 0) {
			return 0;
		} else {
			return number + sum(number - 1);
			
		}
	}
	
}

//смята до определено число
//за довършване
