package InterviewQuestions;

public class JavaQuestion_MinMax {

	public static void main(String[] args) {
		
		int data [] = {1, 2, 354, 231, 1, 5,3};
		int min = data [0];
		int max = data [0];
		int ave = 0;
		int sum = 0;
		
		for (int i : data) {
			if (i > max) {
				max = i;
			}
			
			if (i < min) {
				min = i;
			}
			sum += i;
			ave = sum/data.length;
		}
		
System.out.println(min);
System.out.println(max);
System.out.println(sum);
System.out.println(ave);

	}

}
