class TrainName{
	static void getTrainName(int trainNumber){
		System.out.println("Train Number");
		if(trainNumber != 0){
			if(trainNumber == 11013){
				System.out.println("Train number is: " + trainNumber);
				return "DavanagereExpress";
			}
			if(trainNumber == 11014){
				System.out.println("Train number is: " + trainNumber);
				return "SiddagangaExpress";
			}
			if(trainNumber == 12134){
				System.out.println("Train number is: " + trainNumber);
				return "SRKJunction";
			}
			if(trainNumber == 22691){
				System.out.println("Train number is: " + trainNumber);
				return "ShatabdiExpress";
			}
		}
		else{
			System.out.println("Train number is invalid");
		}
		return "Train";
	}
}