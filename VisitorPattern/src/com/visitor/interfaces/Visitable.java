package com.visitor.interfaces;

public interface Visitable {
	double accept(Visitor visitor);
}
