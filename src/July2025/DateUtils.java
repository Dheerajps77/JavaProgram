package July2025;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	private static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";
	private static final String DEFAULT_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

	// 1. Parse date from string
	public static Date parseDate(String dateString) throws ParseException {
		return new SimpleDateFormat(DEFAULT_DATE_FORMAT).parse(dateString);
	}

	// 2. Parse datetime from string
	public static Date parseDateTime(String dateTimeString) throws ParseException {
		return new SimpleDateFormat(DEFAULT_DATE_TIME_FORMAT).parse(dateTimeString);
	}

	// 3. Format date to string
	public static String formatDate(Date date) {
		return new SimpleDateFormat(DEFAULT_DATE_FORMAT).format(date);
	}

	// 4. Format datetime to string
	public static String formatDateTime(Date date) {
		return new SimpleDateFormat(DEFAULT_DATE_TIME_FORMAT).format(date);
	}

	// 5. Format with custom pattern
	public static String formatDate(Date date, String pattern) {
		return new SimpleDateFormat(pattern).format(date);
	}

	// 6. Validate date string format
	public static boolean isValidDate(String dateStr, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		sdf.setLenient(false);
		try {
			sdf.parse(dateStr);
			return true;
		} catch (ParseException e) {
			return false;
		}
	}

	// 7. Add days
	public static Date addDays(Date date, int days) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, days);
		return calendar.getTime();
	}

	// 8. Subtract days
	public static Date subtractDays(Date date, int days) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, -days);
		return calendar.getTime();
	}

	// 9. Are two dates equal
	public static boolean areDatesEqual(Date date1, Date date2) {
		return date1.compareTo(date2) == 0;
	}

	// 10. Is date1 before date2
	public static boolean isDateBefore(Date date1, Date date2) {
		return date1.compareTo(date2) < 0;
	}

	// 11. Is date1 after date2
	public static boolean isDateAfter(Date date1, Date date2) {
		return date1.compareTo(date2) > 0;
	}

	// 12. Get current date
	public static Date getCurrentDate() {
		return new Date();
	}

	// 13. Get current year
	public static int getCurrentYear() {
		return LocalDate.now().getYear();
	}

	// 14. Get current timestamp as string
	public static String getCurrentTimestamp() {
		return formatDateTime(new Date());
	}

	// 15. Difference in days
	public static long getDifferenceInDays(Date startDate, Date endDate) {
		long diffMillis = endDate.getTime() - startDate.getTime();
		return diffMillis / (1000 * 60 * 60 * 24);
	}

	// 16. Difference in hours
	public static long getDifferenceInHours(Date startDate, Date endDate) {
		long diffMillis = endDate.getTime() - startDate.getTime();
		return diffMillis / (1000 * 60 * 60);
	}

	// 17. Is weekend
	public static boolean isWeekend(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		return day == Calendar.SATURDAY || day == Calendar.SUNDAY;
	}

	// 18. Is leap year
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

	// 19. Get start of day
	public static Date getStartOfDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	// 20. Get end of day
	public static Date getEndOfDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 999);
		return calendar.getTime();
	}

	// 21. Get first day of month
	public static Date getFirstDayOfMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		return cal.getTime();
	}

	// 22. Get last day of month
	public static Date getLastDayOfMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		return cal.getTime();
	}

	// 23. Convert Date to LocalDate
	public static LocalDate convertToLocalDate(Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	// 24. Convert Date to LocalDateTime
	public static LocalDateTime convertToLocalDateTime(Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	}

	// 25. Convert LocalDate to Date
	public static Date convertToDate(LocalDate localDate) {
		return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
	}

	// Optional: You can add a private constructor to prevent instantiation
	private DateUtils() {
		// Utility class
	}

	public static void main(String[] args) throws ParseException {
		Date currentDate = DateUtils.getCurrentDate();
		System.out.println("Current Date: " + DateUtils.formatDate(currentDate));

		// Parsing
		Date parsedDate = DateUtils.parseDate("2025-07-15");
		System.out.println("Parsed Date: " + parsedDate);

		// Formatting
		System.out.println("Formatted DateTime: " + DateUtils.formatDateTime(currentDate));

		// Add/Subtract Days
		System.out.println("Add 5 Days: " + DateUtils.formatDate(DateUtils.addDays(currentDate, 5)));
		System.out.println("Subtract 5 Days: " + DateUtils.formatDate(DateUtils.subtractDays(currentDate, 5)));

		// Date comparisons
		System.out.println("Is Today After Parsed Date? " + DateUtils.isDateAfter(currentDate, parsedDate));
		System.out.println("Are Dates Equal? " + DateUtils.areDatesEqual(currentDate, parsedDate));

		// Date differences
		System.out.println("Days Difference: " + DateUtils.getDifferenceInDays(parsedDate, currentDate));
		System.out.println("Hours Difference: " + DateUtils.getDifferenceInHours(parsedDate, currentDate));

		// Start and end of day
		System.out.println("Start of Day: " + DateUtils.formatDateTime(DateUtils.getStartOfDay(currentDate)));
		System.out.println("End of Day: " + DateUtils.formatDateTime(DateUtils.getEndOfDay(currentDate)));

		// Weekend check
		System.out.println("Is Weekend: " + DateUtils.isWeekend(currentDate));

		// Leap year check
		System.out.println("Is 2024 Leap Year: " + DateUtils.isLeapYear(2024));

		// First and last day of month
		System.out.println("First Day of Month: " + DateUtils.formatDate(DateUtils.getFirstDayOfMonth(currentDate)));
		System.out.println("Last Day of Month: " + DateUtils.formatDate(DateUtils.getLastDayOfMonth(currentDate)));

		// Conversions
		LocalDate localDate = DateUtils.convertToLocalDate(currentDate);
		System.out.println("LocalDate: " + localDate);

		LocalDateTime localDateTime = DateUtils.convertToLocalDateTime(currentDate);
		System.out.println("LocalDateTime: " + localDateTime);

		Date dateFromLocal = DateUtils.convertToDate(LocalDate.now());
		System.out.println("Date from LocalDate: " + DateUtils.formatDate(dateFromLocal));
	}
}
