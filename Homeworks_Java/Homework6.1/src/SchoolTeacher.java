
public class SchoolTeacher extends Teacher implements homeworkCheck, entertainKids {
	
	String[] classes = new String[5];
	
	public SchoolTeacher() {
		super();

	}

	public SchoolTeacher(String firstName, String lastName, byte serviceLength, String subject, String[] classes) {
		super(firstName, lastName, serviceLength, subject);
		setClasses(classes);

	}

	public String[] getClasses() {
		return this.classes;
	}

	public void setClasses(String[] classes) {
		this.classes = classes;
	}



	public void checkingHomework() {
		System.out.println("The homework has been checked!");
	}

	public void printEK() {
		System.out.println("I can entertain kids.");
	}

	public void sayClasses() {
		
		System.out.println("Classes: ");
		for (String string : classes) {
			System.out.println(string);
		}
	}
}
