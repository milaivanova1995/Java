public class Teacher extends Person implements homeworkCheck, GreetingHi, GreetingBye {
	
	protected String subject;
	
	public Teacher() {
		super();
		this.subject = "";
	}
	
	public Teacher(String firstName, String lastName, byte serviceLength, String subject) {
		super(firstName, lastName, serviceLength);
		this.subject = subject;

	}

	
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}


	public void checkingHomework() {
		System.out.println("The homework has been checked!");
	}

	public void greetingHi() {
		System.out.println("Hello");

	}

	public void greetngBye() {
		System.out.println("Goodbye");		
	}

}
