package com.xworkz.sep1.app.repository;

public interface JuiceRepository1 {
	int TOTAL_JUICE =10;
	void save(String juice);
	default boolean isExist(String juice) {
		return false;
		
		
	}
	

}
