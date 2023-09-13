package com.xworkz.encapsulation.app;

public class Ola {
	private int startedyear=2001;
	private int capacityofbattary=5000;
	private String companyname="ola";
	private String ownername ="rohith";
	private String CEO="bhavish agarwal";
	private double turnover=56.66;
	private int numberofemp=10000;
	private float startedversion=99.6f;
	private float currentversion=10.4f;
	private boolean locationsharing=true;
	private boolean sensorworking=true;
	private boolean speakerworking=true;

	public int getstartedyear() {
		return this.startedyear;
	}

	public void setstartedyear(int startedyear) {
		this.startedyear=startedyear;
	}
	public int getcapacityofbattary() {
		return this.capacityofbattary;
	}

	public void setcapacityofbattary(int capacityofbattary) {
		this.capacityofbattary=capacityofbattary;
	}
	public String getcompanyname() {
		return this.companyname;
	}
	public void setcompanyname(String companyname) {
		this.companyname=companyname;
	}
	public String getownername() {
		return this.ownername;
	}
	public void setownername(String ownername) {
		this.ownername=ownername;
	}
	public String getCEO() {
		return this.CEO;
	}
	public void setCEO(String CEO) {
		this.CEO=CEO;
	}
	public double getturnover() {
		return this.turnover;
	}
	public void setturnover(double turnover) {
		this.turnover=turnover;
	}
	public int getnumberofemp() {
		return this.numberofemp;
	}

	public void setnumberofemp(int numberofemp) {
		this.numberofemp=numberofemp;
	}
	public float getstartedversion() {
		return this.startedversion;
	}
	public void setstartedversion(float startedversion) {
		this.startedversion=startedversion;
	}
	public boolean getlocationsharing() {
		return this.locationsharing;
	}
	public void setlocationsharing(boolean locationsharing) {
		this.locationsharing=locationsharing;
	}
	}
