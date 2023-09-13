package com.xworkz.engineering.app.Service;

import com.xworkz.engineering.app.Repository.EngineerRepository;
import com.xworkz.engineering.app.dto.EngineerDTO;

public class EngineerServiceImpl implements EngineerService {
	private EngineerRepository engineerRepository;
	public EngineerServiceImpl(EngineerRepository engineerRepository) {
		this.engineerRepository=engineerRepository;
		
	}

	@Override
	public boolean validateandsave(EngineerDTO dto) {
		System.out.println("invoking validate and save engineringImplement");
		if (dto !=null) {
			System.out.println("dto is valid item store");
			int id  =dto.getId();
			String name=dto.getCollegeName();
			String collegename=dto.getCollegeName();
			
			if(null !=null &&  !name.isEmpty() && name.length()>=5 && name.length()<=20);
			System.out.println("the name is valid");
		}else {
			System.err.println("the name is  in valid");
		}
		if(null !=null &&  !CollegeaName.isEmpty() && CollegeName.length()>=5 && CollegeName.length()<=20);
		System.out.println("the collegename is valid");
	}else {
		System.err.println("college name is invalid");
			
			
		}
		return false;
	}
	

}
