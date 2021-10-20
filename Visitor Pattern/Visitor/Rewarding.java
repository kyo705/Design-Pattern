package Visitor.ConcreteVisitor;

import Visitor.Visitor;
import Visitor.ConcreteElement.Bronze;
import Visitor.ConcreteElement.Diamond;
import Visitor.ConcreteElement.Gold;
import Visitor.ConcreteElement.Platinum;
import Visitor.ConcreteElement.Silver;

public class Rewarding implements Visitor{

	@Override
	public void visit(Bronze bronze) {
		System.out.println("보상 목록 : 없음");
	}

	@Override
	public void visit(Silver silver) {
		System.out.println("보상 목록 : 없음");
		
	}

	@Override
	public void visit(Gold gold) {
		System.out.println("보상 목록 : 스킨(승리의 모르가나)");
		
	}

	@Override
	public void visit(Platinum platinum) {
		System.out.println("보상 목록 : 스킨(승리의 모르가나), 스킨 상자 1개");
		
	}

	@Override
	public void visit(Diamond diamond) {
		System.out.println("보상 목록 : 스킨(승리의 모르가나), 스킨 상자 2개");
		
	}

}
