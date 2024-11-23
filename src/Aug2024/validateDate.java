package Aug2024;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class validateDate {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Request user input
        System.out.println("Enter the date (dd/MM/yyyy):");
        String date = sc.nextLine();
        
        // Validate the date format
        if (!isValidDate(date)) {
            System.out.println(date + " is not a valid date");
            return;
        }
        
        // Split the date to extract day, month, and year
        String[] str = date.split("/");
        int day = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int year = Integer.parseInt(str[2]);
        
        // Check the validity of the day and month
        if (isValidDayMonth(day, month, year)) {
            System.out.println(date + " is a valid date");
        } else {
            System.out.println(date + " is not a valid date");
        }
    }
    
    // Method to check if the date format is valid
    public static boolean isValidDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);  // Set lenient to false to enforce strict parsing
        try {
            dateFormat.parse(date);  // Try parsing the date
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
    
    // Method to check the validity of the day and month
    public static boolean isValidDayMonth(int day, int month, int year) {
        // Check for invalid months
        if (month < 1 || month > 12) {
            return false;
        }
        
        // Handle February (leap year and non-leap year cases)
        if (month == 2) {
            if (isLeapYear(year)) {
                return day >= 1 && day <= 29;
            } else {
                return day >= 1 && day <= 28;
            }
        }
        
        // Handle months with 30 days
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day >= 1 && day <= 30;
        }
        
        // Handle months with 31 days
        return day >= 1 && day <= 31;
    }
    
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}