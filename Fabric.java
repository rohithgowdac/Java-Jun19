public class Fabric{
	static double getPrice(String clothFabric){
		System.out.println("Price of the cloth");
		if(clothFabric != null){
			if(clothFabric == "cotton"){
				System.out.println("cloth is: " + clothFabric);
				return 400;
			}
			if(clothFabric == "nylon"){
				System.out.println("cloth is: " + clothFabric);
				return 300;
			}
			if(clothFabric == "woollen"){
				System.out.println("cloth is: " + clothFabric);
				return 350;
			}
			if(clothFabric == "silk"){
				System.out.println("cloth is: " + clothFabric);
				return 380;
			}
			if(clothFabric == "linen"){
				System.out.println("cloth is: " + clothFabric);
				return 400;
			}
			if(clothFabric == "polyaster"){
				System.out.println("cloth is: " + clothFabric);
				return 600;
			}
		}
		else{
			System.out.println("Price is not acceptable");
		}
		return 0;
	}
	
}