package com.xworkz.crud1.boot;

public class TrainNo {
	public static void main(String[] args) {
        System.out.println("Invoking main in TrainRunner");
        TrainNoRepository trainNoRepository = new TrainNoRepositoryImpl();

        TrainNoService trainNoService = new TrainNoServiceImpl(trainNoRepository);
        boolean ref = trainNoService.validateAndSave("65245");
        System.out.println(ref);

        boolean ref1 = trainNoService.validateAndSave("65345");
        System.out.println(ref1);
    }
}
