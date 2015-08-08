import java.util.Scanner;

public class input2integers {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System. in, "UTF-8");
		
		System.out.print("The value of \'a\' is :\n a = ");
		a = input.nextInt();
		System.out.print("The value of \'b\' is :\n b = ");
		b = input.nextInt();
		
		int result1 = a % b;
		System.out.print("The value of the reminder of \'a\' % \'b\':\na % b = " + result1);
		
		int result2 = b % a;
		System.out.print("\nThe value of the reminder of \'b\' % \'a\':\nb % a = " + result2);
		input.close();

	}

}
