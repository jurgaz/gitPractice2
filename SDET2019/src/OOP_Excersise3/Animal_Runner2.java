package OOP_Excersise3;



	import java.util.ArrayList;

	public class Animal_Runner2 extends Animal {

		public static void main(String[] args) {
			
			
			//create an overloaded constructor for each animal class
			//create 3 of each animal here in this runner
			
			ArrayList<Animal> mydogs = new ArrayList<Animal>(); //polymorphism - using parents class array to store all animal information
			//print names of animals                              declaring an object of a parent class and initializing any of the child classes
			System.out.println("My Dogs :");
					
			Bird b1 = new Bird("Eagle", 12, true );
			Bird b2 = new Bird ("Big",2, false);
			Bird b3 = new Bird ("Sparrow", 2, true);
			
			Dog d1 = new Dog ("Spaniel", 2, false, 1);
			mydogs.add(d1);
			Dog d2 = new Dog ("Poodle", 5, true, 2);
			mydogs.add(d2);
			Dog d3 = new Dog ("Terrier", 6, false, 2);
			mydogs.add(d3);
			
			mydogs.add(new Dog("Rix", 18, true, 6));  //creates and initializes the object withhin a method
			mydogs.add(new Cat ("Pix", 3, false));
			
			System.out.println(d1.getCountOfDogs()); //gives 5, because that's the number assigned 
			
			Cat c1 = new Cat ("Lisa", 5, false);
			Cat c2 = new Cat ("Bubu", 7, true);
			Cat c3 = new Cat ("Mubu", 3, true);
			
			for (Animal dog : mydogs) {
				System.out.println(dog.getName() + " " + dog.getAge());
			}
			
			Animal obj = new Cat ("Coty", 10, true); //polymorphism
			System.out.println(obj);
			
		}


		
		
	}



