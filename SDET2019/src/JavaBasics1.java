
public class JavaBasics1 {
	
	public static void main(String[] args) {
		
		//Exercise 1
//      Create an int with identifier “sales” assign the value 200
//      Create an int with identifier “cost” assign the value 85
//      Create an int with identifier “profit” calculate the profit based on sales and cost
//      Create String with identifier “The profit of the sales we had this far is <profit>
//      Run the code and make sure it works
		
		int sales = 200;
		int cost = 85;
		int profit = sales - cost;
		
		
		String result = "The profit of the sales we had this far is " + profit;
		System.out.println(result);
		
		boolean myFirstBoolean = true;
		boolean mySecondBoolean = false;
		
		double myFirstDouble = 12.12;
		float myFirstFloat = 1.1f;
		
		char myFirstChar = 'A';
		
				
		
		String sumString = "5" + "5";
		System.out.println("String sum: " + sumString);
		
		int sumInt = 5 + 5;
		System.out.println("Int sum: " + sumInt);
		
		double d1 = 5;
		double d2 = 3;
		System.out.println(d1/d2);
		System.out.println(d1%d2);
		
		int n1 = 5;
		int n2 = 3;
		System.out.println(n1/n2);
		System.out.println(n1%n2);
		
		int plusequal = 5;
		plusequal = plusequal + 5;
		//10
		plusequal += 5;
		// 15
		System.out.println();
		
		int x10 = 5;
			x10 -=5;
			x10 = x10 - 5;
			System.out.println(x10);
			
		int x9 = 5;
			x9 *= 7;
			System.out.println(x9);
			
// I'm going to divide apples to people, is it possible to divide them fully
			
			int number = 10;
			
			if (number%3 ==0) {
				System.out.println("you numver is dividible by 3");
			} else {
			System.out.println("you can not divide by 3 fully");
			}
			
			int i = 10;
	
			System.out.println(i++); //10
			
			System.out.println(i); //11
			
			System.out.println(++i);//12
			
			String escape = "that is the \"word\" I like to print";
			System.out.println(escape);
		
			int num1 = 5;
			int num2 = 8;
			int num3 = 13;

			num1 = num2;
			num2 = num3;
			num3 = num1; 
			System.out.println(num3);
			
			int x = 20;
			double y = 1.1;
					System.out.println(x+y);
					
					int m = 5, n = 6, z = 50;
					System.out.println(m + n + z);
			
		   
	} }
		
		
		
		
	

	
		
	

	
