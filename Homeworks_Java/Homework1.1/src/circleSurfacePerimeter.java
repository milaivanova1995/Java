import java.util.Scanner;

public class circleSurfacePerimeter {

	public static void main(String[] args) {
		
		double pi = 3.14;
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Enter the circle's radius: ");
		double radius = input.nextDouble();
		
		System.out.print("\nThe surface of the circle is:\nS = pi * r^2\nS = " + (pi * (radius * radius)) + " m^2");
		System.out.print("\nThe perimeter of the circle is:\np = 2 * pi * r\np = " + (2 * pi * radius) + " m");
		
		input.close();
	
	}

}
