import java.util.Scanner;

public class BonusPointsInGameVersion2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Enter the points from 1-9: ");
		short points = input.nextShort();
		
		if ((points < 1) || (points > 9)) {
			do {
				System.out.print("The points are out of the interval.\nPlease enter points between 0-10: ");
				points = input.nextShort();
			} while ((points < 1) || (points > 9));
		}
		
		switch (points) {
		case 1: 
		case 2:
		case 3: points = (short) (points * 5);
			break;
		case 4:
		case 5:
		case 6: points = (short) (points * 10);
			break;
		case 7:
		case 8:
		case 9: points = (short) (points * 50);
			break;
		}
		
		System.out.print("The value of the bonus points is: " + points);
		input.close();
	}

}
