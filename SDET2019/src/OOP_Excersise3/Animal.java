package OOP_Excersise3;

public class Animal {
	
	private String name;
	private int age;
	private boolean sleepy;
	
	public Animal () {
		this.name = " ";
		this.age = 0;
		this.sleepy = false;
	}
	
	public Animal(String name, int age, boolean sleepy) {
		super();
		this.name = name;
		this.age = age;
		this.sleepy = sleepy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isSleepy() {
		return sleepy;
	}
	public void setSleepy(boolean sleepy) {
		this.sleepy = sleepy;
	}
	
	

}
