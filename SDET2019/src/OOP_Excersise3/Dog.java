package OOP_Excersise3;

public class Dog extends Animal {
	
	private static int countOfDogs = 0;
	
	public Dog (String name, int age, boolean sleepy, int count) {
		super (name, age, sleepy);
		
		this.countOfDogs = count;
	}

	public static int getCountOfDogs() {
		return countOfDogs;
	}

	public static void setCountOfDogs(int countOfDogs) {
		Dog.countOfDogs = countOfDogs;
	}

}
