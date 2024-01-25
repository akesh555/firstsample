package assign;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateTime {

	public static void main(String args[]) {
		
		LocalDate  now =LocalDate.now();
		
		LocalDate customDate=LocalDate.of(2024, 1, 3);
		
		LocalDate parsedate=LocalDate.parse("2023-12-02");
		System.out.println(parsedate);
		System.out.println(customDate);
		System.out.println(now);
		System.out.println(now.getDayOfYear());
		System.out.println(now.getMonth());//name of the month
		System.out.println(now.getMonthValue());//number format of the month.
		System.out.println(now.minusDays(2));
		System.out.println(now.minusMonths(3));
		System.out.println(now.plusWeeks(2));
	System.out.println(now.isAfter(customDate));//validation T/F;
	    System.out.println(now.isBefore(now));
	    System.out.println(now.isEqual(now));
	    System.out.println(now.lengthOfMonth());
	    System.out.println(now.isSupported(ChronoUnit.HALF_DAYS));
	    
	    
		
	}
	}

