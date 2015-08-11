package Students;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		String name = null, lastName = null, subject = null;
		int number = 0, mark = 0;
		Student[] students = new Student[3];
		

		for (int i = 1; i < 4; i++) {
			System.out.format("Student %d first name: ", i);
			name = input.nextLine();
			System.out.format("Student %d last name: ", i);
			lastName = input.nextLine();
			System.out.format("Student %d number: ", i);
			number = input.nextInt();
			students[i] = new Student(name, lastName, number);
			
			for (int j = 1; j < 6; j++) {
				System.out.format("Subject %d: ", j);
				input.nextLine();
				subject = input.nextLine();
				
				for (int n = 0; n < 3; n++) {
					System.out.print("Add a mark: ");
					mark = input.nextInt();
					students[i].addSubjectMark(subject, mark);
				}
			}
			input.nextLine();
		}

		System.out.print("Average mark of subject: ");
		subject = input.nextLine();
		System.out.format("Average mark for subject %s is %.2f\n", subject, Student.calculateAverageMark(subject, students));
		testPrint(students);
		input.close();
	}
	
	public static void testPrint(Student[] students) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Average mark of subject: ");
		String subject = input.nextLine();
		System.out.format("Average mark for subject %s is %.2f\n", subject, Student.calculateAverageMark(subject, students));
		testPrint(students);
		input.close();
	}
}
