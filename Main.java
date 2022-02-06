package FactoryMethod;

public class Main {
	public static void main(String[] args) {
		
		Factory weaponfac = new WeaponFactory();
		Item weapon = weaponfac.process();
		weapon.use();
		
		Factory defensefac = new DefenseFactory();
		Item defense = defensefac.process();
		defense.use();
	}
}
