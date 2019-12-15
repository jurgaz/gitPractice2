import java.util.ArrayList;

public class Java_Basics_Array_list {

	public static void main(String[] args) {
		
		ArrayList<String> firstList = new ArrayList<String>();
		
		firstList.add("First item added to the list");
		firstList.add("second item added");
		System.out.println(firstList.get(1));
		
		System.out.println(firstList.size());
		
		for (int i = 0; i< firstList.size(); i++) {
			System.out.println(firstList.get(i));
			
		}
		
		boolean test = firstList.isEmpty();
System.out.println(test);
		
firstList.remove(0)	;
System.out.println("size of the list: " + firstList.size());

//Methods:
//Add – adds a value (open ended list)
//Get – access data
//Size – size of the array
//Remove – removes data
//Clear – clears all data in the array



	}
	
	

}
