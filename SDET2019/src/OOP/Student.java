package OOP;

public class Student {
	
	//variables (declaring identifier)
	String firstName;
	String lastName;
	String gender;
	boolean enrolled;
	int age;
	
	// constructor method - needs Access-modifier, Class-Name (Argument) {Code block} - assigning values; calling a constructor - 
	// initializing the object, by doing so it initializes the values
	public Student(String f_name, String l_name, String g, boolean e, int a) {
	
		firstName = f_name;
		lastName = l_name;
		gender = g;
		enrolled = e;
		age = a;
	}
	
	public Student(String f_name, String l_name) {
		firstName = f_name;
		lastName = l_name;
		gender = "";
		enrolled = false;
		age = 0;
		
	}
	
// getter method - Access-Modifier Return_DataTYpe Method-Name(Arguments) {Code block}
		public String getfirstName() {
		return firstName;
	}
	//setters method - change a value - Access-modifier, Return Datatype, the method name, argument
		public void setFirstName(String newName) {
			firstName = newName;
			}
		
		public String getLastName() {
			return lastName;
		}
	public void setLastName (String lastName) {
		this.lastName = lastName;                 //this. references lastName in the class, not in argument
	}
		
		public String getgender() {
			return gender;
		}
		
		public void setgender (String Gender) {
			this.gender = Gender;
	
}
        public boolean isenrolled() {
        	return enrolled;
        }
		
        public void setennrolled (boolean Enrolled) {
        	this.enrolled = Enrolled;
        }
        
        public int getAge() {
        	return age;
        }
        
        public void setAge(int age) {
        	this.age = age;
        }
        
               
        
		public String getStudentInfo() {
			String status = "";
			if(enrolled) {
				status = "Student Enrolled";
			}else {
				status = "Student not Enrolled";
			}
			return "First Name: " + firstName + " Last Name: " + lastName + " Gender: " + gender + " Enrolment Status: " + status + " Age: " + age;
		}
		
}