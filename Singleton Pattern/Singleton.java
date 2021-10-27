package Singleton;

public class Singleton {

	static private Singleton singleton;
	private String characName;
	
	private Singleton() {
		characName = "�ʱ� �г���";
	}
	
	public static Singleton getInstance() {
		if(singleton==null)
			singleton = new Singleton();
		else
			System.out.println("���� ���̵� �����մϴ�.");
		
		return singleton;
	}
	
	public void setCharacName(String characName) {
		this.characName = characName;
	}
	
	public String getCharacName() {
		return characName;
	}
}
