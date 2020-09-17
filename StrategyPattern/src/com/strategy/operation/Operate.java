package com.strategy.operation;

import com.strategy.operable.Operable;

public class Operate {
	private Operable operation;
	
	public void setOperation(Operable operation) {
		this.operation = operation;
	}
	
	public double performOperation(double num1, double num2) {
		return this.operation.doOperation(num1, num2);
	}
}
