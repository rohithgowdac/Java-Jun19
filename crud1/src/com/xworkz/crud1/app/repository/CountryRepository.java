package com.xworkz.crud1.app.repository;

public interface CountryRepository {
	int TOTAL_COUNTRY=5;

	void save(String country);

	default boolean isExist(String country)
	{
		return false;
	}
}

