package exercise4;

import java.util.Scanner;

import exercise3.Desserts;
import exercise3.Drinks;
import exercise3.Fruits;
import exercise3.Meat;
import exercise3.Stock;
import exercise3.Vegitables;

public class Shop extends Stock {

	protected String name;
	protected String location;
	protected Stock[] stock;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
	public Stock[] getStock() {
          return stock;
	}
	  
	public void setStock(Stock[] stock) {
          this.stock = stock;
	}
	
	
	
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.addProducts();
		shop.removeProduct(shop);

	}
	

	
	public void removeProduct(Stock product) {
		
          product.setAvailable(false);
          System.out.println("The product is unavailable.");
	}
	
	public void addProducts() {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		int choice;
		
			
			do {
				System.out.println("Choose a product to enter: \n1. Dessert \n2. Drinks \n3. Fruits \n4. Meat \n5. Vegetables \n6. Exit \nYour choice: ");
				choice = input.nextInt();
				
			switch (choice) {
			case 1:
				Desserts desserts = new Desserts();
				desserts.dessertsInput();
				break;
			case 2:
				Drinks drinks = new Drinks();
				drinks.drinksInput();
				break;
			case 3:
				Fruits fruits = new Fruits();
				fruits.fruitsInput();
				break;
			case 4:
				Meat meat = new Meat();
				meat.meatInput();
				break;
			case 5:
				Vegitables vegitables = new Vegitables();
				vegitables.vegitablesInput();
				break;
			case 6: 
				System.out.print("Exit.");
				System.exit(6);
			default:
				System.out.println("Wrong choice");
			} 
			} while (choice != 6);
		
		input.close();
	}

	


}
