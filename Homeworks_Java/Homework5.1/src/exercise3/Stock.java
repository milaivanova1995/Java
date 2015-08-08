package exercise3;

public abstract class  Stock {

	protected float price;
	protected boolean available = true;
	
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public float getPrice(float price) {
		return price;
	}


	public void setAvailable(boolean available) {
		this.available = available;
	}

	public boolean isAvailable(boolean available) {
		return available;
	}

	
	
	public static void main(String[] args) {
		
		Meat meat = new Meat();
		meat.meatInput();
		Vegitables vegitables = new Vegitables();
		vegitables.vegitablesInput();
		Fruits fruits = new Fruits();
		fruits.fruitsInput();
		Drinks drinks = new Drinks();
		drinks.drinksInput();
		Desserts desserts = new Desserts();
		desserts.dessertsInput();
		
	}

}
