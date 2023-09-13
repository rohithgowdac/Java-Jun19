package com.xworkz.engineering.app.Repository;

import com.xworkz.engineering.app.dto.EngineerDTO;

public class EngineerRepositoryImpl implements EngineerRepository {
	private EngineerDTO[] dtos=new EngineerDTO[TOTAL_ITEMS];
	private int  position;
	

	@Override
	public void save(EngineerDTO dto) {
		System.out.println("engineer is a course");
		if(position<TOTAL_ITEMS);{
			this.dtos[position]=dto;
			System.out.println(dto +"is saved method");
			this.position++;
			
				
			}else {
				System.err.println("coures is  completed");
			}
				
			}
	}
	



	@Override
	public boolean validateandsave(EngineerRepository dto) {
		// TODO Auto-generated method stub
		return false;
	}
