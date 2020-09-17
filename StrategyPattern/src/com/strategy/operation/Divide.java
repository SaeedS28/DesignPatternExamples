package com.strategy.operation;

import com.strategy.operable.Operable;

public class Divide implements Operable {

	@Override
	public double doOperation(double num1, double num2) {
		if(num2 == 0) {
			throw new IllegalArgumentException("The denominator cannot be 0");
		}
		return (num1 / num2);
	}
	
}