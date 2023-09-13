class Wood{
	
	double weight;
	String madeUpOf;
	String invented;
	int aging;
	float pricePerQuintal;
	
	
	Wood()
	{
		System.out.println("invoking with no parameters");
	}
	
	Wood(double weight)
	{
		super();
		System.out.println("invoking double as parameters");
		this.weight=weight;
	}
	
	Wood(double weight,String madeUpOf)
	{
		this(weight);
		System.out.println("invoking String & double as parameters");
		this.madeUpOf=madeUpOf;
	}
	
	Wood(double weight,String madeUpOf,String invented)
	{
		this(weight,madeUpOf);
		System.out.println("invoking double & String parameters");
		this.invented=invented;
	}
	
	Wood(double weight,String madeUpOf,String invented,int aging)
	{
		this(weight,madeUpOf,invented);
		System.out.println("invoking double,String,int parameters");
		this.aging=aging;
	}
	
	Wood(double weight,String madeUpOf,String invented,int aging,float pricePerQuintal)
	{
		this(weight,madeUpOf,invented,aging);
		System.out.println("invoking double,String,int parameters");
		this.pricePerQuintal=pricePerQuintal;
	}
	
}
	