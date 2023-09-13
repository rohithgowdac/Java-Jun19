package com.xworkz.crud1.app.Service;

import com.xworkz.crud1.app.repository.TrainNoRepository;

public class TrainNoServiceImpl implements TrainNoService{
	private TrainNoRepository tarinNoRepository;

	public void TrainNoServiceimpl(TrainNoRepository tarinNoRepository) {
		this.tarinNoRepository=tarinNoRepository;
	}

	@Override
	public boolean validateAndSave(int trainNo) {
		System.out.println("invoking validate and save "+this.getClass().getSimpleName());
		if(trainNo!=0 && trainNo>=1000 && trainNo<=999999)
		{
			System.out.println("train no is valid..");
			if(!this.tarinNoRepository.isExist(trainNo))
			{
			this.tarinNoRepository.numbers(trainNo);
			return true;
			}
		}
		return false;
	}


}
