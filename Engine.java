public class Engine{
	
	static int getCCByModel(String carName){
		if(carName != null){

			if(carName == "audi"){
				System.out.printf("carName is: %s\n",  carName);
				return 100;
			}
			if(carName == "bmw"){
				System.out.printf("carName is: %s\n",  carName);
				return 130;
			}
			if(carName == "rapid"){
				System.out.printf("carName is: %s\n",  carName);
				return 120;
			}
			if(carName == "swift"){
				System.out.printf("carName is: %s\n",  carName);
				return 110;
			}
			if(carName == "bently"){
				System.out.printf("carName is: %s\n",  carName);
				return 150;
			}
			if(carName == "benz"){
				System.out.printf("carName is: %s\n",  carName);
				return 160;
			}
		}
		else{
			System.out.println("carName is invalid");
		}
		return 1;
	}
	
}