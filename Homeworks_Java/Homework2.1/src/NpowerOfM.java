import java.util.Scanner;

public class NpowerOfM {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		int number1, number2;
		System.out.print("Enter the first number (\'N\'): ");
		number1 = input.nextInt();
		System.out.print("Enter the number of the power (\'M\'): ");
		number2 = input.nextInt();
		
		int result = 1;
		int i;
		
		if (number2 > 0) {
			for (i = 1; i <= number2; i++) {				
				result = result * number1;
			}
		} 
			
	   
       System.out.println("The result of N^M is: " + result);
       input.close();
	}

}
