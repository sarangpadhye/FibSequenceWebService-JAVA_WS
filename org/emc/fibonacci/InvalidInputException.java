package org.emc.fibonacci;

public class InvalidInputException extends Exception {
	
	private String errorDetails;
	public InvalidInputException(String reason, String errDetails)
	{
		super(reason);
		this.errorDetails = errDetails;
	}
	
	public String getFaultInfo()
	{
		return errorDetails;
	}

}
