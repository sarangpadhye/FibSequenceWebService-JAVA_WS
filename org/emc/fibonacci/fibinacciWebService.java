package org.emc.fibonacci;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

/*
 * Implementation of Fibonacci as a Web service
 */
@WebService(endpointInterface = "org.emc.fibonacci.FibonacciWebInterface", portName = "FibonacciSequencePortName", serviceName = "FibonacciSequenceService")
public class fibinacciWebService implements FibonacciWebInterface {

	@Override
	public List<BigInteger> getFibonacciSequence(int InputNumber)
			throws MyException {
		List<BigInteger> fibonacciSequence = new ArrayList<BigInteger>();
		List<BigInteger> tempSequence = new ArrayList<BigInteger>();
		fibonacciSequence.add(BigInteger.ZERO);
		fibonacciSequence.add(BigInteger.ONE);

		if (InputNumber == 0) {
			tempSequence.add(fibonacciSequence.get(0));
			return tempSequence;

		} else if (InputNumber == 1) {
			tempSequence.add(fibonacciSequence.get(1));
			return tempSequence;

		} else if (InputNumber < 0 || InputNumber != (int) InputNumber) {
			throw new MyException("Invalid Input", InputNumber
					+ " is not a valid input");		
	}	else {
			for (int i = 2; i < InputNumber; i++) {
				fibonacciSequence.add(fibonacciSequence.get(i - 1).add(
						fibonacciSequence.get(i - 2)));
			}
			return fibonacciSequence;
		}
	}
}
