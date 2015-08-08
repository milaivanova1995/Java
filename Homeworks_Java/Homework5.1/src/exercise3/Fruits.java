package exercise3;

import java.util.Scanner;

public class Fruits extends Stock {

	boolean sweet;
	String color;
	
	public Fruits () {
		this.sweet = true;
		this.color = "";
	}

	public Fruits(boolean sweet, String color) {
		this();
		this.sweet = sweet;
		this.color = color;
	}

	public boolean isSweet() {
		return sweet;
	}

	public void setSweet(boolean sweet) {
		this.sweet = sweet;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

	public void TellInfoFruits() {
		System.out.println("Is it sweet: " + this.sweet);
		System.out.println("Fruit's color: " + this.color);
	}
	
	public void fruitsInput() {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Enter the fruit's color: ");
		String color = input.nextLine();
		System.out.print("Enter the price: ");
		float price = input.nextFloat();
		
		Fruits fruits = new Fruits(sweet, color);
		
		fruits.TellInfoFruits();
		System.out.println("Fruit's price: " + fruits.getPrice(price) + "\nAvailable: " + fruits.isAvailable(this.available));
		
		
		
		
	}
}













