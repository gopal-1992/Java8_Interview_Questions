package com.gopal.logical;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertDate {
	
	// Method to convert timestamp to UTC formatted date
	   public static String convertTimestampToUTC(long timestamp) {
	       // Convert the timestamp to an Instant
	       Instant instant = Instant.ofEpochMilli(timestamp);
	       // Define the time zone as UTC and convert the Instant to ZonedDateTime
	       ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("America/New_York"));
	       // Define the expected output format
	       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
	       // Format the ZonedDateTime to the expected output format
	       return zonedDateTime.format(formatter);
	   }
	   public static void main(String[] args) {
	       // Example timestamp to be converted
	       long timestamp = 1722268800000L;
	       // Call the conversion method
	       String formattedDate = convertTimestampToUTC(timestamp);
	       // Print the formatted date in UTC
	       System.out.println("Formatted UTC Date: " + formattedDate);
	   }
}
