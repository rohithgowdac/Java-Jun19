package com.xworkz.pant.app;

public class Pant {
	private Zip zip;

	public Pant(String name) {
	}

	public void setZip(Zip zip) {
		this.zip = zip;
	}

	public void open() {
		System.out.println("Invoking travel() in Passenger.....");
		this.zip.design();
	}


}
