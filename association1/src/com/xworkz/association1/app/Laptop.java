package com.xworkz.association1.app;

public class Laptop {
	private String brand;
	private Processor processor;

	public Laptop(String brand) {
		this.brand = brand;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public void turnOn() {
		System.out.println("Turning on the laptop...");
	}

	public void browseInternet() {
		System.out.println("Browsing the internet on the laptop...");
	}

	public void watchMovie() {
		System.out.println("Watching a movie on the laptop...");
	}

	public void shutdown() {
		System.out.println("Shutting down the laptop...");
		this.processor.processing();
	}
}
