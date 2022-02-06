package FactoryMethod;

public class WeaponFactory extends Factory{

	@Override
	protected void moneydown() {
		System.out.println("���� ���ݸ�ŭ �� ���ҽ�Ŵ");
	}

	@Override
	protected Item createitem() {
		System.out.println("���� ����");
		Item weapon = new Weapon();
		return weapon;
	}

	@Override
	protected void dbsave() {
		System.out.println("���� ���� ��� mysql�� ����");
	}

}
