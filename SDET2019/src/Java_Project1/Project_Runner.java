package Java_Project1;

import java.util.ArrayList;

public class Project_Runner {

	public static void main(String[] args) {

		HighWay hw95 = new HighWay("HighWay95", 70, 30);
		HighWay hw66 = new HighWay("HighWay66", 65, 20);
		HighWay hw495 = new HighWay("HighWay495", 75, 15);
		HighWay hw295 = new HighWay("HighWay295", 50, 40);
		HighWay hw270 = new HighWay("HighWay270", 55, 30);
		HighWay hw395 = new HighWay("HighWay395", 80, 20);

		Car c1 = new Car(30, 10, true, "Honda", "Civic", "T4", 100, 2018, "Robert");
		Car c2 = new Car(28, 10, true, "Chevy", "Sonic", "H4", 120, 2017, "Mike");
		Car c3 = new Car(24, 120, true, "Toyota", "Corolla", "C5", 90, 2016, "Jorge");
		Car c4 = new Car(0, 0, false, "Hyundai", "Accent", "C4", 80, 2018, "Julio");
		Car c5 = new Car(25, 100, true, "Dodge", "Stratus", "G3", 50, 1977, "Denis");
		Car c6 = new Car(58, 15, true, "Volvo", "XC60", "M3", 90, 1990, "Daniel");
		Car c7 = new Car(26, 90, true, "Jeep", "Cherokee", "CS4", 130, 2018, "Mariel");
		Car c8 = new Car(29, 0, false, "Toyota", "Prius", "T4", 80, 2000, "Sam");
		Car c9 = new Car(45, 55, true, "Nissan", "Versa", "S4", 85, 1997, "Donald");
		Car c10 = new Car(26, 55, true, "Toyota", "Yaris", "B4", 100, 2015, "George");

		hw95.addCarsORoad(c1);

		hw95.removeCarsOnRoad(c1);

		hw95.addCarsORoad(c2);
		hw95.addCarsORoad(c3);
		hw95.addCarsORoad(c4);
		hw95.addCarsORoad(c5);
		hw95.addCarsORoad(c6);
		hw95.addCarsORoad(c7);
		hw95.addCarsORoad(c8);
		hw95.addCarsORoad(c9);
		hw95.addCarsORoad(c10);

		hw66.addCarsORoad(c1);
		hw66.addCarsORoad(c2);
		hw66.addCarsORoad(c3);
		hw66.addCarsORoad(c4);
		hw66.addCarsORoad(c5);
		hw66.addCarsORoad(c6);
		hw66.addCarsORoad(c7);
		hw66.addCarsORoad(c8);
		hw66.addCarsORoad(c9);
		hw66.addCarsORoad(c10);

		hw495.addCarsORoad(c1);
		hw495.addCarsORoad(c2);
		hw495.addCarsORoad(c3);
		hw495.addCarsORoad(c4);
		hw495.addCarsORoad(c5);
		hw495.addCarsORoad(c6);
		hw495.addCarsORoad(c7);
		hw495.addCarsORoad(c8);
		hw495.addCarsORoad(c9);
		hw495.addCarsORoad(c10);

		hw295.addCarsORoad(c1);
		hw295.addCarsORoad(c2);
		hw295.addCarsORoad(c3);
		hw295.addCarsORoad(c4);
		hw295.addCarsORoad(c5);
		hw295.addCarsORoad(c6);
		hw295.addCarsORoad(c7);
		hw295.addCarsORoad(c8);
		hw295.addCarsORoad(c9);
		hw295.addCarsORoad(c10);

		hw270.addCarsORoad(c1);
		hw270.addCarsORoad(c2);
		hw270.addCarsORoad(c3);
		hw270.addCarsORoad(c4);
		hw270.addCarsORoad(c5);
		hw270.addCarsORoad(c6);
		hw270.addCarsORoad(c7);
		hw270.addCarsORoad(c8);
		hw270.addCarsORoad(c9);
		hw270.addCarsORoad(c10);

		hw395.addCarsORoad(c1);
		hw395.addCarsORoad(c2);
		hw395.addCarsORoad(c3);
		hw395.addCarsORoad(c4);
		hw395.addCarsORoad(c5);
		hw395.addCarsORoad(c6);
		hw395.addCarsORoad(c7);
		hw395.addCarsORoad(c8);
		hw395.addCarsORoad(c9);
		hw395.addCarsORoad(c10);

		{
			System.out.println("******* Cars Above Speed********");

			hw95.getListOfCarsAboveSpeedLimit();
			for (Car c : hw95.getListOfCarsAboveSpeedLimit()) {

				System.out.println(c.toString());
			}
		}
		{
			System.out.println("******* Cars Below Speed********");

			hw95.getListOfCarsBellowSpeedLimit();
			for (Car a : hw95.getListOfCarsBellowSpeedLimit()) {

				{
					System.out.println(a.toString());
				}
			}
			{
				System.out.println("******* Cars Stopped on HighWay********");
				hw95.getListOfCarsStoppedOnHighway();
				for (Car c11 : hw95.getListOfCarsStoppedOnHighway()) {

					System.out.println(c11.toString());
				}

			}

		}

	}
}
