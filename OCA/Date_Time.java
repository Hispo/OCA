// Number 16.0
// Page 138

import java.time.*;

class Date_Time{
	public static void main(String[] args) {
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());

		LocalDate date1 = LocalDate.of(2017, Month.NOVEMBER, 26);
		System.out.println(date1);
		date1 = date1.plusMonths(2);
		System.out.println(date1);

		LocalTime time1 = LocalTime.of(8, 43);
		System.out.println(time1);
		time1.plusMinutes(3);
		System.out.println(time1);

		LocalDateTime dateTime = LocalDateTime.of(date1, time1)
		.minusDays(1).minusHours(2).minusSeconds(45);

		System.out.println(dateTime);
		
		System.out.println();
		System.out.println();


		// Working with Periods
		LocalDate start = LocalDate.of(2017, Month.FEBRUARY, 3);
		LocalDate   end = LocalDate.of(2017, Month.APRIL, 25);
		Period period = Period.ofMonths(1);
		performAnimalEnrichment(start, end, period);
	} // end main

	private static void performAnimalEnrichment(LocalDate start,
		LocalDate end, Period period) {
			LocalDate upTo = start;
			while(upTo.isBefore(end)) { // check if still before end
				System.out.println("Give new toy: " + upTo);
				upTo = upTo.plus(period); // add the period
			}
	} // end performAnimalEnrichment()
} // end class Date_Time