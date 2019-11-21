package com.logica.ngph.common.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.regex.Pattern;

import com.logica.ngph.common.enums.EnumRTGSResponseCode;

/**
 * A Utility class which provides the methods which are providing the generic data implementation
 * @author Neeraj K. Khapre
 * @version 1.0, 7/January/2010
 * @since 1.0
 */
public final class NGPHUtil {

	/**
	 * Generates the UUID using JSE 1.5 UUID class.
	 * @return {@link String}
	 */
	public static synchronized String generateUUID() {
		return UUID.randomUUID().toString();
	}
	
	/**
	 * Splits text area into String array based on delimiter
	 * @param s
	 * @param delimiter
	 * @param size TODO
	 * @return
	 */
	public static String[] split(String s, String delimiter, int size) {
		if(s == null  || s.equals("")){
			return new String[size];
		}
		StringTokenizer st = new StringTokenizer(s, delimiter);
		ArrayList<String> list = new ArrayList<String>();
		while (st.hasMoreElements()) {
			list.add(st.nextToken());
		}
		return (String[]) list.toArray(new String[size]);
	}
	
	public static CastorExceptionResult parseCastorValidationEx(String exceptionMessage) {
		Scanner errScanner = new Scanner(exceptionMessage);
		String formattedMessage = null;
		String fieldName = null;
		StringBuilder sbFormattedMessage = null;
		CastorExceptionResult castorExceptionResult = new CastorExceptionResult(); 
		
		//Starting to match from the last error message in the string
		Pattern errorMatchPattern = Pattern.compile(".*_");
		if(errScanner.hasNext()) {
			errScanner.findInLine(errorMatchPattern);
			fieldName = errScanner.next();
			castorExceptionResult.setMessageField(fieldName);
			String altField = null;
			//move past the first occurrence of the ':' char
			errScanner.findInLine(":");
			
			if (errScanner.hasNext("com\\..*")) {
				altField = errScanner.findInLine(".*sfms\\.");
				altField = errScanner.next();
			} else { //move past the first occurrence of the ':' char if present, else retain the String
				formattedMessage = errScanner.findInLine(":");
				formattedMessage = errScanner.next();
			}
			
			//fetch all the values remained.
			formattedMessage = errScanner.findInLine(".*");

			errScanner.close();
			
			if (formattedMessage.matches("(?i).*required regular expression.*")) {
				sbFormattedMessage = new StringBuilder("Invalid characters found/Invalid Format data in the ").append(fieldName).append(" field of ").append(altField.substring(0, altField.length()-1));
				castorExceptionResult.setFormattedMessage(sbFormattedMessage.toString());
				castorExceptionResult.setResponseCode(EnumRTGSResponseCode.INVALID_CHARACTERS_SINGLELINE);
			} else if (formattedMessage.matches("(?i).*maximum length.*")) {
				sbFormattedMessage = new StringBuilder(fieldName).append(" : ").append(formattedMessage);
				castorExceptionResult.setFormattedMessage(sbFormattedMessage.toString());
				castorExceptionResult.setResponseCode(EnumRTGSResponseCode.LENGTH_OF_LINE_EXCEEDED);
			} else if (formattedMessage.matches("(?i).*minimum length.*")) {
				sbFormattedMessage = new StringBuilder(fieldName).append(" : ").append(formattedMessage);
				castorExceptionResult.setFormattedMessage(sbFormattedMessage.toString());
				castorExceptionResult.setResponseCode(EnumRTGSResponseCode.LENGTH_IS_SHORTER);
			} else if (formattedMessage.matches("(?i).*xml name is.*")) {
				sbFormattedMessage = new StringBuilder("The mandatory field ").append(fieldName).append(" is empty");
				castorExceptionResult.setFormattedMessage(sbFormattedMessage.toString());
				castorExceptionResult.setResponseCode(EnumRTGSResponseCode.INVALID_MESSAGE);
			} else {
				sbFormattedMessage = new StringBuilder(fieldName).append(" : ").append(formattedMessage);
				castorExceptionResult.setFormattedMessage(sbFormattedMessage.toString());
				castorExceptionResult.setResponseCode(EnumRTGSResponseCode.INVALID_MESSAGE);
			}
		}
		return castorExceptionResult;
	}
	
	public static HashMap<String, String>getCountryName_Code()
	{
		HashMap<String, String> ctryList = new HashMap<String, String>();
		
		ctryList.put("Andorra", "AD");
		ctryList.put("United Arab Emirates", "AE");
		ctryList.put("Anguilla", "AI");
		ctryList.put("Netherlands Antilles", "AN");
		ctryList.put("Austria", "AT");
		ctryList.put("Australia", "AU");
		ctryList.put("Belgium", "BE");
		ctryList.put("Canada", "CA");
		ctryList.put("China", "CN");
		ctryList.put("Spain", "ES");
		return ctryList;
	}
	
	public static boolean isElementInList(List<String> elementList, String element){
		boolean flag = false;
		for(String id : elementList) {
			if(id.equals(element.trim())){
				flag = true;
				break;
			}
		}
		return flag;
	}
}   