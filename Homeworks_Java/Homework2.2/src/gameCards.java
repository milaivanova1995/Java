import java.util.Scanner;

public class gameCards {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter a card: ");
		String card = input.nextLine();
		
		switch(card){
		
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "10":
		case "j":
		case "J":
		case "q":
		case "Q":
		case "k":
		case "K":
		case "a":
		case "A":
			System.out.println("The card is valid!");
			break;	
		default:
			System.out.println("The card is invalid!");
			break;
		}
		
		input.close();

	}

}
