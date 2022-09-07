package aug30;

import java.util.Scanner;

public class StudentResluts {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of student");
		int numberOfStudents = scan.nextInt();
		scan.close();
		Result students[] = new Result[numberOfStudents];

		// create result object for specified number of students
		for (int index = 0; index < numberOfStudents; index++) {

			System.out.println("Enter details of student" + (index + 1));
			students[index] = new Result();	

		}

		// Display details and result of each number of students
		for (int index = 0; index < numberOfStudents; index++) {

			students[index].show();
			students[index].show_marks();
			students[index].show_sportswt();
			students[index].showResults();

		}
	}

}
