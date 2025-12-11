public class Sureyya {
	int age;
	String surname;
	String occupation;

	public Sureyya(String surname, String occupation, int age) {
		System.out.println("A new Süreyya has been created!");
		this.surname = surname;
		this.occupation = occupation;
		this.age = age;
	}

	public String toString () {
		return "Süreyya " + surname + " | Occupation: " + occupation + " | Age: " + age;
		
	}

	public void clean () {
		System.out.println("Süreyya " + surname + ", the " + occupation + " has started cleaning the house!");
	}

}


