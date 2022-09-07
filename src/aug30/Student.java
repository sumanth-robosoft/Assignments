package aug30;

import java.util.Scanner;

public class Student {
	private String studentName, studentRollNumer;
	Scanner scan = new Scanner(System.in);

	// get student details
	Student() {
		// take input for user
		System.out.println("Enter student name :");
		studentName = scan.next();
		System.out.println("Enter student Roll number :");
		studentRollNumer = scan.next();
	}

	// getter method for student name
	String getStudentName() {
		return studentName;
	}

	// getter method for student Roll number
	String getStudentRollNumer() {
		return studentRollNumer;
	}

	// show student details
	void show() {
		System.out.println("name: " + studentName + "\nRoll Number: " + studentRollNumer);
	}

}
