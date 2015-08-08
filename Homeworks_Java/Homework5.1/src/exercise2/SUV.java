	package exercise2;

public class SUV extends Car {
	
	protected boolean conductivity;

	public SUV() {
		super();
		conductivity = true;
	}

	public SUV(int price, boolean conductivity) {
		super(price);

	}

	public boolean isConductivity() {
		return conductivity;
	}

	public void setConductivity(boolean conductivity) {
		this.conductivity = conductivity;
	}
	
	

}
