package org.pahappa.systems.exceptions;
public class SavingFailedException extends Exception {

	public SavingFailedException(String message){
		super("Incident not saved because" + message);
	}
	private static final long serialVersionUID = 1L;

}
