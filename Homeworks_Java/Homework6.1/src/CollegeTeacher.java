public class CollegeTeacher extends Teacher implements homeworkCheck, writeArticles {
	
	String collegeName;

	public CollegeTeacher() {
		super();
		this.collegeName = "";

	}

	public CollegeTeacher(String firstName, String lastName, byte serviceLength, String subject, String collegeName) {
		super(firstName, lastName, serviceLength, subject);
		this.collegeName = collegeName;

	}
	
	public String getNameofcollege() {
		return this.collegeName;
	}

	public void setNameofcollege(String collegeName) {
		this.collegeName = collegeName;
	}



	public void checkingHomework() {
		System.out.println("The homework has been checked!");
	}

	public void printWritingArticle() {
		System.out.println("I can write articles.");
	}
}
