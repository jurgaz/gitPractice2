package Study_Group;

public class Car_Running {




public static void main(String[] args) {
	 
		// local variable
		Car porsche =new Car();
		Car honda = new Car();
		Car engine= new Car();
		
		
		porsche.setModel("correra");
		honda.setModel("commodore");

		
		System.out.println("this is the model="+ honda.getModel());
		
		System.out.println("this is the model="+ engine.getModel());
		System.out.println("this is the model="+ porsche.getModel());
		
		// Inherited
		// before setmodel is created. we can have a class in class like string
	
		// if you change the model name we will get a unknown model in console
		// what it means we cant assign model name that we have not defined in car class
		// that the whole concept of encapsulation by not allowing people
		/*
		 * porsche.setmodel("Correra");
		 * 
		 * System.out.println("Model is " + porsche.getModel());
		 * 
		 * 
		 * 
		 */

	}

}


