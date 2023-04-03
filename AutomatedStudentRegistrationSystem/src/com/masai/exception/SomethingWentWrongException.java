package com.masai.exception;

public class SomethingWentWrongException extends Exception {
	public SomethingWentWrongException(String message, Exception ex) {
		super(message);
	}

	public SomethingWentWrongException(String string) {
		// TODO Auto-generated constructor stub
	}
}
