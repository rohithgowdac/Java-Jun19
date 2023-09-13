package com.xworkz.engineer.app.repository;

import com.xworkz.engineer.app.dto.ApplicationDTO;

public interface ApplicationRepository {
	int TOTAL_APPS = 10;

	void save(ApplicationDTO dto);

	default boolean isExist(ApplicationDTO dto) {
		return false;
	}

	default ApplicationDTO findByName(String name) {
		return null;
	}

	ApplicationDTO findByNameAndDevelopedBy(String name, String developedBy);
}

