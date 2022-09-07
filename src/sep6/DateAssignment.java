package sep6;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//How to find the   today's date in Java 8 
//
//2.       How to get a current day, month, and year in Java 8 
//
//3.       How to get a particular date in Java 8 
//
//4.       How to check if two dates are equal in Java 8 
//
//5.       How to check for recurring events e.g. birthday in Java 8 
//
//6.       How to check Leap Year in Java 8 
//
//7.       How to get current Time in Java 8 
//
//8.       Add hours to the time 
//
//9.       Find the date before  and after one year

public class DateAssignment {
	public static void main(String[] args) {
		//get  today's date
		LocalDateTime currentDate = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
		System.out.println("today's date is " + currentDate.format(format));
		
		// get a current day, month, and year
		System.out.println("current day : " + currentDate.getDayOfMonth());
		System.out.println("current Month : " + currentDate.getMonthValue());
		System.out.println("current day : " + currentDate.getYear());
		
		// get a particular date
		System.out.println("Enter date  of this month to get the day ");
		Scanner scan = new Scanner(System.in);
		int date = scan.nextInt();
		LocalDateTime dateDetail = LocalDateTime.of(LocalDate.of(currentDate.getYear(), currentDate.getMonth(), date),
				currentDate.toLocalTime());
		System.out.println(dateDetail.getDayOfWeek());
		
		// check if two dates are equal
		System.out.println("Entered date is same as current date?" + currentDate.isEqual(dateDetail));
		
		//check for recurring events e.g. birthday
		if (currentDate.getMonth()==Month.MARCH&&currentDate.getDayOfMonth()==31) {
			System.out.println("Yes,your Birthday!! HAPPY BIRTHDAY");
		} else {
			System.out.println("Sorry, today is not your birthday");
		}
		
		//check Leap Year
		System.out.println("Enter year to check Leap year or not");
		int checkLeapYear = scan.nextInt();
		scan.close();
		LocalDate leapdate = LocalDate.now().withYear(checkLeapYear);
		if (leapdate.isLeapYear()) {
			System.out.println(leapdate.getYear() + " is Leap Year");
		} else
			System.out.println(leapdate.getYear() + " is not Leap Year");
		
		//get current Time
		System.out.println("Current time is " + LocalTime.now());
		
		// Add hours to the time
		System.out.println("Adding 2 hours to Current time is " + LocalTime.now().plusHours(2));
		
		//the date before one year
		Duration duration = Duration.ofDays(365);
		LocalDateTime before = currentDate.minus(duration);
		System.out.println("Date before one year is " + before.format(format) + " and day is " + before.getDayOfWeek());
		//the date after one year
		LocalDateTime after = currentDate.plus(duration);
		System.out.println("Date After one year is " + after.format(format) + " and day is " + before.getDayOfWeek());

	}

}
