package com.visitor.interfaces;

import com.visitor.pojo.Liquor;
import com.visitor.pojo.Necessity;
import com.visitor.pojo.Tobacco;

public interface Visitor {
	
	double visit(Liquor liquorItem);
	double visit(Tobacco tobaccoItem);
	double visit(Necessity necessityItem);

}
