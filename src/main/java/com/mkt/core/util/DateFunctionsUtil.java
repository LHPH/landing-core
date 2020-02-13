package com.mkt.core.util;

import static com.mkt.core.constants.ConstantsGeneral.FORMAT_DATE_DAY_MONTH_YEAR_TIME_WITH_SLASH;
import static com.mkt.core.constants.ConstantsGeneral.FORMAT_DATE_DAY_MONTH_YEAR_WITH_SLASH;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

import com.mkt.core.base.BaseUtil;

public class DateFunctionsUtil extends BaseUtil{

	
	public static Date stringToDate(String date,String format) {
		
		try {
			SimpleDateFormat sd = new SimpleDateFormat(format);
			return sd.parse(date);
		}
		catch(ParseException ex) {
			return null;
		}
	}
	
	public static Date stringToDate(String date) {
		
		try {
			SimpleDateFormat sd = new SimpleDateFormat(FORMAT_DATE_DAY_MONTH_YEAR_WITH_SLASH);
			return sd.parse(date);
		}
		catch(ParseException ex) {
			return null;
		}
	}
	
	public static LocalDate stringToLocalDate(String date) {
		
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT_DATE_DAY_MONTH_YEAR_WITH_SLASH);
			return LocalDate.parse(date,formatter);
		}
		catch(DateTimeParseException ex) {
			return null;
		}
	}
	
	public static LocalDate stringToLocalDate(String date,String format) {
		
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
			return LocalDate.parse(date,formatter);
		}
		catch(DateTimeParseException ex) {
			return null;
		}
	}

	public static LocalDateTime stringToLocalDateTime(String date) {
		
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT_DATE_DAY_MONTH_YEAR_TIME_WITH_SLASH);
			return LocalDateTime.parse(date,formatter);
		}
		catch(DateTimeParseException ex) {
			return null;
		}
	}
	
	public static LocalDateTime stringToLocalDateTime(String date,String format) {
		
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
			return LocalDateTime.parse(date,formatter);
		}
		catch(DateTimeParseException ex) {
			return null;
		}
	}
	
	public static String dateToString(Date date,String format) {
		
		SimpleDateFormat sd = new SimpleDateFormat(format);
		return sd.format(date);
		
	}
	
	public static String dateToString(Date date) {
		
		SimpleDateFormat sd = new SimpleDateFormat(FORMAT_DATE_DAY_MONTH_YEAR_WITH_SLASH);
		return sd.format(date);
		
	}
	
	public static String dateLocaltoString(LocalDate date,String format) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		return formatter.format(date);
	}
	
	public static String dateLocaltoString(LocalDate date) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT_DATE_DAY_MONTH_YEAR_WITH_SLASH);
		return formatter.format(date);
	}
	
	public static String dateLocalTimetoString(LocalDateTime date,String format) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		return formatter.format(date);
	}
	
	public static String dateLocalTimetoString(LocalDateTime date) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT_DATE_DAY_MONTH_YEAR_TIME_WITH_SLASH);
		return formatter.format(date);
	}

	public static LocalDate dateToLocalDate(Date date) {
		
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}
	
	public static LocalDateTime dateToLocalDateTime(Date date) {
		
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	}
	
	public static Date localDateToDate(LocalDate date) {
		return Date.from(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
	}
	
	public static Date localDateTimeToDate(LocalDateTime date) {
		return Date.from(date.atZone(ZoneId.systemDefault()).toInstant());
	}
	
}
