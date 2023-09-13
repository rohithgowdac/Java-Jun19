class Soda{
	static void Distributer(String name,String type,int variety)
	{
		System.out.println("Invoking soda distributer");
		
		System.out.println("soda name:"+name);
		System.out.println("soda type:"+type);
		System.out.println("soda variety:"+variety);
		
		if(name!=null){
			System.out.println("name is valid");
		}
		else{
			System.out.println("name is invalid");
		}
		
		if(type!=null){
			System.out.println("type is valid");
		}
		else{
		System.out.println("type is invalid");
		}
		if(variety>0 && variety<12){
	    System.out.println("variety is valid");

		}
		else{
		System.out.println("variety is invalid");
			
		}
	}
}