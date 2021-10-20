package Visitor;

import Visitor.ConcreteElement.Gold;
import Visitor.ConcreteElement.Silver;
import Visitor.ConcreteVisitor.Rewarding;

public class Main {

	public static void main(String[] args) {
		Visitor rewarding = new Rewarding();

		Visitable gold = new Gold();
		Visitable silver = new Silver();
		
		gold.accept(rewarding);
		silver.accept(rewarding);
	}

}
