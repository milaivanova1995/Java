import java.util.Scanner;

public class findingRootsOfQuadraticEquation {

	public static void main(String[] args) {
	
		   Scanner input = new Scanner(System.in, "UTF-8");
		   System.out.println("Enter 3 coefficients for the quadratic equation.");
		   System.out.print("a = ");
		   float a = input.nextFloat();
		   System.out.print("b = ");
		   float b = input.nextFloat();
		   System.out.print("c = ");
		   float c = input.nextFloat();
		   System.out.print("The quadratic equation is:\n" + a + "x^2 + " + b + "x + " + c + " = 0\n");
		 
		   double discriminant = b * b - 4 * a * c;
		   double root1 = 0;
		   double root2 = 0;
		   
	        if (discriminant > 0) {
	        	
	            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	            
	            System.out.printf("\n\nroot1 = (-%.2f - Math.sqrt(discriminant)) / (2 * %.2f)\n", b, a);
	            System.out.printf("root1 = (-%.2f + Math.sqrt(discriminant)) / (2 * %.2f)\n\n", b, a);
	            System.out.print("The equation has two real roots:\nRoot1 = " + root1 + "\nRoot2 = " + root2);
	        }
	 
	        if (discriminant == 0) {
	        	
	            root1 = -b / (2 * a);
	            root2 = root1;
	            
	            System.out.printf("\n\nroot1 = (-%.2f) / (2 * %.2f)\n\n", b, a);
	            System.out.print("The equation has one root:\nRoot1\\Root2 = " + root2);
	        }
	 
	        if (discriminant < 0) {
	            System.out.println("The equation has no real root.");
	        } 
	        input.close();
	}

}
