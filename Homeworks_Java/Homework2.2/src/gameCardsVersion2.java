import java.util.Scanner;

public class gameCardsVersion2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter a card (2, 3, 4, 5, 6, 7, 8, 9, 10, j, J, q, Q, k, K, a, A): ");
		char card = input.next().charAt(0);
		
		if (input.hasNext("[jJqQkKaA]")){
			System.out.print("The card is valid!");
		} else if ((card < 0) || (card > 10)) {
			System.out.print("The card is valid!");
		} else if (card == 1) {
			System.out.print("The card is valid!");
		} else if (input.next().charAt(1) > 0) {
			System.out.print("The card is invalid!");
		} else {
			System.out.print("The card is invalid!");
		}
		input.close();
	}

}
