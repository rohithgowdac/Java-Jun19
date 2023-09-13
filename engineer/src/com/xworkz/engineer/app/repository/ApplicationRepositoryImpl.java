package com.xworkz.engineer.app.repository;

import com.xworkz.engineer.app.dto.ApplicationDTO;

public class ApplicationRepositoryImpl implements ApplicationRepository {
	private ApplicationDTO[] dtos = new ApplicationDTO[TOTAL_APPS];
	int position;
	private ApplicationDTO dto;

	@Override
	public void save(ApplicationDTO dto) {
		System.out.println("Running save in ApplicationRepositoryImpl....");
		if (this.position < TOTAL_APPS) {
			this.dtos[position] = dto;
			System.out.println("Stored " + dto + " in position" + this.position);
			position++;
		} else {
			System.err.println("Storage is full ,cannot store dto");
		}
	}

	@Override
	public boolean isExist(ApplicationDTO dto) {
		for (int i = 0; i <= this.position; i++) {
			ApplicationDTO temp = this.dtos[i];
			if (temp != null && temp.equals(dto)) {
				System.err.println("It can not store because it is having equal value");
				return true;
			}
		}
		return false;
	}

@Override
public ApplicationDTO findByNameAndDevelopedBy(String name, String developedBy) {
	// TODO Auto-generated method stub
	System.out.println("Running findByName....");
	System.out.println("Current position "+this.position);
	for (int i = 0; i <= this.position; i++) {
		dto=this.dtos[i];
		if (dto.getName().equals(name) && dto.getDevelopedBy().equals(developedBy)) {
	  System.out.println("Dto matched");
	  return dto;
		
	}
	}
		System.err.println("Dto not matched");
	return ApplicationRepository.super.findByName(name);
}


}
