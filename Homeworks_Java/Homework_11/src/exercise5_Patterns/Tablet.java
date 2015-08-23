package exercise5_Patterns;

public class Tablet extends Device {

	public Tablet() {
		super();
	}
	
	public Tablet(String model, String brand) {
		super(model, brand);
	}
	
	@Override
	public void getInfo() {
		System.out.println("Model: " + this.model + "\nBrand: " + this.brand);
		System.out.println("The device is: tablet.");
	}
}
