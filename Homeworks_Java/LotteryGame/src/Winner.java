
public class Winner {

	private String ID;
	private String numbers;

	public Winner(String ID, String numbers) {
		setID(ID);
		setNumbers(numbers);
	}

	public String getID() {
		return this.ID;
	}

	public void setID(String iD) {
		this.ID = iD;
	}

	public String getNumbers() {
		return this.numbers;
	}

	public void setNumbers(String numbers) {
		this.numbers = numbers;
	}

}
