package assignments;

public class Homework_W_Q2 {

	public static void main(String[] args) {
		/*
		 * 1. Create a class inside your assignment package. Class name should be
		 * ‘Homework_W2_Q1’ and you need the main method. 2. Declare an array of type
		 * String and store the 10 fictional student full names in it. Name of array:
		 * studentNames. You should first declare the array in one statement and then
		 * assign names/values to each index of the array in separate statements. 3.
		 * Declare an array of type double that stores the GPA for the 10 students. Name
		 * of array: studentGPA. You should first declare the array in one statement
		 * andthen assign GPA/values to each index of the array in separate statements.
		 * Please assign the following data to your array. a. 2.1, 3.4, 4.0, 3.5, 3.8,
		 * 2.7, 2.9, 3.0, 1.9, 2.2 4. Print a line to console that says “*** List of
		 * Students ***” 5. Create a for loop that runs through the arrays and print
		 * student information as following a. $lineNumber “. ” $studentName “ --- GPA:”
		 * $gpa_value (e.g. “1. Jack Ma --- GPA: 3.4”) b. Realize that $value is
		 * signaling that it’s a variable and “” means its literal. You should format
		 * the output as the example given. Also make sure that the line number is
		 * starting from 1 and ends to 10 in the printed output. 6. Print a line to
		 * console that says “*** List of Students – Not using loops ***” 7. Print
		 * student information in the same format you printed using loop but this time
		 * you should write a statement for each line you print. It should be 10
		 * statements/lines of code. 8. Print a line to console that says “*** OK! I
		 * think I know how helpful loops are ***” 9. Print a line to console that says
		 * “*** Please do not ask me to print 100 lines without loops! ***”
		 */

		String studentNames[][] = new String[10][2];

		studentNames[0][0] = "Mike";
		studentNames[1][0] = "Jack";
		studentNames[2][0] = "George";
		studentNames[3][0] = "Sidney";
		studentNames[4][0] = "Paul";
		studentNames[5][0] = "Julia";
		studentNames[6][0] = "Emma";
		studentNames[7][0] = "Nick";
		studentNames[8][0] = "Marilyn";
		studentNames[9][0] = "Bob";

		studentNames[0][1] = "Smith";
		studentNames[1][1] = "Hog";
		studentNames[2][1] = "Stern";
		studentNames[3][1] = "Green";
		studentNames[4][1] = "Black";
		studentNames[5][1] = "Peabody";
		studentNames[6][1] = "Alto";
		studentNames[7][1] = "Mack";
		studentNames[8][1] = "Lawrence";
		studentNames[9][1] = "McNulty";

// Declare an array of type double that stores the GPA for the 10 students. Name of array: studentGPA. You should first declare the array
// in one statement and then assign GPA/values to each index of the array in separate statements.

		double studentGPA[] = new double[10];

//a. 2.1, 3.4, 4.0, 3.5, 3.8, 2.7, 2.9, 3.0, 1.9, 2.2 4. 

		studentGPA[0] = 2.1;
		studentGPA[1] = 3.4;
		studentGPA[2] = 4.0;
		studentGPA[3] = 3.5;
		studentGPA[4] = 3.8;
		studentGPA[5] = 2.7;
		studentGPA[6] = 2.9;
		studentGPA[7] = 3.0;
		studentGPA[8] = 1.9;
		studentGPA[9] = 2.2;

//Print a line to console that says “*** List of Students ***” 

		{
			System.out.println("*** List of Students *** \n");

			for (int i = 0; i < 10; i++) {
				System.out.println(studentNames[i][0] + " " + studentNames[i][1]);

			}
		}
		System.out.println();

		/*
		 * 5. Create a for loop that runs through the arrays and print student
		 * information as following a. $lineNumber “. ” $studentName “ --- GPA:”
		 * $gpa_value (e.g. “1. Jack Ma --- GPA: 3.4”) b. Realize that $value is
		 * signaling that it’s a variable and “” means its literal. You should format
		 * the output as the example given. Also make sure that the line number is
		 * starting from 1 and ends to 10 in the printed output.
		 */

		{
			int lineNumber = 1;

			for (int i = 0; i < 10; i++) {

				{
					System.out.println(lineNumber++ + "." + " " + studentNames[i][0] + " " + studentNames[i][1] + " "
							+ "---" + " " + "GPA:" + " " + studentGPA[i]);

				}
			}
			System.out.println();

			// 6. Print a line to console that says “*** List of Students – Not using loops
			// ***”

			{ // System.out.println("*** List of Students - Not using loops ***");

			}

			// 7. Print student information in the same format you printed using loop but
			// this time you should write a statement for each line you print.
			// It should be 10 statements/lines of code.

			{
				System.out.print(studentNames[0][0] + " " + studentNames[0][1] + "\n" + studentNames[1][0] + " "
						+ studentNames[1][1] + "\n" + studentNames[2][0] + " " + studentNames[2][1] + "\n"
						+ studentNames[3][0] + " " + studentNames[3][1] + "\n" + studentNames[4][0] + " "
						+ studentNames[4][1] + "\n" + studentNames[5][0] + " " + studentNames[5][1] + "\n"
						+ studentNames[6][0] + " " + studentNames[6][1] + "\n" + studentNames[7][0] + " "
						+ studentNames[7][1] + "\n" + studentNames[8][0] + " " + studentNames[8][1] + "\n"
						+ studentNames[9][0] + " " + studentNames[9][1]);

				System.out.println();
			}
			System.out.println();

			// * 8. Print a line to console that says “*** OK! I think I know how helpful
			// loops are ***”

			System.out.println("*** OK! I think I know how helpful loops are ***");
			System.out.println();

			// * 9. Print a line to console that says
			// * “*** Please do not ask me to print 100 lines without loops! ***”

			System.out.println("*** Please do not ask me to print 100 lines without loops! ***");

		}
		System.out.println();
		/*
		 * Challenge Section: 1. Print a line to console that says “” 2. Print a line to
		 * console that says “*** Challenge accepted! ***” 3. Create a double variable
		 * and assign 3.5 to it. Name of variable: searchGPA. 4. Loop through the array
		 * again and print the name of student in the format provided above only if the
		 * GPA is more than or equal to searchGPA. 5. Print another line to console that
		 * says “*** Challenge accepted AGAIN! ***” 6. Loop through the arrays again and
		 * print a list of all students as you did in the actual question. But if the
		 * student GPA is less than 2.0, you should add “ -- FAILED” to the end of the
		 * line, and if the student is between 2.0 and 3.0, add “ -- Passed” to the end
		 * of the line, and if above 3.5, add “ -- Passed with honor!”. If its 4.0, add
		 * “ -*-*- Alert! Geek found! Alert!”.
		 */
		{
//1.	Print a line to console that says “”
			System.out.print("\"\"");
			System.out.println();

//2.	Print a line to console that says “*** Challenge accepted! ***”
			System.out.println("*** Challenge accepted! ***");
		}

		{
//3. Create a double variable and assign 3.5 to it. Name of variable: searchGPA.
			double searchGPA = 3.5;

//4. Loop through the array again and print the name of student in the format provided above only if the GPA is more than or equal to searchGPA.

			int lineNumber = 1;

			for (int rownum = 0; rownum < 10; rownum++) {

				if (studentGPA[rownum] >= searchGPA) {
					System.out.println(lineNumber++ + "." + " " + studentNames[rownum][0] + " "
							+ studentNames[rownum][1] + " " + "---" + " " + "GPA:" + " " + studentGPA[rownum]);

				}
			}
			System.out.println();

//		5.	Print another line to console that says “*** Challenge accepted AGAIN! ***”			
			{
				System.out.println("*** Challenge accepted AGAIN! ***");
			}
			System.out.println();
//6.	Loop through the arrays again and print a list of all students as you did in the actual question. But if the student GPA is less than 2.0,
// you should add “  -- FAILED” to the end of the line, and if the student is between 2.0 and 3.0, add “  -- Passed” to the end of the line, 
// and if above 3.5, add “  -- Passed with honor!”. If its 4.0, add “ -*-*- Alert! Geek found! Alert!”.	

			{
				int lineNumber1 = 1;
				String message = "";

				for (int rowNum1 = 0; rowNum1 < 10; rowNum1++) {

					if (studentGPA[rowNum1] < 2.0) {
						message = "  -- FAILED";

					} else if (studentGPA[rowNum1] >= 2.0 && studentGPA[rowNum1] <= 3.5) {
						message = "  --- Passed";

					} else if (studentGPA[rowNum1] >= 3.6 && studentGPA[rowNum1] <= 3.9) {
						message = "  -- Passed with honor!";
					} else if (studentGPA[rowNum1] == 4.0) {
						message = " -*-*- Alert! Geek found! Alert!";
					}

					System.out.println(
							lineNumber1++ + "." + " " + studentNames[rowNum1][0] + " " + studentNames[rowNum1][1] + " "
									+ "---" + " " + "GPA:" + " " + studentGPA[rowNum1] + message);
				}
			}
		}

	}

}
