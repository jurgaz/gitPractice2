package Java_Project1;

public class Person {
	
	String firstName;
	String lastName;
	String address;
	String phoneNumber;
	int age;
	
	public Person() {
		this.firstName = " ";
		this.lastName = " ";
		this.address = " ";
		this.phoneNumber = " ";
		this.age = 0;
	}
	
	
	public Person(String firstName, String lastName, String address, String phoneNumber, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}
	
	public Person(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", phoneNumber="
				+ phoneNumber + ", age=" + age + "]";
	}
	
	

}
