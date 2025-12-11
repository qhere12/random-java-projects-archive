package helloapagain31;

public class Student extends Person{

	private double gpa;
	
	public Student(String name, String lastName, int age, double gpa) {
		super(name, lastName, age);
		this.gpa = gpa;
		
		
	}
	
	@Override
	public String toString() {
		return super.toString() + "and a student";
	}
	
	
}
