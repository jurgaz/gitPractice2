package OOP_Excersize1;

public class Car {
	
//make, 
//	model, 
//	year, 
//	color, 
//	type, 
//	Owner name, 
//	number of people in the car, 
//	current speed
	
	private String make;
	private String model;
	private int year;
	private String color;
	private String type;
	private String ownerName;
	private int peopleInTheCar;
	private double currentSpeed;
	
	public Car() {
		make = "";
		model = "";
		year = 0;
		type = "";
		ownerName = "";
		peopleInTheCar = 0;
		currentSpeed = 0.0;
	}
	
	public Car (String make, String model, int year, String color, String type, String ownerName, int peopleInTheCar, double currentSpeed) {
		
		this.make = make;
		this.model = model;
		this.year = year;
		this.type = type;
		this.ownerName = ownerName;
		this.peopleInTheCar = peopleInTheCar;
		this.currentSpeed = currentSpeed;
			
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getPeopleInTheCar() {
		return peopleInTheCar;
	}
	public void setPeopleInTheCar(int peopleInTheCar) {
		this.peopleInTheCar = peopleInTheCar;
	}
	public double getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(double currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	

}
