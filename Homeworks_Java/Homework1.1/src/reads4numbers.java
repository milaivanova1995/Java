import java.util.Scanner;

public class reads4numbers {

	public static void main(String[] args) {
		int a, b, c, d;
		
		Scanner read = new Scanner(System.in, "UTF-8");
		System.out.print("Please enter four numbers:");
		System.out.print("\na = ");
		a = read.nextInt();
		System.out.print("b = ");
		b = read.nextInt();
		System.out.print("c = ");
		c = read.nextInt();
		System.out.print("d = ");
		d = read.nextInt();
		
		System.out.format("\na + b + c + d = ?\n%d + %d + %d + %d = %d", a, b, c, d, (a + b + c + d));
		read.close();

	}

}
