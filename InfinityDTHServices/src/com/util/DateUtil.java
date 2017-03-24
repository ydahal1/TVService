package com.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DateUtil {
	private static final Logger logger = LogManager.getLogger(DateUtil.class);
	
	public static Date convertStringToDate(String dateString, String format) {
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		Date date = null;

		try {
			date = formatter.parse(dateString);
		} catch (ParseException e) {
			logger.error(e.getMessage());
		}
		
		return date;
	}
}
