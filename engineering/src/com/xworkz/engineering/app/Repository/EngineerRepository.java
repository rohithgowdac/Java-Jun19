package com.xworkz.engineering.app.Repository;

import com.xworkz.engineering.app.dto.EngineerDTO;

public interface EngineerRepository {
	int TOTAL_ITEMS=5;
	void save(EngineerDTO dto);
	boolean validateandsave(EngineerRepository dto); 

}
	
