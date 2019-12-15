package OOP;

import java.util.ArrayList;

public class Class {
	
	
	ArrayList<Student> listOfStudent;
	
	//constructor method - needs Access-modifier, Class-Name (Argument) {Code block}
	
	public Class() {
		listOfStudent = new ArrayList<Student>();
	}
	
	//setter method
 public ArrayList<Student>getListOfStudent(){
	 return listOfStudent; //what's the data type you want to return
	  }
 //custom method, setter method would replace all students
 public void addStudent(Student newStudent) {
	 listOfStudent.add(newStudent);
	 
	 
 }
 
 
}
