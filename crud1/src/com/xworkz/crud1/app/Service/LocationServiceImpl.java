package com.xworkz.crud1.app.Service;

import com.xworkz.crud1.app.repository.LocationRepository;

public class LocationServiceImpl implements LocationService {
	private LocationRepository locationRepository;

	public void LocationServiceimpl(LocationRepository locationRepository) {
		this.locationRepository = locationRepository;
	}

	@Override
	public boolean validateAndSave(String location) {
		System.out.println("invoking validate and Save " + this.getClass().getSimpleName());
		if (location != null && !location.isEmpty() && location.length() >= 3 && location.length() <= 20) {
			System.out.println("store data is valid..");
			if (!this.locationRepository.isExist(location)) {
				this.locationRepository.store(location);
				return true;
			}
			else
			{
				System.err.println("Location name is already exist..");
			}
		} else {
			System.err.println("Stored data is invalid, cannot save..");
		}
		return false;
	}


}
