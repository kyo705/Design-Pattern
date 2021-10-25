package Strategy;

public class Sword implements Weapon{

	@Override
	public void install() {
		System.out.println("장착 무기 변경 => (검)");
	}

}
