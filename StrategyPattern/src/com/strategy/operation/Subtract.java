package com.strategy.operation;

import com.strategy.operable.Operable;

public class Subtract implements Operable {
	@Override
	public double doOperation(double num1, double num2) {
		return (num1 - num2);
	}

}