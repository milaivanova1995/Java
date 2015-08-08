package exercise2;

public class Car {

	protected float price;
	
	public Car() {
		this.price = 11;
	}
	
	public Car(float price) {
		this();
		this.price = price;
	}
	
	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public static void main(String[] args) {
		
		Car car = new Car();
		Car[] arrayCars = new Car[10];
		
		System.out.println("The sorted list of the cars' price is: ");
		car.fillArray(arrayCars);
		car.sortArray(arrayCars);
		car.printCars(arrayCars);

	}
	
	

	public void fillArray(Car[] array) {
		
		array[0] = new Automobile(18050, 4.3);
		array[1] = new Automobile(120154, 3.6);
		array[2] = new Automobile(245233, 4.2);
		array[3] = new Automobile(95000, 1.8);
		array[4] = new Automobile(12000, 9.3);
		
		array[5] = new SUV(5003, true);
		array[6] = new SUV(9500, false);
		array[7] = new SUV(78000, true);
		array[8] = new SUV(1200912, true);
		array[9] = new SUV(5200, false);
		
		
		
	}
	
	public void sortArray(Car[] arrayCars) {
		
		
		for (int i = 0; i < arrayCars.length; i++) {
			for (int j = 0; j < arrayCars.length - i - 1; j++) {
				
				if (arrayCars[j].getPrice() > arrayCars[j + 1].getPrice()) {
					
					float swap = arrayCars[j].getPrice();
					arrayCars[j].setPrice(arrayCars[j + 1].getPrice());
					arrayCars[j + 1].setPrice(swap);
					
				}
			}
		}
	}
	
	public void printCars(Car[] array) {
		
		for (Car car: array) {
			System.out.println(car.getPrice());
		}
		
	}
}





















