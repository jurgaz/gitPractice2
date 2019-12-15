package PracticeSession;

import java.util.ArrayList;

public class Practics01 {

	public static void main(String[] args) {
		
//		ArrayList<String> arr = new ArrayList<String>();
//		arr.add("1 item1");
//		arr.add("1 item2");
//		arr.add("1 item3");
//		
//		ArrayList<String> arr2 = new ArrayList<String>();
//		arr.add("2 item1");
//		arr.add("2 item2");
//		arr.add("2 item3");
//		
//		arr.addAll(arr2); // combines 2 arrays with the same data
//		
//		System.out.println((" after "));
//		
//		for (String s: arr) {
//			System.out.println(s);
//		}
		System.out.println(getText("test ", 5+1));
	}
public static ArrayList <String> getText(String t, int x) {
	ArrayList<String> testData = new ArrayList<String>();
	testData.add(t + x);
	
	return testData;
}
	
	
}
