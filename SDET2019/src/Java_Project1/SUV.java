package Java_Project1;

public class SUV extends Car {

	public SUV() {
		super();
		
	}

	public SUV(int mpg, double currentSpeed, boolean engineStatus, String name, String make, String model, int maxSpeed,
			int year, String owner) {
		super(mpg, currentSpeed, engineStatus, name, make, model, maxSpeed, year, owner);
		
	}

	public SUV(int mpg, double currentSpeed, boolean engineStatus) {
		super(mpg, currentSpeed, engineStatus);
		
	}

	@Override
	public String toString() {
		return "SUV [mpg=" + mpg + ", currentSpeed=" + currentSpeed + ", engineStatus=" + engineStatus + ", name="
				+ name + ", make=" + make + ", model=" + model + ", maxSpeed=" + maxSpeed + ", year=" + year
				+ ", owner=" + owner + "]";
	}
	
	public void BreakABit() {
		this.currentSpeed = currentSpeed - 4;
	}
	

}
