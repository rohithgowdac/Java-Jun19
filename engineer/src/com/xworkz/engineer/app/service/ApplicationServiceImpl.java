package com.xworkz.engineer.app.service;

import com.xworkz.engineer.app.dto.ApplicationDTO;
import com.xworkz.engineer.app.repository.ApplicationRepository;

public class ApplicationServiceImpl  implements ApplicationService {
	private ApplicationRepository applicationRepository;

	public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
		this.applicationRepository = applicationRepository;
	}

	@Override
	public boolean validateAndSave1(ApplicationDTO dto) {
		System.out.println("Running validateAndSave in ApplicationServiceImpl....");
		if (dto != null) {
			System.out.println("dto is valid,store dto " + this.getClass().getSimpleName());
			int id = dto.getId();
			String name = dto.getName();
			String developedBy = dto.getDevelopedBy();
			String developedAt = dto.getDevelopedAt();
			String version = dto.getVersion();

			if (id > 0) {
				System.out.println("ID " + dto.getId() + " is valid");
			} else {
				System.err.println("ID " + dto.getId() + " is invalid");
			}
			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 50) {
				System.out.println("Name " + dto.getName() + " is valid");
			} else {
				System.err.println("Name " + dto.getName() + " is invalid");
			}
			if (developedBy != null && !developedBy.isEmpty() && developedBy.length() >= 3
					&& developedBy.length() <= 50) {
				System.out.println("DevelopedBy " + dto.getDevelopedBy() + " is valid");
			} else {
				System.err.println("DevelopedBy " + dto.getDevelopedBy() + " is invalid");
			}
			if (developedAt != null && !developedAt.isEmpty() && developedAt.length() >= 3
					&& developedAt.length() <= 50) {
				System.out.println("DevelopedAt " + dto.getDevelopedAt() + " is valid");
			} else {
				System.err.println("DevelopedAt " + dto.getDevelopedAt() + " is invalid");
			}

			if (!this.applicationRepository.isExist(dto)) {
				System.out.println("Already exist");
				this.applicationRepository.save(dto);
				return true;
			}

			else {
				System.err.println("Not exist");
			}
		} else {
			System.err.println("Cannot store ,dto is invalid");
		}

		return false;
	}

	@Override
	public boolean validateAndSave(ApplicationDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}


}
