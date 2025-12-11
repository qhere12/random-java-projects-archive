package helloapagain31;

public class Person {

	protected String name;
	protected String lastName;
	protected int age;
	
	public Person (String name, String lastName, int age) {
		this.name = name;
		this.lastName = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "this is a person ";
	}
}
