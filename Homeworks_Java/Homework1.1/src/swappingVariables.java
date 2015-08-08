
public class swappingVariables {

	public static void main(String[] args) {
		
		int number1 = 5;
		int number2 = 8;
		
		System.out.println("The value of the first variable is: " + number1);
		System.out.println("The value of the second variable is: " + number2);
		
		number1 += number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		
		System.out.println("After swapping: The value of the first variable is: " + number1);
		System.out.println("After swapping: The value of the second variable is: " + number2);
		

	}

}
