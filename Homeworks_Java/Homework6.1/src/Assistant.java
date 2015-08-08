public class Assistant extends Lecturer implements homeworkCheck, checkExams {
	
	protected boolean isHeadAssistant;

	public Assistant() {
		super();
		isHeadAssistant = true;
	}

	public Assistant(String firstName, String lastName, byte serviceLength, String uniName, boolean isHeadAssistant) {
		super(firstName, lastName, serviceLength, uniName);
		this.isHeadAssistant = isHeadAssistant;

	}
	public boolean isHeadAssistant() {
		return this.isHeadAssistant;
	}

	public void setHeadAssistant(boolean isHeadAssistant) {
		this.isHeadAssistant = isHeadAssistant;
	}

	

	public void tellHeadAssistant(boolean isHeadAssistant) {
		System.out.println("Is "+ getFirstName() + " " + getLastName() + " a head assistant: " + this.isHeadAssistant);
	}

	public void checkingHomework() {
		System.out.println("The homework is checked.");
	}

	public void checkingExams() {
		System.out.println("I can check exams.");
	}

}
