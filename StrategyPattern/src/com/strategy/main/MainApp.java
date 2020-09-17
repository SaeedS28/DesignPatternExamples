package com.strategy.main;

import com.strategy.operable.Operable;
import com.strategy.operation.Add;
import com.strategy.operation.Divide;
import com.strategy.operation.Multiply;
import com.strategy.operation.Operate;
import com.strategy.operation.Subtract;

// Strategy Pattern is when we create
// objects which represent various strategies and a context object whose behavior varies 
// as per its strategy object. The strategy object changes the executing algorithm of the context object.

public class MainApp {

	public static void main(String[] args) {
		Operate op = new Operate();
		
		Operable add  = new Add();
		Operable subtract  = new Subtract();
		Operable mult  = new Multiply();
		Operable divide  = new Divide();
		
		op.setOperation(add);
		System.out.println(op.performOperation(12, 13));
		op.setOperation(subtract);
		System.out.println(op.performOperation(12, 13));
		op.setOperation(mult);
		System.out.println(op.performOperation(12, 13));
		op.setOperation(divide);
		System.out.println(op.performOperation(12, 13));
		//System.out.println(op.performOperation(12, 0));
	}

}
