package exercise3;

import java.util.Scanner;

public class Desserts extends Stock {

	String dessertName;
	String expireDate;
	
	public Desserts() {
		this.dessertName = "";
		this.expireDate = "";
	}
	
	public Desserts(String name, String date) {
		this();
		this.dessertName = name;
		this.expireDate = date;
	}

	public String getDessertName() {
		return dessertName;
	}

	public void setDessertName(String dessertName) {
		this.dessertName = dessertName;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public void TellInfoDesserts() {
		System.out.println("The name of the dessert: " + this.dessertName);
		System.out.println("Expire date: " + this.expireDate);
	}
	
	public void dessertsInput() {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Enter the name of the dessert: ");
		String dessertName = input.nextLine();
		System.out.print("Enter its expire date: ");
		String expireDate = input.nextLine();
		System.out.print("Enter the price: ");
		float price = input.nextFloat();	
		
		
		
		Desserts desserts = new Desserts(dessertName, expireDate);
		
		desserts.TellInfoDesserts();
		System.out.println("Drink's price: " + desserts.getPrice(price) + "\nAvailable: " + desserts.isAvailable(super.available));
		
	}
}

