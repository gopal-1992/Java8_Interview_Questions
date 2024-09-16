package com.gopal;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Lastthreedigit {
public static void main(String[] args) {
	
	 System.out.println(extracted(1712646000002L));
	 

//private static String  extracted(String input) {
	/*
	 * String lastFourChars; if (input.length() > 3) { return lastFourChars =
	 * input.substring(input.length() - 3)+ "-  JPMC " + "TEST"; } else { return
	 * lastFourChars = input+ "-  JPMC " + "TEST"; }
	 */
	//taking current time from system
			//extracted();
	 
}

private static String extracted(long l ) {
	Timestamp tms = new Timestamp(l);

	// Passing the value in the Date class constructor
	Date date = new Date(tms.getTime());
	
	Locale locale = new Locale("fr", "FR");
	DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
	String date1 = dateFormat.format(date);
	//System.out.print(date);
	return date1;

	
}
}
