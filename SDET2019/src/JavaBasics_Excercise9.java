
public class JavaBasics_Excercise9 {

	public static void main(String[] args) {
		//create a String "This is when i test these methods! lets go 123!!!"
		//print the string but converts everything to upper case
		//print a portion of the string index 10 to 15
		//print the index number of the first occurence of "lets"
		
		//Challenge:
		//check to see if there is any special sighns/symbol used in the string
		//if so, then print this message "there are symbols in the text" if not
		//then print "no sign is used"
		//if you are up for it, print the signs if there are any signs in the text as well
		
		
		//create a String "This is when i test these methods! lets go 123!!!"
		String x = "This is when i test these methods lets go 123!!!";
		
		//print the string but converts everything to upper case
		System.out.println(x.toUpperCase());
		
		//print a portion of the string index 10 to 15
		System.out.println(x.substring(10, 15));
		
		//print the index number of the first occurence of "lets"
		System.out.println(x.indexOf("l"));
		
		//check to see if there is any special sighns/symbol used in the string
//		
		
		System.out.println(x.replaceAll("[a-zA-Z0-9 ]", ""));
		
		//if so, then print this message "there are symbols in the text" if not
		//then print "no sign is used"
		//if you are up for it, print the signs if there are any signs in the text as well

		if (x.replaceAll("[a-zA-Z0-9 ]", "").length() >0) {
			System.out.println("there are signs in the text:" + x.replaceAll("[a-zA-Z0-9 ]", ""));
		}else {
			System.out.println("no sign is used");
		}

}}
