package OOP_Excersise3;

import java.util.ArrayList;

public class Animal_Runner {

	public static void main(String[] args) {
		
		
		//create an overloaded constructor for each animal class
		//create 3 of each animal here in this runner
		
		ArrayList<Dog> mydogs = new ArrayList<Dog>(); 
		//print names of animals
		System.out.println("My Dogs :");
				
		Bird b1 = new Bird("Eagle", 12, true);
		Bird b2 = new Bird ("Big",2, false);
		Bird b3 = new Bird ("Sparrow", 2, true);
		
		Dog d1 = new Dog ("Spaniel", 2, false, 0);
		mydogs.add(d1);
		Dog d2 = new Dog ("Poodle", 5, true, 0);
		mydogs.add(d2);
		Dog d3 = new Dog ("Terrier", 6, false, 0);
		mydogs.add(d3);
		
		mydogs.add(new Dog("Rix", 18, true, 0));  //creates and initializes the object withhin a method
		
		
		Cat c1 = new Cat ("Lisa", 5, false);
		Cat c2 = new Cat ("Bubu", 7, true);
		Cat c3 = new Cat ("Mubu", 3, true);
		
		for (Dog dog : mydogs) {
			System.out.println(dog.getName() + " " + dog.getAge());
		}
		
		System.out.println("My birds:" + " " +b1.getName() + " " + b1.getAge()+  " " +  b1.isSleepy() + "," +
				 " " +b2.getName() + " " + b2.getAge()+  " " +  b2.isSleepy() + "," +
				 " " +b3.getName() + " " + b3.getAge()+  " " +  b3.isSleepy());
		
		System.out.println("My cats:" + " " +c1.getName() + " " + c1.getAge()+  " " +  c1.isSleepy() + "," +
				 " " +c2.getName() + " " + c2.getAge()+  " " +  c2.isSleepy() + "," +
				 " " +c3.getName() + " " + c3.getAge()+  " " +  c3.isSleepy());
		
		System.out.println(  "My dogs: " + d1.getName() + " " + d1.getAge()+  " " +  d1.isSleepy() + "," +
				 " " +d2.getName() + " " + d2.getAge()+  " " +  d2.isSleepy() + "," +
				 " " +d3.getName() + " " + d3.getAge()+  " " +  d3.isSleepy() );
		
	}


	
	
}
