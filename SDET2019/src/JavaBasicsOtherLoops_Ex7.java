
public class JavaBasicsOtherLoops_Ex7 {

	public static void main(String[] args) {

		int array[] = { 1, 2, 53, 99, 60, 23, 7 };

// for loop
			System.out.println("***** For Loop ******");	
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

// for each loop
		System.out.println("***** For Each Loop ******");
		for (int index : array) {
			System.out.println(index);
		}
		
//while loop
		
		System.out.println("***** While Loop ******");
		int counterForLoop = 0;
		while (counterForLoop < array.length)
		{
			System.out.println(array[counterForLoop]);
			counterForLoop++;
		}
		
//do while loop
		System.out.println("***** Do While Loop ******");
		int counterForDoWhileLoop = 0;
		do {
			System.out.println(array[counterForDoWhileLoop]);
			counterForDoWhileLoop++;
		} while (counterForDoWhileLoop < array.length);
	}
}
