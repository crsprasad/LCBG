package com.logica.ngph.common.enums;

public enum IsoFieldEnum {

	// Field Mapping done here.
	YYMMHHMMSS("YYMMHHMMSS"),
	MMDDHHMMSS("MMDDHHMMSS"),
	LAST("LAST"),
	HHMMSS("HHMMSS"),
	YYMM("YYMM"),
	MMDD("MMDD"),
	FIRST("FIRST"),
	APPLEN("APPLEN"),
	APPLEN2("APPLEN2"),
	APPLEN3("APPLEN3"),
	PADSPACE("PADSPACE"),
	CHARREPL("CHARREPL");
	
	// local variable used for Enum
	String tagName;

	// User Defined Constructor for this Enum
	IsoFieldEnum(String tagName) 
	{
		this.tagName = tagName;
	}

	// Static Method that will return the Enum Val based on Tag Value
	public static IsoFieldEnum findEnumByTag(String tagName) 
	{
		for (IsoFieldEnum oneEnumSample : IsoFieldEnum.values()) {
			if (oneEnumSample.tagName.equalsIgnoreCase(tagName))
				return oneEnumSample;

		}
		return null;
	}

}
