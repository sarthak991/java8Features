package java8;

public class Person {
	
	String firstName;
	String LastName;
	Integer age;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public Person(String firstName, String lastName, Integer age) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.age = age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", LastName=" + LastName + ", age=" + age + "]";
	}
    
	
}
