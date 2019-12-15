package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class JavaQuestionn_DuplicateValues {

	public static void main(String[] args) {

		String data[] = { "Test", "Data", "IS", "Only", "Test", "DATA", "Data" };

		// using method equals - you take "test" and compare to the rest of the values,
		// then data to the rest of the values etc.

		int duplicateCount = 0;
		for (int i = 0; i < data.length; i++) { // outer loop - going to the next element for comparison with other
												// objects
			for (int j = i + 1; j < data.length; j++) { // inner loop comparing "test" to all other values
				if (data[i].equalsIgnoreCase(data[j])) {
					System.out.println("there is a duplicate value: " + data[i] + " indexes are " + i + " " + j);
					duplicateCount++;
				}
				if (duplicateCount > 0) { // if you want to exit after the first duplicated value is found
					break;
				}

			}

		}
		
		// using HashSet

		System.out.println("\n using HashSet");
		
		Set<String> checkingForDup = new HashSet<String>();
		
		for (String s : data) {
			if (!checkingForDup.add(s.toLowerCase())) {
				System.out.println(s + " is duplicate");

			}
		}

	}

}
