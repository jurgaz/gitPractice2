package OOP_Excersize1;

import java.util.ArrayList;

public class HighWay {
	
//name
//speed limit
//list of cars on the road
		
	private String name; 
	private int speedLimit;
	private ArrayList<Car> carsOnRoad;
	
	public HighWay() {
		name = "";
		speedLimit = 0;
		carsOnRoad = new ArrayList<Car>();
	}
	
	public HighWay(String name, int speedLimit, ArrayList<Car> carsOnRoad) {
		this.name = name;
		this.speedLimit = speedLimit;
		this.carsOnRoad = carsOnRoad;
	}
	
	public HighWay(String name, int speedLimit) {
		this.name = name;
		this.speedLimit = speedLimit;
		carsOnRoad = new ArrayList<Car>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeedLimit() {
		return speedLimit;
	}

	public void setSpeedLimit(int speedLimit) {
		this.speedLimit = speedLimit;
	}

	public ArrayList<Car> getCarsOnRoad() {
		return carsOnRoad;
	}

	public void setCarsOnRoad(ArrayList<Car> carsOnRoad) {
		this.carsOnRoad = carsOnRoad;
	}
	
	public void addCarToTheRoad(Car newCar) {
		carsOnRoad.add(newCar);
	}
	
	public ArrayList<Car> getCarsOverSpeed(){
		ArrayList<Car> overSpeed = new ArrayList<Car>();
		
		for (Car c : carsOnRoad) {
			if(c.getCurrentSpeed() > speedLimit) {
				overSpeed.add(c);
			}
		}
	
		return overSpeed;
	}
	
}
