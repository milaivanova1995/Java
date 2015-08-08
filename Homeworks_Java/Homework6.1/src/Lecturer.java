public class Lecturer extends Person implements homeworkCheck, GreetingHi {
	
	String uniName;
	
	final short MAX_LECTURS = 10;
	

	public Lecturer() {
		super();
		this.uniName = "";

	}

	public Lecturer(String firstName, String lastName, byte serviceLength, String uniName) {
		
		super(firstName, lastName, serviceLength);
		this.uniName = uniName;

	}

	public String getUniname() {
		return uniName;
	}


	public void exerciseHeld(double pointsP) {

	}

	public void exerciseHeld(double pointsHW, double mark) {

	}

	public void exerciseHeld(double pointsL, int extraPoints) {

	}

	public void checkingHomework() {
		System.out.println("The homework has been checked!");
	}

	public void greetingHi() {
		System.out.println("Hello");
	}

	public void howManyLectures() {
		System.out.println("Max lectures per week are: " + MAX_LECTURS);
	}
}
