package com.logica.ngph.common.utils;

import java.sql.Timestamp;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import org.apache.log4j.Logger;

import com.logica.ngph.common.enums.EnumDateFormat;
import com.logica.ngph.common.enums.EnumTimeFormat;

/**
 * A helper class to validate a given date and time
 * @author Prasad. B.S.R.
 * @version 1.0, 30/November/2009
 * @since 1.0
 */
public class DateHelper {
	//private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DateHelper.class);
	//private static final Logger logger = Logger.getLogger(DateHelper.class);
	
	/**
	 * Validates a given date.
	 * @param inDate {@link String} - Format:yyyyMMdd
	 * @return {@link Boolean}
	 */
	public static boolean isValidDate(String inDate, EnumDateFormat dateFormat) throws Exception{
		
		boolean result=true;
		if (inDate == null || inDate.trim().equals("")) 
		{
			result= false;
		}
		
		//Set the format to use as an constructor argument
		SimpleDateFormat sdFormat = new SimpleDateFormat(dateFormat.getFormat());
		
		//Check the length of the date
		if (inDate.trim().length() != sdFormat.toPattern().length()) {
			result= false;
		}

		//Parse the inDate parameter
		sdFormat.setLenient(false);
		try {
			sdFormat.parse(inDate.trim());
		} catch (ParseException pe) {
			result= false;
			throw new Exception(pe);
		}
		return result;
	}
	
	
	/**
	 * Verifies whether a given year is a leap year or not.
	 * @param year <tt>int</tt>
	 * @return {@link Boolean}
	 */
	public static boolean isLeapYear(int year){
        if((year%100 != 0) || (year%4 == 0)){
            return true;
        }
        return false;
   }
	
	public static boolean isValidTime(String inTime, EnumTimeFormat timeFormat) {
		Pattern pattern = null;
		Matcher matcher;
		
		pattern = Pattern.compile(timeFormat.getRegExPattern());
		matcher = pattern.matcher(inTime);
		return matcher.matches();
	}

	/**
	 * Returns system date in the specified format
	 * @param dateFormat {@link String}
	 * @return {@link String}
	 */
	public static String getSystemDate(EnumDateFormat dateFormat ) {
	    Calendar cal = Calendar.getInstance();
	    SimpleDateFormat sdFormat = new SimpleDateFormat(dateFormat.getFormat());
	    return sdFormat.format(cal.getTime());
	}
	
	/**
	 * Returns system time in the specified format
	 * @param dateFormat {@link String}
	 * @return {@link String}
	 */
	public static String getSystemTime(EnumTimeFormat timeFormat) {
	    Calendar cal = Calendar.getInstance();
	    SimpleDateFormat sdFormat = new SimpleDateFormat(timeFormat.getFormat());
	    return sdFormat.format(cal.getTime());
	}
	
	/**
	 * Parses a date string and returns the value as of type java.util.Date.
	 * @param inDate {@link String}
	 * @param dateFormat {@link EnumDateFormat}
	 * @return {@link java.util.Date}
	 */
	public static java.util.Date parse(String inDate, EnumDateFormat dateFormat) throws Exception{
		Date formattedDate = null;
		try {
			formattedDate = new SimpleDateFormat(dateFormat.getFormat()).parse(inDate);
		} catch (ParseException e) {
			
				StringBuilder sbError = new StringBuilder();
				sbError.append("Unable to parse the date: ").append(inDate);
				sbError.append(" with the given foramt: ").append(dateFormat.getFormat());
				//logger.debug(sbError.toString());
			
				throw new Exception(e);
		
		}		return formattedDate;
		
	}
	
	/**
	 * Parses a string and returns the value as of type java.sql.TimeStamp.
	 * @param inDateTime {@link String}
	 * @param timeFormat {@link EnumTimeFormat}
	 * @return {@link java.sql.Timestamp}
	 */
	public static Timestamp parseTime(String inDateTime, EnumDateFormat dareFormat) throws Exception{
		SimpleDateFormat sdf= new SimpleDateFormat(dareFormat.getFormat());
		java.util.Date dt = null;
		try {
			dt = sdf.parse(inDateTime);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	    return new Timestamp(dt.getTime());
	}
	
	/**
	 * Parses a date and returns the value as of type string.
	 * @param inDate {@link Date}
	 * @param dateFormat {@link EnumDateFormat}
	 * @return
	 */
	public static String parseDate(Date inDate, EnumDateFormat dateFormat) throws Exception{
		String s = null;
		try {
			DateFormat formatter;
			formatter = new SimpleDateFormat(dateFormat.getFormat());
			s = formatter.format(inDate);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return s;
	}

	
	public static String timeStampFormatter(Object o)
	{
		if(o.toString().contains("00:00:00.0"))
		{
			String dataVal = o.toString().substring(0, 10);
			return dataVal.replace("-", "");
		}
		else
		{
			String dataVal = o.toString().substring(0, o.toString().indexOf("."));
			String hiphen  = dataVal.replace("-", "");
			String space = hiphen.replace(" ", "");
			String colon = space.replace(":", "");
			//SFMS date only should be returned
			return colon.substring(0, 8);    
		}
	}
	
	public static String bigDecimalFormatter(Object o)
	{
		String ret = null;
		if (o.toString().contains("."))
		{
			ret = o.toString().replace(".", ",");
		}
		else
		{
			ret = o.toString() + ",00";
		}
		return ret;
	}
	
}
