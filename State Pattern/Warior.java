package State;

public class Warior {

	private Weapon weapon;
		
	private Weapon Gun = new Weapon() {
		
		@Override
		public void install() {
			weapon = Gun;
			System.out.println("���� ���� : ��");
		}
	};
	
	private Weapon Sword = new Weapon() {
		
		@Override
		public void install() {
			weapon = Sword;
			System.out.println("���� ���� : ��");
		}
	};
	
	//�ʱ� ���� �� ���� ���� ��
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
