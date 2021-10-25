package Strategy;

public class Warior {

	private Weapon weapon;
	
	public void wear(Weapon weapon) {
		this.weapon = weapon;
		weapon.install();
	}
}
