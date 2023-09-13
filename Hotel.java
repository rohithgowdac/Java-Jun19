class Hotel{
	String  chair;
	int cost;
	Hotel(String name)
	{
		this.chair=name;
	System.out.println(this.chair);
	}
	
	Hotel(String name,int cost)
	{
		this(name);
		this.cost=cost;
		System.out.println(this.cost);
	}
}
	