package FactoryMethod;

public class WeaponFactory extends Factory{

	@Override
	protected void moneydown() {
		System.out.println("무기 가격만큼 돈 감소시킴");
	}

	@Override
	protected Item createitem() {
		System.out.println("무기 생성");
		Item weapon = new Weapon();
		return weapon;
	}

	@Override
	protected void dbsave() {
		System.out.println("무기 생성 기록 mysql에 저장");
	}

}
