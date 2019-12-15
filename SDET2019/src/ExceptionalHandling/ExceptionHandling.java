package ExceptionalHandling;

public class ExceptionHandling {
	
//	public static int divide(int a, int b) {
//		return a/b;
//		
//	}
//	
		public static void main(String[] args) {
		int x = 0;
//		
//		try {
//			x = divide(10, 0);
//		}
//		catch (ArithmeticException e)	{
//					e.printStackTrace(); // prints the red line, doesn't stop the execution
//					throw e;
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//					System.out.println("some exception happened");
//					System.out.println(e.getMessage());
//		}	finally {                                 //optional
//		
//		System.out.println("Finally Block");
//	}
		// try and catch - looking for exception and dealing with it there
		// throw - telling the system to throw an exception within the code block; I want this exception to occur and stop the execution;
		// throws - used after method definition to clarify that when you use this method, expect this exception to happen, is used for method chaining
		
		
//		public static int divide (int a, int b) throws ArithmeticException {
//			return a/b;
//		}
//		System.out.println(divide(10,5));
		
		public static void printIndexValue(int i) {
			String[] test = {"data1", "data2", "data3"};
			System.out.println(test[i]);
			
		}
}}
