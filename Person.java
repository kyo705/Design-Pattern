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
	
	public Person copy() throws CloneNotSupportedException {
		Person person = (Person) this.clone();
		person.setAge(new Age(this.getAge().getBirthday(),this.getAge().getAgenum()));
		return person;
	}
}
