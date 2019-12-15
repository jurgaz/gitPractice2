
public class Excersize_5 {

	public static void main(String[] args) {

		// Task 01. Create a Two Dimension Array of Students Information
		// Steps:
		// Add 5 students to the array
		// Create a loop to go through the Students infor and store the grades in form
		// of letters
		// Create a loop that will go throgh the array and print students DATA in a
		// reasonable format
		// Add a condition to your print using "Switch to add "Good job" if the student
		// grade is B
		// "excellent" if the Grade is A, "Keep up the hard work" if the Grade is C or D
		// and if the Grade is F print "Try Harder"

//		String studentInformationArray[][] = new String[5][4];
//
//		studentInformationArray[0][0] = "David";
//		studentInformationArray[0][1] = "Miller";
//		studentInformationArray[0][2] = "73";
//
//		studentInformationArray[1][0] = "John";
//		studentInformationArray[1][1] = "Smith";
//		studentInformationArray[1][2] = "84";
//
//		studentInformationArray[2][0] = "Marcia";
//		studentInformationArray[2][1] = "Occomy";
//		studentInformationArray[2][2] = "91";
//
//		studentInformationArray[3][0] = "Tracy";
//		studentInformationArray[3][1] = "Lane";
//		studentInformationArray[3][2] = "68";
//
//		studentInformationArray[4][0] = "Jema";
//		studentInformationArray[4][1] = "Cabrias";
//		studentInformationArray[4][2] = "56";

		// Create a loop to go through the Students information and store the grades in
		// form of letters

		// convert the score to int

//		int grade = Integer.valueOf(studentInformationArray[0][2] = "73");
//		System.out.println(studentInformationArray[0][2] = "73");
//
//		// this loop runs 5 times
//
//		for (int i = 0; i < studentInformationArray.length; i++) {
//
//			if (grade >= 90) {
//				System.out.println("A");
//
//				if (grade >= 90 && grade <= 100) {
//					studentInformationArray[i][3] = "A";
//
//				} else if (grade >= 80 && grade <= 89) {
//					studentInformationArray[i][3] = "B";
//				} else if (grade >= 70 && grade <= 79) {
//					studentInformationArray[i][3] = "C";
//				} else if (grade >= 60 && grade <= 69) {
//					studentInformationArray[i][3] = "D";
//				} else if (grade < 60) {
//					studentInformationArray[i][3] = "F";
//
//				}
//
//			}
//			
//			
//			System.out.println(studentInformationArray[i][0] + " " + studentInformationArray[i][1] + " " + studentInformationArray[i][2]);
//
//			
//		}
//		
		// this loop runs 5 times

		// for (int i = 0; i < studentInformationArray.length; i++) {

		// if (grade >=90 && grade <= 100) {
		// studentInformationArray[i][3] = "A";
		
		// Task 01. Create a Two Dimension Array of Students Information
				// Steps:
				// Add 5 students to the array
				// Create a loop to go through the Students infor and store the grades in form
				// of letters
				// Create a loop that will go throgh the array and print students DATA in a
				// reasonable format
				// Add a condition to your print using "Switch to add "Good job" if the student
				// grade is B
				// "excellent" if the Grade is A, "Keep up the hard work" if the Grade is C or D
				// and if the Grade is F print "Try Harder"
//				    		  }}
		String studentInformationArray[][] = new String[5][4];

		studentInformationArray[0][0] = "David";
		studentInformationArray[0][1] = "Miller";
		studentInformationArray[0][2] = "73";

		studentInformationArray[1][0] = "John";
		studentInformationArray[1][1] = "Smith";
		studentInformationArray[1][2] = "84";

		studentInformationArray[2][0] = "Marcia";
		studentInformationArray[2][1] = "Occomy";
		studentInformationArray[2][2] = "91";

		studentInformationArray[3][0] = "Tracy";
		studentInformationArray[3][1] = "Lane";
		studentInformationArray[3][2] = "68";

		studentInformationArray[4][0] = "Jema";
		studentInformationArray[4][1] = "Cabrias";
		studentInformationArray[4][2] = "56";
	
		// Create a loop to go through the Students information and store the grades in form
		// of letters
	
		for (int i=0; i < studentInformationArray.length; i++) {
			// get the score
			String score = studentInformationArray[i][2];
			// convert the String to int
			int scoreInt = Integer.valueOf(score);
			
			//decide what is letter score
			String grade = "";
			String message = " ";
			if ( scoreInt >= 90 && scoreInt <= 100) {
				grade = "A"; 
				message = "Excelent";
			} else if (scoreInt >= 80 && scoreInt <= 89) {
				grade = "B";
			} else if (scoreInt >= 70 && scoreInt <= 79) {
				grade = "C";
			}else if (scoreInt >= 60 && scoreInt <= 69) {
				grade = "D";
			}else if (scoreInt >0 && scoreInt <= 59) {
				grade = "F";
			}
			
			// store that in column 3
			studentInformationArray[i][3] = grade;
			
			System.out.println(studentInformationArray[i][0] +" " + studentInformationArray[i][1]+ " " + studentInformationArray[i][3] + " " + message);
		
	}

}
}