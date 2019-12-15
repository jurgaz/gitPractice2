package OOP_DataStructures;

import java.util.HashSet;
import java.util.Set;

public class OOP_Set {

	public static void main(String[] args) {
		
		Set<String> testHashSet = new HashSet <String>();
		
		testHashSet.add("Test");
		testHashSet.add("Is");
		testHashSet.add("What");
		testHashSet.add("I do!");
		testHashSet.add("Test");
		
		//no get method. Can iterate through it. Use this to see if there's duplicate value
		
		System.out.println(testHashSet);
		
		for (String string : testHashSet) {
			System.out.println(string);
			
		}
		
		
		
		
		
		

	}

}
