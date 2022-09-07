package sep6;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class DateApiExample {

	public static void main(String[] args) {

		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
		System.out.println("today's date " + dateTime.format(format));
		System.out.println(dateTime.getDayOfWeek().name());
		Duration duration = Duration.ofDays(365);
		System.out.println("After one year on this date the week is " + dateTime.plus(duration).getDayOfWeek().name());  
		System.out.println("gap between this in hours " + Duration.between(dateTime, dateTime.plus(duration)));
		LocalDateTime year = dateTime.plus(2, ChronoUnit.YEARS);
		System.out.println("next to next year is " + year);
		
	}

}
