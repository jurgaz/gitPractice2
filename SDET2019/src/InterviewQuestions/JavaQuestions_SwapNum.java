package InterviewQuestions;

public class JavaQuestions_SwapNum {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 50;
		
		x = x+y; //60
		y = x-y; //10
		x = x-y; //50
		
		x = x^y;
		y = x^y;
		x = x^y;
		
		System.out.println(x);
		System.out.println(y);
		
	}

}
