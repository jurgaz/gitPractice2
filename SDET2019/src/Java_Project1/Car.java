package Java_Project1;

public class Car extends Vehicle {
	
	int mpg;
	double currentSpeed;
	boolean engineStatus;
	
	public Car () {
		super();
		mpg = 0;
		currentSpeed = 0.0;
		engineStatus = false;
			}
	public Car(int mpg, double currentSpeed, boolean engineStatus) {
		this.mpg = mpg;
		this.currentSpeed = currentSpeed;
		this.engineStatus = engineStatus;
	}
	
	public Car(int mpg, double currentSpeed, boolean engineStatus, String name, String make, String model, int maxSpeed, int year, String owner) {
		super(name, make, model, maxSpeed, year, owner);                                           
		this.mpg = mpg;
		this.currentSpeed = currentSpeed;
		this.engineStatus = engineStatus;
	}
	public int getMpg() {
		return mpg;
	}
	public void setMpg(int mpg) {
		this.mpg = mpg;
	}
	public double getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(double currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	public boolean isEngineStatus() {
		return engineStatus;
	}
	public void setEngineStatus(boolean engineStatus) {
		this.engineStatus = engineStatus;
	}
	

@Override
	public String toString() {
		return "Car [currentSpeed=" + currentSpeed + ", name="
				+ name + ", make=" + make + ", model=" + model + ", maxSpeed=" + maxSpeed + ", year=" + year
				+ ", owner=" + owner + ", engineStatus=" + engineStatus + "]";	}



	
	public void BreakABit () {
		this.currentSpeed = currentSpeed - 5;
	}
	
	
	public void Break () {
		this.currentSpeed = 0;
	}
	public void StartEngine() {
		this.engineStatus = true;
	}
	public void OffEngine () {
	this.currentSpeed = 0;
	this.engineStatus = false;
	
		
	}
	
	public void SpeedUp (int speedIncrease) {
	this.currentSpeed = currentSpeed + speedIncrease;
	}
	
	}
	


	
	
