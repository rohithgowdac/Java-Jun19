class Mall{
	
	String mallname;
	String address;
	String parkingspace;
	int noofstores;
	String  escalator;
	String  wifi;
	double sqft;
	
	Mall(String mallname ){
		this.mallname=mallname;
	}
	
	Mall(String name,String address){
		this.mallname=mallname;
		this.address=address;
	}
	
	Mall(String name,String address,String parkingspace){
		this.mallname=mallname;
		this.address=address;
		this.parkingspace=parkingspace;
	}
	
	Mall(String name,String address,String parkingspace,int noofstores){
		this.mallname=mallname;
		this.address=address;
		this.parkingspace=parkingspace;
		this.noofstores=noofstores;
		
	}
	
	Mall(String name,String address,String parkingspace,int noofstores,String  escalator){
		this.mallname=mallname;
		this.address=address;
		this.parkingspace=parkingspace;
		this.noofstores=noofstores;
		this.escalator=escalator;
	}
	
		Mall(String name,String address,String parkingspace,int noofstores,String  escalator,String  wifi){
		this.mallname=mallname;
		this.address=address;
		this.parkingspace=parkingspace;
		this.noofstores=noofstores;
		this.escalator=escalator;
		this.wifi=wifi;
	}
		
		Mall(String name,String address,String parkingspace,int noofstores,String  escalator,String  wifi,double sqft){
		this.mallname=mallname;
		this.address=address;
		this.parkingspace=parkingspace;
		this.noofstores=noofstores;
		this.escalator=escalator;
		this.wifi=wifi;
		this.sqft=sqft;
	}
	
	
}
