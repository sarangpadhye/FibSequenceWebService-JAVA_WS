package org.emc.fibonacci;

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
