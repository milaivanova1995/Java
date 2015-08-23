package exercise5_Patterns;

public abstract class Device implements DeviceInfo {

	protected String model, brand;
	
	public Device() {
		this.model = "some model";
		this.brand = "some brand";
	}
	
	public Device(String model, String brand) {
		this();
		setModel(model);
		setBrand(brand);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public void getInfo() {
		System.out.println("Model: " + this.model + "\nBrand: " + this.brand);
	}
}
