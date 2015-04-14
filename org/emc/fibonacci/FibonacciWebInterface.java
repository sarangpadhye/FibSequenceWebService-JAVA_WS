package org.emc.fibonacci;

import java.math.BigInteger;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/*
 * Interface to define the WebService and the Webmethods
 */
@WebService(name="FibonacciWebService")
public interface FibonacciWebInterface {

	@WebMethod(action = "getFibonacciSequence",operationName="getFibonacciSequenceOperation")
	@WebResult(name="FibonacciSequence")
	public List<BigInteger> getFibonacciSequence(@WebParam(name = "InputNumber") int InputNumber) throws MyException;
	 
}
