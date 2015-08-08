package exercise2;

public class Automobile extends Car {

	protected float expense;
	
	public Automobile() {
		super();
	}

	public Automobile(int price, double expense) {
		super(price);

	}

	public float getExpense() {
		return expense;
	}

	public void setExpense(float expense) {
		this.expense = expense;
	}
	
	

}
