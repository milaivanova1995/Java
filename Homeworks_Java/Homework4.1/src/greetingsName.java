import java.util.Scanner;

public class greetingsName {

	public static void main(String[] args) {
		
		String name = inputFullName();
		System.out.print("Greeting, " + name + "!");
		
	}

	private static String inputFullName() {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Enter your full name, please: ");
		String fullName = input.nextLine();
		input.close();
		return fullName;
		
	}
	
	
}
