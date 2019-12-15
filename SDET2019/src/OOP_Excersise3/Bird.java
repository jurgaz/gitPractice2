package OOP_Excersise3;

public class Bird extends Animal {
	
	public Bird (String name, int age, boolean sleepy) {
		super (name, age, sleepy);
		
	}
	
	@Override
	public String getName() {   //customizes the method from the parent class
		return "bird";
	}
//	@Override
//	public String getName() {   //calls same method from the parent class
//		return "Bird" + super.getName();
//	}
}
