package com.visitor.pojo;

import com.visitor.interfaces.Visitable;
import com.visitor.interfaces.Visitor;

public class Necessity implements Visitable {
private double price;
	
	public Necessity(double price) {
		if(price > 0) {
			this.price = price;
		}
		else {
			throw new IllegalArgumentException("Price cannot be less than or equal to 0.");
		}
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}
}
