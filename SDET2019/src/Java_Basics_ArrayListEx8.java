import java.util.ArrayList;

public class Java_Basics_ArrayListEx8 {

	public static void main(String[] args) {
		// create and arraylist of datatype string with the name, firstnames
		//and add ,5 names to the list
		
		//print all 5 using foreach loop
		
		//then remove 2 of the elemets and print the list again
		
//ArrayList<String> firstList = new ArrayList<String>();
//		
//		firstList.add("First item added to the list");
//		firstList.add("second item added");
//		System.out.println(firstList.get(1));
//		
//		System.out.println(firstList.size());
//		
//		for (int i = 0; i< firstList.size(); i++) {
//			System.out.println(firstList.get(i));
		
//		firstList.remove(0)	;
//		System.out.println("size of the list: " + firstList.size());
		
//		System.out.println("***** For Each Loop ******");
//		for (int index : array) {
//			System.out.println(index);

			
		ArrayList<String> firstNames = new ArrayList<String>();
		
		firstNames.add("John");
		firstNames.add("Kate");
		firstNames.add("Mike");
		firstNames.add("George");
		firstNames.add("Charles");
		System.out.println(firstNames.size());
		
		for (String i: firstNames) {
			System.out.println(i);
			
		}
			
			firstNames.remove(0);
			firstNames.remove(0);
			System.out.println(firstNames);
			
		
		

	}

}
