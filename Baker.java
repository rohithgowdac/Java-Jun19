class Baker{
	static void cooking(String item, int noOfPeople,String workingFor,int exp,int duration,int assistance)
	{
		System.out.println("invoking in cooking");
		
		System.out.println("baker item :"+item);
		System.out.println("baker noOfPeople :"+noOfPeople);
		System.out.println("baker workingFor :"+workingFor);
		System.out.println("baker exp :"+exp);
		System.out.println("baker duration :"+duration);
		System.out.println("baker assistance :"+assistance);

		
		if(item!=null){
			System.out.println("item is valid");
		}
		else{
			System.out.println("item is invalid");
			return;
		}
		if(noOfPeople>0 && noOfPeople<8){
			System.out.println("noOfPeople are valid");
		}
		else{
			System.out.println("noOfPeople are not valid");
			return;
		}
		if(workingFor!=null){
			System.out.println("workingFor is valid");
		}
		else{
			System.out.println("workingFor is not valid");
			return;
		}
		if(exp>0 && exp<6){
			System.out.println("experience is valid");
		}
		else{
			System.out.println("experience is not valid");
			return;
		}
		if(duration>1 && duration<8){
			System.out.println("duration is valid");
		}
		else{
			System.out.println("duration is not valid");
			return;
		}
		if(assistance>2 && assistance<5){
			System.out.println("assistance is valid");
		}
		else{
			System.out.println("assistance not valid");
		}
	}
}