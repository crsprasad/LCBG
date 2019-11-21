package com.logica.ngph.common.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;


public class PropertyReader {

	static Logger logger = Logger.getLogger(PropertyReader.class);
	private final String propName = "System.properties";
	
	private static Map<String, String> propertyMap = new HashMap<String, String>();
	
		public PropertyReader()
		{
			Properties props = new Properties();
			try 
			{
				props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(propName));			
				
				propertyMap.put("RTGS", props.getProperty("RTGS"));
				propertyMap.put("NEFT", props.getProperty("NEFT"));
				propertyMap.put("IMPS", props.getProperty("IMPS"));
				propertyMap.put("SWIFT", props.getProperty("SWIFT"));
				propertyMap.put("SFMS", props.getProperty("SFMS"));
				propertyMap.put("INFO_EI_O", props.getProperty("INFO_EI_O"));
				propertyMap.put("INFO_EI_I", props.getProperty("INFO_EI_I"));
			/*	propertyMap.put("INFO_EI", props.getProperty("INFO_EI"));*/
				
				logger.info("Property file Initialized "+"INFO_EI_O="+props.getProperty("INFO_EI_O")+ "INFO_EI_I="+props.getProperty("INFO_EI_I")+"map det="+propertyMap.toString());
			} 
			catch (Exception e) 
			{
				logger.error("Error Occured while Reading Property File", e);
			}
		}
		
		public static String getMapValue(String key)
		{
			String value = null;
			try
			{
				value = propertyMap.get(key);
			}
			catch (Exception e) 
			{
				logger.error("Error Occured while Fetching Property Map Value", e);
			}

			return value;
		}
}
