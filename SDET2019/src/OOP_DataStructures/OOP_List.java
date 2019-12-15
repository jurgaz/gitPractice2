package OOP_DataStructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class OOP_List {
	
	//how to copy an array
	
	public static void main(String[] args) {
	
	String [] data = {"1","2","3","4"};
	String [] newData = new String[data.length];
		
		for (int i = 0; i < data.length; i++) {
				newData[i] = data [i];
		
		}
		
		//creating a linkedList
		
		LinkedList<String> firstLinkedListCreated = new LinkedList<String>();
		firstLinkedListCreated.add("First Element");
		firstLinkedListCreated.add("Second Element");
		
		firstLinkedListCreated.get(0);    //get first, get last, gets first and last indexes
		
		
		
		for (String s : firstLinkedListCreated) {
			System.out.println(s);
			
		}
		
		ArrayList<String> secondList = new ArrayList<String>();
		secondList.addAll(firstLinkedListCreated);
		for (String s : secondList) {
			System.out.println(s);
		}
			
		}
			
		
		
		
	}


