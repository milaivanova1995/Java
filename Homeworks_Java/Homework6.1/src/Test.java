import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		String[] classes = { "1G", "2G", "3G", "4G", "5G" };
		
		Teacher teacher = new Teacher("Milena", "Gorcheva", (byte) 16, "Literature");
		SchoolTeacher schoolTeacher = new SchoolTeacher("Milcho", "Minev", (byte) 26, "Biology", classes);
		CollegeTeacher collegeTeacher = new CollegeTeacher("Yoana", "Stoeva", (byte) 3, "English", "Romain Rolland");
		
		Lecturer lecturer = new Lecturer("Daniela", "Gotseva", (byte) 100, "TU");
		Professor professor = new Professor("Georgi", "Stanchev", (byte) 29, "TU", "professor");
		Assistant assistant = new Assistant("Yavor", "Tomov", (byte) 9, "TU", true);

		Scanner input = new Scanner(System.in, "UTF-8");
		int choice;
		
			
			do {
				System.out.print("Choose to see an information about: \n1. Teacher \n2. School Teacher \n3. College Teacher \n4. Lecturer \n5. Professor \n6. Assistant \n7. Counted people \n6. Exit. \nYour choice: ");
				choice = input.nextInt();
				
			switch (choice) {
			case 1:
				System.out.println("Teacher:");
				System.out.println("Name: " + teacher.firstName + "\t"  + teacher.lastName 
						+ "\n" + "Length of service: " + teacher.serviceLength 
						+ "\n" + "Subject: " + teacher.subject);
				teacher.greetingHi();
				teacher.checkingHomework();
				teacher.greetngBye();
				System.out.println();
				break;
			case 2:
				System.out.println("School Teacher:");
				System.out.println("Name: " + schoolTeacher.firstName + "\t"  + schoolTeacher.lastName 
						+ "\n" + "Length of service: " + schoolTeacher.serviceLength 
						+ "\n" + "Subject: " + schoolTeacher.subject);
				schoolTeacher.checkingHomework();
				schoolTeacher.sayClasses();
				schoolTeacher.printEK();
				System.out.println();
				break;
			case 3:
				System.out.println("College Teacher:");
				System.out.println("Name: " + collegeTeacher.firstName + "\t"  + collegeTeacher.lastName 
						+ "\n" + "Length of service: " + collegeTeacher.serviceLength 
						+ "\n" + "Subject: " + collegeTeacher.subject + "\n" + "College name: " + collegeTeacher.collegeName);
				collegeTeacher.checkingHomework();
				collegeTeacher.printWritingArticle();
				System.out.println();
				break;
			case 4:
				System.out.println("Lecturer:");
				System.out.println("Name: " + lecturer.firstName + "\t"  + lecturer.lastName 
						+ "\n" + "Length of service: " + lecturer.serviceLength 
						+ "\n" + "University name: " + lecturer.uniName);
				lecturer.greetingHi();
				lecturer.checkingHomework();
				lecturer.exerciseHeld(6.7);
				lecturer.exerciseHeld(12.7, 7.7);
				lecturer.exerciseHeld(10, 8);
				lecturer.howManyLectures();
				System.out.println();
				break;
			case 5:
				System.out.println("Professor:");
				System.out.println("Name: " + professor.firstName + "\t"  + professor.lastName 
						+ "\n" + "Length of service: " + professor.serviceLength 
						+ "\n" + "University name: " + professor.uniName);
				professor.checkingHomework();
				professor.checkTitle();
				professor.examsHeld();
				System.out.println();
				break;
			case 6: 
				System.out.println("Assistant:");
				System.out.println("Name: " + assistant.firstName + "\t"  + assistant.lastName 
						+ "\n" + "Length of service: " + assistant.serviceLength 
						+ "\n" + "University name: " + assistant.uniName);
				assistant.checkingHomework();
				assistant.tellHeadAssistant(true);
				assistant.checkingExams();
				System.out.println();
				break;
			case 7:
				System.out.println("It counted " + Person.counter + " people.");
				break;
			case 8: 
				System.out.print("Exit.");
				System.exit(8);
			default:
				System.out.println("Wrong choice.");
			} 
			} while (choice != 8);
		
		input.close();
		
		
	}
	
}
