package exercise5_Patterns;

import java.util.Scanner;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.print("Choose a device /laptop, phone, tablet/: ");
		String choice = input.nextLine();
		if (!choice.contains("laptop") && !choice.contains("phone") && !choice.contains("tablet")) {
			throw new NullPointerException("Wrong input. Enter: \"laptop\", \"phone\" or \"tablet\".");
		}
		Device device = DeviceFactory.getDevice(choice);
		device.getInfo();
		
		input.close();
	}

}
