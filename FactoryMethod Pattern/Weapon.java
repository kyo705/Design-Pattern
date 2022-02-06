package FactoryMethod;

public class Weapon implements Item {

	@Override
	public void use() {
		System.out.println("무기를 착용했습니다.");
	}

}
