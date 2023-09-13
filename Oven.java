class Oven{
	static void homeMade(String type,String used,int cost)
	{
		System.out.println("Invoking Oven homeMade");
		
		System.out.println("Oven type:"+type);
		System.out.println("Oven used:"+used);
		System.out.println("Oven cost:"+cost);
		
		if(type!=null){
			System.out.println("type is valid");
		}
		else{
			System.out.println("type is invalid");
		}
		
		if(used!=null){
			System.out.println("used is valid");
		}
		else{
		System.out.println("used is invalid");
		}
		if(cost>0 && cost<1200){
	    System.out.println("variety is valid");

		}
		else{
		System.out.println("variety is invalid");
			
		}
	}
}