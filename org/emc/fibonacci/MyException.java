package org.emc.fibonacci;

/*
 * Custom Exception to record the details about the error
 */
public class MyException extends Exception {
	private String errorDetails;
	public MyException(String reason, String errDetails)
	{
		super(reason);
		this.errorDetails = errDetails;
	}
	
	public String getFaultInfo()
	{
		return errorDetails;
	}
}
