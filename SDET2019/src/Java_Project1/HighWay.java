package Java_Project1;

import java.util.ArrayList;

public class HighWay {

	String name;
	int maxSpeedLimit;
	int minSpeedLimit;
	ArrayList<Car> carsOnRoad;
	boolean engineStatus;

	public HighWay() {
		String name = " ";
		int maxSpeedLimit = 0;
		int minSpeedLimit = 0;
		ArrayList<Car> carsOnRoad = new ArrayList<Car>();
		engineStatus = false;
	}

	public HighWay(String name, int maxSpeedLimit, int minSpeedLimit, ArrayList<Car> carsOnRoad, boolean engineStatus) {
		this.name = name;
		this.maxSpeedLimit = maxSpeedLimit;
		this.minSpeedLimit = minSpeedLimit;
		this.carsOnRoad = carsOnRoad;
		this.engineStatus = engineStatus;
	}

	public HighWay(String name, int maxSpeedLimit, int minSpeedLimit) {
		super();
		this.name = name;
		this.maxSpeedLimit = maxSpeedLimit;
		this.minSpeedLimit = minSpeedLimit;
		carsOnRoad = new ArrayList<Car>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxSpeedLimit() {
		return maxSpeedLimit;
	}

	public void setMaxSpeedLimit(int maxSpeedLimit) {
		this.maxSpeedLimit = maxSpeedLimit;
	}

	public int getMinSpeedLimit() {
		return minSpeedLimit;
	}

	public void setMinSpeedLimit(int minSpeedLimit) {
		this.minSpeedLimit = minSpeedLimit;
	}

	public ArrayList<Car> getCarsOnRoad() {
		return carsOnRoad;
	}

	public void setCarsOnRoad(ArrayList<Car> carsOnRoad) {
		this.carsOnRoad = carsOnRoad;
	}

	public void addCarsORoad(Car newCar) {
		carsOnRoad.add(newCar);
	}

	public void addCarToHighway(Car newCar) {
		carsOnRoad.add(newCar);
	}

	public void removeCarFromHighWay(Car newCar) {
		carsOnRoad.remove(newCar);
	}

	public ArrayList<Car> getListOfCarsAboveSpeedLimit() {
		ArrayList<Car> aboveSpeed = new ArrayList<Car>();

		for (Car c : carsOnRoad) {
			if (c.getCurrentSpeed() > maxSpeedLimit) {
				aboveSpeed.add(c);
			}
		}
		return aboveSpeed;

	}

	public ArrayList<Car> getListOfCarsBellowSpeedLimit() {
		ArrayList<Car> belowSpeed = new ArrayList<Car>();

		for (Car c : carsOnRoad) {
			if (c.getCurrentSpeed() < minSpeedLimit) {
				belowSpeed.add(c);
			}

		}
		return belowSpeed;
	}

	public ArrayList<Car> getListOfCarsStoppedOnHighway() {
		ArrayList<Car> engineOff = new ArrayList<Car>();

		for (Car c : carsOnRoad) {
			if (c.isEngineStatus() == false) {
				engineOff.add(c);

			}
		}
		return engineOff;

	}

	@Override
	public String toString() {
		return "HighWay [name=" + name + ", maxSpeedLimit=" + maxSpeedLimit + ", minSpeedLimit=" + minSpeedLimit
				+ ", carsOnRoad=" + carsOnRoad + "]";
	}

	public void removeCarsOnRoad(Car newCar) {
		carsOnRoad.remove(newCar);

	}

	
		
	}


