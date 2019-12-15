package OOP_Interfaces;

public interface Vehicle {
	
	int maxSpeed = 50;
	
	//public static final maxSpeed - the way system sees this value
	
	public void startEngine();
	
	public double getCurrentSpeed();  //method with return type
	
	public void changeSpeed(double newSpeed);
	
	

}
