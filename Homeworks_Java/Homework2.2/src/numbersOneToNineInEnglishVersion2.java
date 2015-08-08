import java.util.Scanner;

public class numbersOneToNineInEnglishVersion2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Enter a number from 1-9: ");
		byte number = input.nextByte();
		
		 do { 
			System.out.print("The number is out of the interval.\nPlease enter a number between 0-10: ");
			number = input.nextByte();
			} while ((number < 1) || (number > 9));
		
		if (number == 1) {
			 System.out.print("1 - One.");
		} else if (number == 2) {
			 System.out.print("2 - Two.");
		} else if (number == 3) {
			System.out.print("3 - Three.");
		} else if (number == 4) {
			System.out.print("4 - Four."); 
		} else if (number == 5) {
			System.out.print("5 - Five."); 
		} else if (number == 6) {
			System.out.print("6 - Six.");
		} else if (number == 7) {
			System.out.print("7 - Seven.");
		} else if (number == 8) {
			System.out.print("8 - Eight.");
		} else if (number == 9) {
			System.out.print("9 - Nine.");
		}
		input.close();
	}

}
