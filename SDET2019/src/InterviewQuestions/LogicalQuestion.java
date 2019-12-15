package InterviewQuestions;

public class LogicalQuestion {

	/*
	 * Write a method which prints out the numbers from start to end, BUT for
	 * numbers which are a multiple of 3, print FIN instead of the number, AND for
	 * numbers which are a multiple of 5, print RA instead of the number. FINALLY,
	 * for numbers which are a multiple of both 3 AND 5, print FINRA instead of the
	 * number
	 * 
	 * Example Output: 1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 …
	 */

	// method definition
	// method inputs must be start and end of the rang of the numbers
	// the method does not have a return, its just printing
	// i know that I have to loop through the start to end

	// conditions inside my loop
	// if the number is multiple of 3
	// if the number is multiple of 5

	public void testMethod(int start, int end) {
		if (start >= 0) {
			for (int i = start; i <= end; i++) {
				if (i == 0) {
					System.out.println(i);
				}
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println("FINRA");
				} else if (i % 3 == 0) {
					System.out.println("FIN");
				} else if (i % 5 == 0) {
					System.out.println("RA");
				} else {
					System.out.println(i);
				}
			}
		}
	}

	public static void main(String[] args) {
		LogicalQuestion obj = new LogicalQuestion();

		System.out.println("Happy Path");
		obj.testMethod(1, 20);

		System.out.println("TC1");
		obj.testMethod(20, 1);

		System.out.println("TC2");
		obj.testMethod(0, 20);

		System.out.println("TC3"); // testing "wrong" scenarios
		obj.testMethod(-20, 0);

	}

}
