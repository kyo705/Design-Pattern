package FactoryMethod;

public class DefenseFactory extends Factory {

	@Override
	protected void moneydown() {
		System.out.println("�� ���ݸ�ŭ �� ���ҽ�Ŵ");
	}

	@Override
	protected Item createitem() {
		System.out.println("���� ����");
		Item defense = new Defense();
		return defense;
	}

	@Override
	protected void dbsave() {
		System.out.println("���� ���� ��� mysql�� ����");
	}

}
