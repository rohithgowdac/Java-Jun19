package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.NewspaperDto;

public class NewspaperRepositoryImpl implements NewspaperRepository {
	private NewspaperDto[] dtos=new NewspaperDto[TOTAL_ITEMS];
	private int  position;

	@Override
	public void save(NewspaperDto dto) {
		System.out.println("running save in"+ this.getClass().getCanonicalName());
		if(position<TOTAL_ITEMS);{
		this.dtos[position]=dto;
		System.out.println(dto +"is saved method");
		this.position++;
	}else {
		System.err.println("storage is full...cannot space");
		
		
		
	}
	

}
}
