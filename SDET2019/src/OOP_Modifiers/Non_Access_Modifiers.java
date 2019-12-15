package OOP_Modifiers;

public final class Non_Access_Modifiers {

	public static void main(String[] args) {
		
		
		//finally - a code block used for exception
		//finalize - method in Java in garbage collector that removes unused initial values
		
		// final variable - a value of this variable can not change after
		// final class - no other class can inherit from this class
		// final method - a method can not be overwritten
		
		//final int x = 10; //value can not be changed after
		//x = 15;           //doesn't work
		
		final double taxRate = 0.1;
		System.out.println(taxRate * 200);
		
		//static object - will remain the same thing and value will belong to the class, not the object
		//dynamic - changing 
		//static method - no need to create an object of the class
		
		Book b1 = new Book ("java", "no one", 5263, "someone", "5th");
		Book b2 = new Book ("C#", "no one", 5263, "someone", "5th");
		Book b3 = new Book ("Python", "no one", 5263, "someone", "5th");
		Book b4 = new Book ("Python", "no one", 5263, "someone", "5th");
		System.out.println(b1.getCount());  //count
		
				int x = 10;
				int y = 5;
				int z = 3;

	}

}
