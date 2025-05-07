package com.karthik.utils.core;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * -------------------------------------------------------
 * Author  : karthik
 * Created : 7 May 2025
 * Project : java-utility-toolkit
 * Class   : DateTimeUtils
 * -------------------------------------------------------
 */

public class DateTimeUtils {

	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
	// Format current date/time
	public String getCurrentDateTime() {
		return LocalDateTime.now().format(formatter);
	}
	
	// Parse a date/time from a string
	public LocalDateTime parseDateTime(String dateTimeStr) {
		return LocalDateTime.parse(dateTimeStr, formatter);
	}
	
}
