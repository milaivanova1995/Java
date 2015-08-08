import java.util.Scanner;

public class enter3NumbersFindTheHighestVersion2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter 3 numbers, please.");
		int number;
		int temp = 0;
		
		for (int i = 1; i <= 3; i++) {
		System.out.print("Number: ");
		number = input.nextInt();
			if (number > temp) {
				temp = number;
			}
		}
		 System.out.print("Highest value: " + temp);
		 input.close();
	}

}
