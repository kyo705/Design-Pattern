package Singleton;

public class Singleton {

	static private Singleton singleton;
	private String characName;
	
	private Singleton() {
		characName = "초기 닉네임";
	}
	
	public static Singleton getInstance() {
		if(singleton==null)
			singleton = new Singleton();
		else
			System.out.println("기존 아이디가 존재합니다.");
		
		return singleton;
	}
	
	public void setCharacName(String characName) {
		this.characName = characName;
	}
	
	public String getCharacName() {
		return characName;
	}
}
