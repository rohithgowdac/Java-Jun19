package com.xworkz.sep1.boot;

import com.xworkz.sep1.app.repository.GreoceryRepository;
import com.xworkz.sep1.app.repository.GroceryItemImpl;

public class GroceryRunner {
public static void main(String[] args) {
	System.out.println("Invoking main in GroceryRunner");
	GreoceryRepository repo=new GroceryItemImpl();
	repo.save("Curd");
	repo.save("tomato");
	repo.save("potato");
	repo.save("chilli");
	repo.save("milk");
	repo.save("coriyander");
	repo.save("sugar");
	repo.save("salt");
	repo.save("oil");
	repo.save("ghee");
	repo.save("carrot");
}
}
