package com.xworkz.newspaper.app.dto;

import java.io.Serializable;

public class NewspaperDto implements Serializable {
	private String publisher;
	private String lang;
	private int pages;
	private double cost;
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	

	}
	 


