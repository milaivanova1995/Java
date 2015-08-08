import java.util.Scanner;

public class BonusPointsInGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Enter the points from 1-9: ");
		double points = input.nextDouble();
		
		if ((points < 1) || (points > 9)) {
			do {
				System.out.print("The points are out of the interval.\nPlease enter points between 0-10: ");
				points = input.nextShort();
			} while ((points < 1) || (points > 9));
		}
		
		if ((points > 0) && (points < 4)) {
			points = points * 5;
		} else if ((points > 3) && (points < 7)) {
			points = points * 10;
		} else if ((points > 6) && (points < 10)) {
			points = points * 50;
		}
		
		System.out.print("The value of the bonus points is: " + points);
		input.close();
	}

}
