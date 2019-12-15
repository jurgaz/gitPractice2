package InterviewQuestions;

import java.util.Arrays;

public class JavaQuestions_SortingList {

	public static void main(String[] args) {

		String data[] = { "Test", "Data", "IS", "Only", "Test", "DATA", "Data" };

		System.out.println("Before sorting: ");
		for (String s : data) {
			System.out.print(s + " ");

		}

		System.out.println("\nAfter sorting: ");
		Arrays.sort(data);
		for (String s : data) {
			System.out.print(s + " ");

		}

	}
}