import java.util.Scanner;

public class surfaceTriangle {

	public static void main(String[] args) {
		
		double a, h;
		Scanner input = new Scanner(System.in,  "UTF-8");
		
		System.out.print("Enter the lenght of the triangle's base in meters: ");
		a = input.nextDouble();
		System.out.print("Enter the lenght of the triangle's height in meters: ");
		h = input.nextDouble();
		
		System.out.print("The surface of the triangle is: " + ((a * h)/2) + " m^2");
		input.close();

	}

}
