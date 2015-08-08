import java.util.Scanner;

public class surfaceRectangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in,  "UTF-8");
		
		System.out.print("Enter the lenght of the rectangle in meters: ");
		double a = input.nextDouble();
		System.out.print("Enter the width of the rectangle in meters: ");
		double b = input.nextDouble();
		
		System.out.print("The surface of the rectangle is: " + (a * b) + " m^2");
		input.close();
	}

}
