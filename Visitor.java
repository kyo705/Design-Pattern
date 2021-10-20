package Visitor;

import Visitor.ConcreteElement.Bronze;
import Visitor.ConcreteElement.Diamond;
import Visitor.ConcreteElement.Gold;
import Visitor.ConcreteElement.Platinum;
import Visitor.ConcreteElement.Silver;

public interface Visitor {

	void visit(Bronze bronze);
	void visit(Silver silver);
	void visit(Gold gold);
	void visit(Platinum platinum);
	void visit(Diamond diamond);
}
