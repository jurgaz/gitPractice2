package OOP;

import java.util.ArrayList;

public class Teacher {

	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private ArrayList<String> subjects;

	public Teacher(String firstName, String lastName, String gender, int age, ArrayList<String> subjects) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		subjects = new ArrayList<String>();
		this.subjects = subjects;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<String> getSubjects() {
		return subjects;
	}

	public void addSubjects(String subjectName) {
		subjects.add(subjectName);
	}

	// the method should not return anything.
	// it should take and add the string to the list of subjects
	// and it should print to console a confirmation message "Subject added!"

	// return teacher info

	public String getTeacherInfo() {
		return "First Name: " + firstName + " Last Name: " + lastName + " Gender: " + gender + " Age: " + age
				+ " Subjects  " + subjects;
	}

	public static void main(String[] args) {

		ArrayList<String> subjects = new ArrayList<String>();
		Teacher t1 = new Teacher("Jackie", "Chan", "Male", 67, subjects);
		t1.addSubjects("Dancing");
		
		ArrayList<String> sub = new ArrayList<String>();
		sub.add("Stealing things");
		sub.add("Spying on people");
		sub.add("Poker");
		Teacher t2 = new Teacher ("James", "Bond", "Male", 32, sub);
	

		System.out.println(t1.getTeacherInfo());
		System.out.println(t2.getTeacherInfo());
	}

}
