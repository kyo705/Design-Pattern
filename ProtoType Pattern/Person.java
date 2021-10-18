package ProtoType;

public class Person implements Cloneable{

	private	String name;
	private Age age;
	
	public Person() {
		
	}
	
	public Person(String name, Age age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Age getAge() {
		return age;
	}
	public void setAge(Age age) {
		this.age = age;
	}
	
	//프로토타입 설계 메소드
	public Person copy() throws CloneNotSupportedException {
		Person person = (Person) this.clone();
		//person객체의 필드값 중 age가 reference type이기 때문에 깊은 복사가 안. 따라서 직접 깊은 복사가 되게 만들어줌
		person.setAge(new Age(this.getAge().getBirthday(),this.getAge().getAgenum()));
		return person;
	}
}
