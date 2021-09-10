package org.pahappa.systems.exceptions;
public class ValidationFailedException extends Exception {

	ValidationFailedException(String message){
		super("Validation failure because" + message);
	}
	private static final long serialVersionUID = 1L;
}
