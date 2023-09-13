package com.xworkz.sep1.app.runner;

import com.xworkz.sep1.app.repository.JuiceRepository1;
import com.xworkz.sep1.app.repository.JuiceRepositoryImpl;
import com.xworkz.sep1.app.service.JuiceService;
import com.xworkz.sep1.app.service.JuiceServiceImpl;

public class JuiceRunner {
	public static void main(String[] args) {
		System.out.println("invoking the juiceRunner");
		JuiceRepository1 juiceRepository1=new JuiceRepositoryImpl();
		JuiceService juiceService=new JuiceServiceImpl(juiceRepository1);
		juiceService.ValidateAndSave("merinda");
		juiceService.ValidateAndSave("merinda");

		
		
	}

}
