package com.karthik.utils.core;

/**
 * -------------------------------------------------------
 * Author  : karthik
 * Created : 7 May 2025
 * Project : java-utility-toolkit
 * Class   : StringUtils
 * -------------------------------------------------------
 */

public class StringUtils {
	
	// Checks if a string is empty or null
	public boolean isEmpty(String str) {
		return str == null || str.trim().isEmpty();
	}

	// Capitalizes the first letter of the string
	public String capitalize(String str) {
		
		if(isEmpty(str)) {
			return str;
		}
		
		return str.substring(0,1).toUpperCase()+str.substring(1);
	}
	
}
