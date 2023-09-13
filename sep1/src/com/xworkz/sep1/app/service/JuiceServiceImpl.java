package com.xworkz.sep1.app.service;

import com.xworkz.sep1.app.repository.JuiceRepository1;

public class JuiceServiceImpl implements JuiceService {
	private JuiceRepository1 juiceRepository1; 
	public JuiceServiceImpl(JuiceRepository1 juiceRepository1){
		this.juiceRepository1=juiceRepository1;
		
	}
	

	@Override
	public boolean ValidateAndSave(String juice) {
		System.out.println("invoking validand same in juice");
		if(juice != null && ! juice.isEmpty()&& juice.length() >=3 && juice.length() <=10) {
			System.out.println("juice is valid and store juice");
			if(! this.juiceRepository1 .isExist(juice)) {
			this.juiceRepository1.save( "merinda");
			return true;
			
		}
		else {
			System.err.println("JuiceName"+juice+"is already exist,please insert another");
		}
		}
		else {
			System.err.println("cannot  store data,jiuce name is invalid");
		
		}
		// TODO Auto-generated method stub
		return false;
	}

}
