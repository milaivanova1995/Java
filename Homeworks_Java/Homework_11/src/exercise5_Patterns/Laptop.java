package exercise5_Patterns;

public class Laptop extends Device {
	
	public Laptop() {
		super();
	}
	
	public Laptop(String model, String brand) {
		super(model, brand);
	}

	@Override
	public void getInfo() {
		System.out.println("Model: " + this.model + "\nBrand: " + this.brand);
		System.out.println("The device is: laptop.");
	}
}
