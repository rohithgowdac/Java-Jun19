package com.xworkz.sep1.app.repository;

public class GroceryItemImpl implements GreoceryRepository{
	private String[] groceries=new String[ITEMS];
	private int position;
	@Override
	public void save(String name) {
		System.out.println("Invoking save in GroceryItemImpl....");
		if(this.position<ITEMS) {
		this.groceries[position]=name;
		System.out.println("Store " +name +  " in position " +this.position);
		this.position++;
	}else {
		System.err.println("Data store is full,items cannot be added");
	}
	}
}
