package exercise5;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	private double Celsius;

	public CelsiusToFahrenheit() {
		Celsius = 0;
	}

	public CelsiusToFahrenheit(double celsius) {
		setCelsius(celsius);
	}
	
	public double getCelsius() {
		return Celsius;
	}

	public void setCelsius(double celsius) {
		Celsius = celsius;
	}



	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		CelsiusToFahrenheit CtoF = new CelsiusToFahrenheit();
		System.out.print("Enter degrees in Celsius. The program will convert them to Fahrenheit: ");
		CtoF.Celsius = input.nextDouble();
		CtoF.print();
		input.close();

	}
	
	public double converter(double celsius) {
		
		double farenhait = ((Celsius / 5 * 9) + 32);
		return farenhait;

	}
	
	public void print() {
		System.out.println(Celsius + " degrees in Celsius " +  "are equals to " + converter(Celsius) + " degrees in Fahrenheit.");
	}


}
