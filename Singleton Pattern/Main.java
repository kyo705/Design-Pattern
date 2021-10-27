package Singleton;

public class Main {
	public static void main(String[] args) {
		
		Singleton sin1 = Singleton.getInstance();
		
		sin1.setCharacName("롤 잘하는 사람");
		System.out.println(sin1.getCharacName());
		
		Singleton sin2 = Singleton.getInstance();
		
		sin2.setCharacName("플레티넘 수문장");
		System.out.println(sin1.getCharacName());
		System.out.println(sin2.getCharacName());
	}
}
