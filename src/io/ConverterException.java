package io;

public class ConverterException extends Exception {
	private String message = null;
	
	public ConverterException() {
		super();
	}
	
	public ConverterException(String message) {
		super(message);
		this.message = message;
	}
	
	@Override
	public String toString() {
		return message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}