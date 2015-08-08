package exercise3;

import java.util.Scanner;

public class Vegitables extends Stock {

	String typeVegitable;
	String color;
	
	public Vegitables() {

		this.typeVegitable = "";
		this.color = "";
	}
	
	public Vegitables(String typeVegitable2, String color2) {

		this();
		this.typeVegitable = typeVegitable2;
		this.color = color2;
	}

	public String getTypeVegitable() {
		return typeVegitable;
	}

	public void setTypeVegitable(String typeVegitable) {
		this.typeVegitable = typeVegitable;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public void TellInfoVegitable() {
		System.out.println("Vegitable type: " + this.typeVegitable);
		System.out.println("Its color: " + this.color);
	}
	
	public void vegitablesInput() {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Enter the vegitable type: ");
		String typeVegitable = input.nextLine();
		System.out.print("Enter its color: ");
		String color = input.nextLine();
		System.out.print("Enter the price: ");
		float price = input.nextFloat();
		
		
		
		Vegitables vegitables = new Vegitables(typeVegitable, color);
		
		vegitables.TellInfoVegitable();
		System.out.println("Vegitable price: " + vegitables.getPrice(price) + "\nAvailable: " + vegitables.isAvailable(this.available));
		
	
		
	}

}
