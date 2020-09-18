package com.visitor.businesslogic;

import com.visitor.interfaces.Visitor;
import com.visitor.pojo.Liquor;
import com.visitor.pojo.Necessity;
import com.visitor.pojo.Tobacco;

public class TaxVisitor implements Visitor {

	@Override
	public double visit(Liquor liquorItem) {
		return (liquorItem.getPrice() * 0.615);
	}

	@Override
	public double visit(Tobacco tobaccoItem) {
		return (tobaccoItem.getPrice() * 0.566);
	}

	@Override
	public double visit(Necessity necessityItem) {
		return (necessityItem.getPrice() * 0);
	}

}
