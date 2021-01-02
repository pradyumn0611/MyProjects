package com.yash.exceptions;

public class InvalidNumberException extends Exception {
	
	public  InvalidNumberException()
	{
		super("Number should be between 1 and 3");
	}
	public InvalidNumberException(String message) {
	super(message);
	}
	

}
