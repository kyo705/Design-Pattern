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
		System.out.println("���� ��� : ����");
	}

	@Override
	public void visit(Silver silver) {
		System.out.println("���� ��� : ����");
		
	}

	@Override
	public void visit(Gold gold) {
		System.out.println("���� ��� : ��Ų(�¸��� �𸣰���)");
		
	}

	@Override
	public void visit(Platinum platinum) {
		System.out.println("���� ��� : ��Ų(�¸��� �𸣰���), ��Ų ���� 1��");
		
	}

	@Override
	public void visit(Diamond diamond) {
		System.out.println("���� ��� : ��Ų(�¸��� �𸣰���), ��Ų ���� 2��");
		
	}

}
