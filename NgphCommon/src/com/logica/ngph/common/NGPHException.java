package com.logica.ngph.common;

public class NGPHException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3585299887606559543L;
	
	public NGPHException(){
		super();
	}
	public NGPHException(String message){
		super(message);
	}
	public NGPHException(String message,Throwable cause){
		super(message,cause);
		
	}
	public NGPHException(Throwable cause){
		super(cause);
		
	}
}
