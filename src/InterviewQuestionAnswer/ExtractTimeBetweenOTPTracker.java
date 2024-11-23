package InterviewQuestionAnswer;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExtractTimeBetweenOTPTracker {

    public static LocalDateTime parseDateTime(String dateTimeStr, DateTimeFormatter formatter) {
        // Replace unnecessary spaces in the date-time string before parsing
        return LocalDateTime.parse(dateTimeStr.replace(" ", ""), formatter);
    }

    public static String calculateDuration(LocalDateTime startTime, LocalDateTime endTime) {
        Duration duration = Duration.between(startTime, endTime);
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        return hours + " hours, " + minutes + " minutes";
    }


    public static void printResults(String trackingId, String mobileOtpTimeStr, String reviewOtpTimeStr,
                                     String rmOtpTimeStr, String mobileToReviewAge, String reviewToRmAge) {
        System.out.println("Sr.No\tTracking ID\tMobile OTP\t\tReview OTP\t\tRM OTP\t\tMobile OTP - Review OTP (Customer Journey OTP Age)\tReview OTP - RM OTP (RM Journey OTP Age)");
        System.out.println("1\t" + trackingId + "\t" + mobileOtpTimeStr + "\t" + reviewOtpTimeStr + "\t" + rmOtpTimeStr + "\t" 
                + mobileToReviewAge + "\t" + reviewToRmAge);
    }

    public static void main(String[] args) {
        // Sample data
        String mobileOtpTimeStr = "03-10-2024, 4:29 PM";  // Mobile OTP
        String reviewOtpTimeStr = "02-10-2024, 4:35 PM";  // Review OTP
        String rmOtpTimeStr = "04-10-2024, 4:53 PM";     // RM OTP (24-hour format with seconds)

        // Define the date-time format for parsing
        DateTimeFormatter mobileReviewFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy, h:mm a"); // 12-hour format
        DateTimeFormatter rmFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy, HH:mm:ss"); // 24-hour format

        // Parse the date-time strings
        LocalDateTime mobileOtpTime = parseDateTime(mobileOtpTimeStr, mobileReviewFormatter);
        LocalDateTime reviewOtpTime = parseDateTime(reviewOtpTimeStr, mobileReviewFormatter);
        LocalDateTime rmOtpTime = parseDateTime(rmOtpTimeStr, rmFormatter);

        // Calculate OTP ages
        String mobileToReviewAge = calculateDuration(mobileOtpTime, reviewOtpTime);
        String reviewToRmAge = calculateDuration(reviewOtpTime, rmOtpTime);

        // Print the results
        printResults("24100134924", mobileOtpTimeStr, reviewOtpTimeStr, rmOtpTimeStr, mobileToReviewAge, reviewToRmAge);
    }
}
