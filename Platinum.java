package Visitor.ConcreteElement;

import Visitor.Visitable;
import Visitor.Visitor;

public class Platinum implements Visitable{

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
