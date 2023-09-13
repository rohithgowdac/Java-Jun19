package com.xworkz.interface1.app;

public interface Metro {
	void announceArrival(String stationName);

	boolean isTrainRunning();

	int timeTaken(int noOfHours);

}
