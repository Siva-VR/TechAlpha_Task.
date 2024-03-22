package com;

import java.util.ArrayList;

public class TestDriver {

	public static void main(String[] args) {

		Travel travel = new Travel();

		ArrayList<Driver> totalDriversList = masterDriverList();

		Driver topDriver = travel.retriveMaximumDistanceTravelledDriver(totalDriversList);
		System.out.println(topDriver);
	}

	private static ArrayList<Driver> masterDriverList() {
		Driver driver1 = new Driver(100, "Lorry", "Ramesh", 1);
		Driver driver2 = new Driver(101, "Car", "Suresh", 555555);
		Driver driver3 = new Driver(999, "Car", "Harish", 8888);
		Driver driver4 = new Driver(102, "Truck", "Mukesh", 8987);

		ArrayList<Driver> totalDriversList = new ArrayList<Driver>();

		totalDriversList.add(driver1);
		totalDriversList.add(driver2);
		totalDriversList.add(driver3);
		totalDriversList.add(driver4);
		return totalDriversList;
	}

	private static Travel isCarDriverCallingCode() {
		Driver driver = new Driver(1, "Lorry", "Pavan", 999.9);

		Travel travel = new Travel();
		boolean isCarDriver = travel.isCarDriver(driver);

		System.out.println(isCarDriver);

		//
		return travel;
	}

}
