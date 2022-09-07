package aug30;

public class Test extends Student {
	private int subject1Marks, subject2Marks, subject3Marks;

	// Assign marks
	Test() {
		// take input for user
		System.out.println("Enter subject 1 marks :");
		subject1Marks = scan.nextInt();
		System.out.println("Enter subject 2 marks :");
		subject2Marks = scan.nextInt();
		System.out.println("Enter subject 3 marks :");
		subject3Marks = scan.nextInt();
	}

	// getter method for subject 1 marks
	int getSubject1Marks() {
		return subject1Marks;
	}

	// getter method for subject 2 marks
	int getSubject2Marks() {
		return subject2Marks;
	}

	// getter method for subject 3 marks
	int getSubject3Marks() {
		return subject3Marks;
	}

	// display test marks of each subject
	void show_marks() {
		System.out.println("\nSubject 1 marks: " + subject1Marks + "\nsubject 2 marks: " + subject2Marks
				+ "\nsubject 3 marks: " + subject3Marks);
	}

}
