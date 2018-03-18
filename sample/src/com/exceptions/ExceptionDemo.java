package com.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			throw new ChildException("Child Exception");
		} catch (ChildException e) {
			System.out.println("Caught ChildException : "+e);
		} catch (BaseException e) {
			System.out.println("Caught BaseException : "+e);
		}
	}

}

class BaseException extends Exception {
	private String message;
	BaseException(String message) {
		super();
		this.message = message;
	}
}

class ChildException extends BaseException {
	private String message;
	ChildException(String message) {
		super(message);
	}
}