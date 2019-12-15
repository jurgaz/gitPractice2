package OOP_DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OOP_Map {

	public static void main(String[] args) {
		
		Map<String, String> testMap = new HashMap<String, String>(); //no method add in hashMap, use put
		
		testMap.put("City1", "Alexandria");  //if you use the same key it changes the value to the last one
		testMap.put("City2", "USA");
		testMap.put("City3", "Richmond");
		
		System.out.println(testMap);
		
		System.out.println(testMap.get("City2"));
		
		//to print all values in the map, prints random order
		
		System.out.println("--------");
		
		for (Entry i : testMap.entrySet()) {
			System.out.println(i.getKey() +" " + i.getValue());
			
		}
		System.out.println("-------");
		
		ArrayList <String> firstNames = new ArrayList<String>();
		
		Map<String, ArrayList<String>> studentInfo = new HashMap<String, ArrayList<String>>();
		studentInfo.put("firstNames", new ArrayList<String>());
		studentInfo.put("lastNames", new ArrayList<String>());
		studentInfo.put("studentID", new ArrayList<String>());
		
		studentInfo.get("firstNames").add("John");
		studentInfo.get("firstNames").add("John1");
		studentInfo.get("firstNames").add("John3");
		
		System.out.println(studentInfo);
		
		

	}

}
