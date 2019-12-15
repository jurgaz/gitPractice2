import java.util.ArrayList;

public class Java_Basics_StringManipulation {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();

		names.add("mike");
		names.add("david");
		names.add("jack");
		names.add("juli");
		names.add("anzargul");

		for (String namei : names) {
			System.out.println(namei.toUpperCase().charAt(0) + namei.substring(1, namei.length()));
			// name to upper case
			// concatination (method substring is used to pull up part of the string
			// (substring(1,2,3) pulls up indexes 1,2,3
			// the s
			// cut it off to first letter
			// from second index to 3 (ike)
		}
		// System.out.println(name.toUpperCase().charAt(0));

		String testData = "This is the string I'm trying to test     ";
		String testData2 = "This is the string I'm trying to test ";
		// length - gives you how many characters you have in the string
		int l = testData.length();
		System.out.println(l);

		// charAT - gives you a letter in the string, the one you put the index #
		// (returns a character at the index)
		testData.charAt(8);
		System.out.println(testData.charAt(8));

		// substring - gives a part of the string(text)
		System.out.println(testData.substring(10)); //gives start to end
		System.out.println(testData.substring(12, 18)); //gives start and end
		
		//indexOf - gives index number, where the value is stored the first time
		System.out.println(testData.indexOf("string"));
		
		//equals - one string equals to another (can't use == with strings). Outcome - boolean true or false
		System.out.println(testData.contentEquals(testData2));
		
		// trim removes spaces before and at the end of the string
		System.out.println(testData.trim().equals(testData2.trim()));
		
		String x = "this i i";
		String y = "THIS";
		
		//equalsIgnoreCase - compares strings, ignores capital letters
		System.out.println(x.toUpperCase().equals(y));
		System.out.println(x.equalsIgnoreCase(y));
		
		//compareTo - similar to equal, gives a number , gives a 0 if it's true, instead of boolean (false; true)
		System.out.println(x.compareTo(y));
					
		//compareToIgnoreCase - same as compare to, gives a number 0 equal, not 0, not equal. Ignoring the upper case
		System.out.println(x.compareToIgnoreCase(y));
		
		//contains - looking for a value in the string, true or false
		System.out.println(testData.contains("is"));
		
		//ends with - last letter of the string
		System.out.println(testData.trim().endsWith("n"));
		
        // startWith - a string starts with this letter
		System.out.println(testData.startsWith("This"));
		
		//replaceAll - give to values, which value you want to which value
		System.out.println(x.replaceAll("i","a"));
		
		//replaceFirst - replaces the value only in the first instance
		System.out.println(x.replaceFirst("i", "a"));
		
		//toUpperCase
		System.out.println(x.toUpperCase());
		
		//toLowerCase
		System.out.println(x.toLowerCase());
		
		//toCharArray - converts the string to char Array (Array of characters; 1 letter in 1 index number)
		char name [] = x.toCharArray();
		for (char c: name) {
			System.out.println(c);
		}
		
		//how can you reverse a String?
		System.out.println("***************");
		
		
		String value = "this String"; // gnirtS siht
		
		char name1 [] = value.toCharArray();
		
		for (int i = name1.length - 1; i >= 0; i--) {
			System.out.print(name1[i]);
			
		}
		
		System.out.println("\n*************");
	// regular expressions - gives all lower case values, upper case values, numbers
	//	"[a-zA-Z0-9]"
		String regularExpressions = "this is a te$t of r?!093 this is";
		String regularExpressions1 = "can you solve this 2+2 = ";
		
		System.out.println(regularExpressions.replaceAll("[a-zA-Z0-9 ]", "")); //gives you only symbols
		
		System.out.println(regularExpressions1.replaceAll("^[0-9+-/*= ]", ""));
		
		
		}
	}


