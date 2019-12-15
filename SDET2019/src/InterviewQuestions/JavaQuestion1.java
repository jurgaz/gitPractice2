package InterviewQuestions;

import java.lang.reflect.Array;

public class JavaQuestion1 {

	public static void main(String[] args) {
		
	//Q1	
	//how to reverse a string e.g. Start = TRATS
			
		String y = "START";
		
		
		char s[] = y.toCharArray();
		
//		System.out.println(s);
				
		for (int i = y.length() - 1; i >=0; i--) {
			
			System.out.print(s[i]);
					
		}
		
		StringBuffer sb = new StringBuffer(y);
		System.out.println(sb.reverse());
		
		String text = "Immutable";
		text = "im a different text now";
		
		
		
		System.out.println( "\n***********");
		
		
		
//   Q2
   //how to reverse int e.g. 12345 = 54321
		
		//converted to char
		
		System.out.println("with formula");
		
		int num = 1235676545;
		
		int rev = 0;
				
		while (num !=0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
			
			System.out.println(rev);
		}
		System.out.println("**********");
		String x = "12345" ;
		char z[] = x.toCharArray();
		
		System.out.println(z);
		
		for (int i = x.length()-1; i>=0; i--) {
			System.out.print(z[i]);
		}
		System.out.println( "\n***********");
		
		//without converting to char
		
		int numbers [] = {1, 2, 3, 4, 5};
		for (int i=0; i< numbers.length; i++) {
		System.out.print(numbers[i]);
	}
		System.out.println( "\nReversed numbers without converting:");

	for( int i = numbers.length -1; i >= 0; i--) {
		System.out.print(numbers[i]);
	}
	
	
	
	
}
}