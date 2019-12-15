package OOP;

import java.util.ArrayList;

public class School_Runner {

	public static void main(String[] args) {
		
		Class softwareTestingAutomation = new Class();
		Class manualTesting = new Class();
		
		Student st1 = new Student ("Ahmad", "Jan","Male", true, 27);
		softwareTestingAutomation.addStudent(st1);
		
		Student st2 = new Student ("John", "Man","Male", true, 28);
		softwareTestingAutomation.addStudent(st2);
		
		Student st3 = new Student ("Mike", "San","Male", false, 23);
		softwareTestingAutomation.addStudent(st3);
		
		Student st4 = new Student ("Jake", "Tan","Male", true, 26);
		softwareTestingAutomation.addStudent(st4);
		
		Student st5 = new Student ("Sean", "Can","Male", false, 25);
		softwareTestingAutomation.addStudent(st5);
		
					
		System.out.print(softwareTestingAutomation.getListOfStudent().get(0).getfirstName() + " ");
		System.out.println(softwareTestingAutomation.getListOfStudent().get(0).getLastName());
		
		System.out.print(softwareTestingAutomation.getListOfStudent().get(1).getfirstName() + " ");
		System.out.println(softwareTestingAutomation.getListOfStudent().get(1).getLastName());
		
		System.out.print(softwareTestingAutomation.getListOfStudent().get(2).getfirstName() + " ");
		System.out.println(softwareTestingAutomation.getListOfStudent().get(2).getLastName());
		
		System.out.print(softwareTestingAutomation.getListOfStudent().get(3).getfirstName() + " ");
		System.out.println(softwareTestingAutomation.getListOfStudent().get(3).getLastName());
		
		System.out.print(softwareTestingAutomation.getListOfStudent().get(4).getfirstName() + " ");
		System.out.println(softwareTestingAutomation.getListOfStudent().get(4).getLastName());
		
		System.out.println(st1.getStudentInfo());
		System.out.println(st2.getStudentInfo());
		System.out.println(st3.getStudentInfo());
		System.out.println(st4.getStudentInfo());
		System.out.println(st5.getStudentInfo());
		
		ArrayList<Student> stList = softwareTestingAutomation.getListOfStudent();
		for (Student st: stList) {
			System.out.println(st.getStudentInfo());
			
			
			
			
		}
		
	}

}
