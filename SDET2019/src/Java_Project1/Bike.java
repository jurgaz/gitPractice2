package Java_Project1;

public class Bike extends Vehicle {
	
	double currentSpeed;

	
	public Bike (String name, String make, String model, int maxSpeed, int year, String owner) {
		super (name, make, model, maxSpeed, year, owner);
		
	}

	public Bike() {
		super();
		currentSpeed = 0.0;
			}
		public Bike (String name, int maxSpeed, String owner) {
			
	}
	public double getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(double currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	
	@Override
	public String toString() {
		return "Bike [currentSpeed=" + currentSpeed + ", name=" + name + ", make=" + make + ", model=" + model
				+ ", maxSpeed=" + maxSpeed + ", year=" + year + ", owner=" + owner + "]";
	}



	public void BreakABit () {
		this.currentSpeed = currentSpeed - 2;
	
}
	public void Break () {
		this.currentSpeed = 0;
}
	
	
}