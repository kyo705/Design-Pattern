package ChainOfResposibility;

public class Main {

	public static void main(String[] args) {
		Attack attack = new Attack(100);
		Item1 item1 = new Item1(10);
		Item2 item2 = new Item2(40);
		
		//å�� ��ü�� �����Ŵ
		item1.nextItemChain(item2);
		//��� ��ü(attack)�� å�� ��ü�� ���� �����Ŵ
		item1.amonutdamage(attack);
		
		System.out.println(attack.getDamage());

	}

}
