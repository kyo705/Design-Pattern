package FactoryMethod;

public class DefenseFactory extends Factory {

	@Override
	protected void moneydown() {
		System.out.println("방어구 가격만큼 돈 감소시킴");
	}

	@Override
	protected Item createitem() {
		System.out.println("무기 생성");
		Item defense = new Defense();
		return defense;
	}

	@Override
	protected void dbsave() {
		System.out.println("무기 생성 기록 mysql에 저장");
	}

}
