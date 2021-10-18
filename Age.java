package ProtoType;

public class Age {
	
	private int birthday;
	private int agenum;
	
	public Age() {
		
	}
	
	public Age(int birthday, int agenum) {
		super();
		this.birthday = birthday;
		this.agenum = agenum;
	}
	
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	public int getAgenum() {
		return agenum;
	}
	public void setAgenum(int agenum) {
		this.agenum = agenum;
	}
	
}
