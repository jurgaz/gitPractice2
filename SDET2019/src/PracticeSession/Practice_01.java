package PracticeSession;





import java.util.ArrayList;



public class Practice_01 {



	public static void main(String[] args) {

		ArrayList<String> x = xyz("test ", 569852);  //adding multiple subjects to the array:initilize the array, then have a method to add it
		x = xyz("test ", 12);
		x = xyz("test ", 575);

		System.out.println(x);

		// test 10

	}

	static ArrayList<String> testData = new ArrayList<String>();
	public static ArrayList<String> xyz(String t, int x) {
		testData.add(t + x);
		return testData;

	}


}







