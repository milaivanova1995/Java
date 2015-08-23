package exercise5_Patterns;

public class Phone extends Device {

	public Phone() {
		super();
	}
	
	public Phone(String model, String brand) {
		super(model, brand);
	}
	
	@Override
	public void getInfo() {
		System.out.println("Model: " + this.model + "\nBrand: " + this.brand);
		System.out.println("The device is: phone.");
	}
}
