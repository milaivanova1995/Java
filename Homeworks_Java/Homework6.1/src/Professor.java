public class Professor extends Lecturer implements homeworkCheck, heldExams {
	String title;

	public Professor() {
		super();
	}

	public Professor(String firstName, String lastName, byte serviceLength, String uniName, String title) {
		super(firstName, lastName, serviceLength, uniName);
		setTitle(title);

	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void checkTitle() {
		
		System.out.println("Professor " + getFirstName() + getLastName() + " has title " + this.title 
				+ " and has " + getServiceLength() + " years of working experience.");
	}

	public void checkingHomework() {
		System.out.println("The homework is checked.");
	}

	public void examsHeld() {
		System.out.println("I can held exams.");
	}
}
