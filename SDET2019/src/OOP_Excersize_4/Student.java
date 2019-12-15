package OOP_Excersize_4;

public class Student {
	
	//create the variables, firstName, lastName, static numberOfStudent
	// create one overloaded constructor to initialize the variables and increase the count by 1
	// override method to a string to print student data
	
	private String firstName;
	private String lastName;
	private static int numberOfStudent = 0;
	
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
		numberOfStudent++;
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
	public static int getNumberOfStudent() {
		return numberOfStudent;
	}
	public static void setNumberOfStudent(int numberOfStudent) {
		Student.numberOfStudent = numberOfStudent;
	}
	
	@Override
	
public String toString() {
		return this.firstName + this.lastName + Student.numberOfStudent;
	}
}
