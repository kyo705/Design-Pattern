package Strategy;

public class Main {

	public static void main(String[] args) {
		Warior warior = new Warior();
		
		Weapon gun = new Gun();
		Weapon sword = new Sword();
    
		warior.wear(gun);
		warior.wear(sword);
	}
}
