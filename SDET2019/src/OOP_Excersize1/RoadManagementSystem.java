package OOP_Excersize1;

public class RoadManagementSystem {

	public static void main(String[] args) {
		
		HighWay hw95 = new HighWay("High Way 95", 65);
		HighWay hw66 = new HighWay("High Way 66", 55);
		
		Car car001 = new Car("Honda", "Civic", 2014, "Blue", "Sedan", "Suhbat Khan", 1, 120);
		hw66.addCarToTheRoad(car001);
		Car car002 = new Car("Toyota", "Corolla", 2016, "Black", "Sedan", "Anzar Gul", 2, 72);
		hw66.addCarToTheRoad(car002);
		
		hw66.getCarsOverSpeed();
	

	for (Car c: hw66.getCarsOverSpeed()) {
		System.out.println(c.getOwnerName() + c.getCurrentSpeed());
	}
	
	
}
}