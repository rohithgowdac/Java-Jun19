package com.xworkz.sep1.app.repository;

public class JuiceRepositoryImpl implements JuiceRepository1{
	private String[] juices=new String[TOTAL_JUICE];
	private int position;

	@Override
	public void save(String juice) {
		System.out.println("juice is too sweet");
		if(this.position<TOTAL_JUICE) {
		this.juices[position]=juice;
		System.out.println("Item added"+juice+"at position"+this.position);
		this.position++;
		
		}
		else {
			System.err.println("juice  taste is good");
		}
	}
	  @Override
	public boolean isExist(String juice) {
		  for(int start=0;start<=this.position;start++) {
			  String temp=this.juices[start];
			  if(temp!=null && temp.equals(juice)) {
				  System.err.println("juicename already exist");
				  return true;
				  
			  }
			  
		  }
		  return false;
	}

}
