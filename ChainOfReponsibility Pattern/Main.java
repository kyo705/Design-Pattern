package ChainOfResposibility;

public class Main {

	public static void main(String[] args) {
		Attack attack = new Attack(100);
		Item1 item1 = new Item1(10);
		Item2 item2 = new Item2(40);
		
		//책임 객체를 연결시킴
		item1.nextItemChain(item2);
		//명령 객체(attack)를 책임 객체를 통해 수행시킴
		item1.amonutdamage(attack);
		
		System.out.println(attack.getDamage());

	}

}
