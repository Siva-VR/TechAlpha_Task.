package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Travel {

	public boolean isCarDriver(Driver driver) {

		return driver.getCategory().equalsIgnoreCase("Car");
	}

	public String retrieveByDriverId(ArrayList<Driver> totalDrivers, int searchingDriverId) {

		for (Driver driver : totalDrivers) {

			int currentDriverId = driver.getDriverId();
			if (currentDriverId == searchingDriverId) {
				String driverName = driver.getDriverName();
				String driverCat = driver.getCategory();
				double totalDistance = driver.getTotalDistance();
				String response = "Driver name is " + driverName + " Belonging to the category" + driverCat
						+ " travelled " + totalDistance + " KM so far.";
				System.out.println(response);
				return response;
			}

		}

		return "";
	}

	// 3 methods

	public int retriveCountOfDriver(ArrayList<Driver> driverList, String category) {
		int driversCount = 0;
		for (Driver driver : driverList) {
			if (driver.getCategory().equalsIgnoreCase(category)) {
				driversCount++;
			}
		}
		return driversCount;
	}

	public ArrayList<Driver> retriverDriver(ArrayList<Driver> driverList, String category) {
		ArrayList<Driver> response = new ArrayList<Driver>();
		for (Driver driver : driverList) {
			if (driver.getCategory().equalsIgnoreCase(category)) {
				response.add(driver);
			}
		}
		return response;
	}

	public List<Driver> retriverDriverByJava8(ArrayList<Driver> driverList, String category) {
		List<Driver> response = driverList.stream().filter(d -> d.getCategory().equalsIgnoreCase(category))
				.collect(Collectors.toList());
		return response;
	}

	public Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> driverList) {
		Driver topDriver = new Driver();
		if (!driverList.isEmpty()) {
			topDriver = driverList.get(0);
			for (Driver driver : driverList) {
				if (driver.getTotalDistance() > topDriver.getTotalDistance()) {
					topDriver = driver;
				}
			}
		}
		return topDriver;
	}

}
