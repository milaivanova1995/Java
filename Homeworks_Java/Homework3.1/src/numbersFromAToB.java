import java.util.Scanner;

public class numbersFromAToB {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
	
		int a, b;
		
		System.out.print("Enter the values of \'a\' and \'b\'. \n\'B\' should be greater than \'a\' (b > a).\n");
		
		
			System.out.print("Enter the value of \'a\': ");
			a = input.nextInt();
			System.out.print("Enter the value of \'b\': ");
			b = input.nextInt();
			
			if (a > b) {
				do {
					System.out.println("Wrong input. 'B\' should be greater than \'a\' (b > a).");
					System.out.print("Enter the value of \'a\': ");
					a = input.nextInt();
					System.out.print("Enter the value of \'b\': ");
					b = input.nextInt();
				} while (a > b);
			}

		
		System.out.print("\nThe numbers that can be divided by 3 without a reminder are:");
		
		for (; a <= b; a++) {
			if (a % 3 == 0) {
				System.out.printf("\n%d ", a);
			}
		}
		input.close();
	}

}
