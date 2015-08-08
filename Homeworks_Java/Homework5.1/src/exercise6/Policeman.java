package exercise6;

public class Policeman extends Employee {
	
	protected String rang;
	
	public Policeman() {
		
		super();
		this.rang = "";
	}

	public Policeman(short hoursPerMonth, float salary, String rang) {
		
		super(hoursPerMonth, salary);
		this.rang = rang;
	}

	public String getRang() {
		return rang;
	}

	public void setRang(String rang) {
		this.rang = rang;
	}
	
	
}
