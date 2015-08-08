import java.util.Scanner;

public class ifCanIfCannotBeATriangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter faces of the triangle, please.");
		System.out.print("Enter the first face: ");
		int a = input.nextInt();
		System.out.print("Enter the second face: ");
		int b = input.nextInt();
		System.out.print("Enter the third face: ");
		int c = input.nextInt();
		
		if ((a > (b + c)) || (b > (a + c)) || (c > (a + b))) {
			System.out.format("A triangle with faces a = %d, b = %d, c = %d, cannot exist.", a, b, c);
		} else {
			System.out.format("A triangle with faces a = %d, b = %d, c = %d, can exist.", a, b, c);
		}
		input.close();
		
	}

}
