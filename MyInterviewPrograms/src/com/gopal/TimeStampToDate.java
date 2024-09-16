package com.gopal;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStampToDate {

	public static void main(String[] args) {
		System.out.println(extracted("1712646000002"));
	}

	private static String extracted(String timeStamp) {
		Date currentDate = new Date(Long.parseLong(timeStamp));
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM YYYY");
		String Date = sdf.format(currentDate);
		return Date;
	}

}
