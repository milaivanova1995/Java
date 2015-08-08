package exercise3;

import java.util.Scanner;

public class Drinks extends Stock {

	String producedWhere;
	String drinkName;

	public Drinks() {
		this.producedWhere = "";
		this.drinkName = "";
	}
	
	public Drinks(String data, String name) {
		this();
		this.producedWhere = data;
		this.drinkName = name;
	}

	public String getProducedWhen() {
		return producedWhere;
	}

	public void setProducedWhen(String producedWhen) {
		this.producedWhere = producedWhen;
	}

	public String getDrinkName() {
		return drinkName;
	}

	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}
	
	public void TellInfoDrinks() {
		System.out.println("Where it is produced: " + this.producedWhere);
		System.out.println("The name of the drink: " + this.drinkName);
	}
	
	public void drinksInput() {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Enter where it is produced the drink: ");
		String producedWhere = input.nextLine();
		System.out.print("Enter its name: ");
		String name = input.nextLine();
		System.out.print("Enter the price: ");
		float price = input.nextFloat();	
		
		
		
		Drinks drinks = new Drinks(producedWhere, name);
		
		drinks.TellInfoDrinks();
		System.out.println("Drink's price: " + drinks.getPrice(price) + "\nAvailable: " + drinks.isAvailable(super.available));
	}
}













