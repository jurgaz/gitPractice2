package OOP_Excersise3;

public class Cat extends Animal {
	
	public Cat (String name, int age, boolean sleepy) {
		super (name, age, sleepy);
	}
	
	@Override
public String toString() {
		if(isSleepy()) {
	return "Cat Name" + getName() + " Age " + getAge() + " " + "The cat is sleepy ";
		}else {
			return "Cat Name" + getName() + " Age " + getAge() + " " + "The cat is not sleepy ";
		}
	
	
}
	
}
