package ProtoType;

public class ProtoTypeMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		//person 객체 생성
		Person person1 = new Person("Lee", new Age(940705,28));
		//person 객체의 copy 메소드를 통한 프로토타입 설계
		Person person2 = person1.copy();
		person2.setName("Kim");
		person2.getAge().setBirthday(970325);
		person2.getAge().setAgenum(25);
		
		System.out.println(person1.getName()+','+person1.getAge().getBirthday()+','+person1.getAge().getAgenum());
		System.out.println(person2.getName()+','+person2.getAge().getBirthday()+','+person2.getAge().getAgenum());
	}

}
