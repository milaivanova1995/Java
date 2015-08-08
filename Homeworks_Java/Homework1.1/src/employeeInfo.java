import java.util.Scanner;

public class employeeInfo {

	public static void main(String[] args) {
		int choice;
		Scanner input = new Scanner(System.in, "UTF-8");
		
		do {
			
			
			System.out.print("1. Enter information about an employee.\n2. Exit.\n");
			System.out.print("Choose an option from 1-2: ");
			choice = input.nextInt();
			input.nextLine();
			System.out.print("\n\n");
			
			if (choice == 1) {
					System.out.print("Please enter the employee's name: ");
					String employeeName = input.nextLine();
		
					System.out.print("Please enter the employee's family name: ");
					String employeeFName = input.nextLine();
		
					System.out.print("Please enter the employee's age: ");
					byte employeeAge = input.nextByte();
		
					System.out.print("Please enter the employee's sex (f or m): ");
					char employeeSex = input.next().charAt(0);
		
					System.out.print("Please enther the employee's EGN: ");
					long employeeEGN = input.nextLong();
		
					System.out.print("Please enter the employee's phone number starting with the country code (eg. 359XXXXXXXXX): ");
					long employeePNumber = input.nextLong();
		
					System.out.print("\n\nEmployee's information:");
					System.out.print("\n\nEmployee's name: " + employeeName);
					System.out.print("\nEmployee's family name: " + employeeFName);
					System.out.print("\nEmployee's age: " + employeeAge);
					System.out.print("\nEmployee's sex: " + employeeSex);
					System.out.print("\nEmployee's EGN: " + employeeEGN);
					System.out.print("\nEmployee's phone number: +" + employeePNumber);
					System.out.print("\n\n\n");
					
			}
			if (choice == 2) {
					System.out.print("Exit.");
					System.exit(2);
			}	 
					
		} while(choice != 2);
		input.close();
	}
	

}