package org.pahappa.systems.exceptions;
public class ValidationFailedException extends Exception {


	private static final long serialVersionUID = 1L;
	ValidationFailedException(String message){
		super(message);
	}
}
