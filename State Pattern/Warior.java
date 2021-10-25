package State;

public class Warior {

	private Weapon weapon;
		
	private Weapon Gun = new Weapon() {
		
		@Override
		public void install() {
			weapon = Gun;
			System.out.println("무기 상태 : 총");
		}
	};
	
	private Weapon Sword = new Weapon() {
		
		@Override
		public void install() {
			weapon = Sword;
			System.out.println("무기 상태 : 검");
		}
	};
	
	//초기 생성 시 무기 상태 검
	public Warior() {
		this.weapon = Sword;
	}

	public void wearGun() {
		Gun.install();
	}
	
	public void wearSword() {
		Sword.install();
	}
}
