package fibonacciClient;

import java.math.BigInteger;
import java.util.List;

import org.emc.fibonacci.*;

/*
 * This is a Fibonacci client which consumes the the Fibonacci Web Service.
 */

public class FibonacciClient {

	
	public static void main(String[] args) {
		
		//create the instance of the Web Service
		FibonacciSequenceService fibonacciSequenceService = new FibonacciSequenceService();
		
		//Get the port for the service
		FibonacciWebService fibonacciPort = fibonacciSequenceService.getFibonacciSequencePortName();

		List<BigInteger> fibSequence;
		try {
			// Call the Fibonacci Operation and provide input as a integer
			fibSequence = fibonacciPort.getFibonacciSequenceOperation(10);
			System.out.println(fibSequence);
		} catch (MyException_Exception e) {
			
			System.out.println(e.getFaultInfo().getMessage());
		}
		
		
	}
}
