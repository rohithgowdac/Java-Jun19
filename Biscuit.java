class Biscuit{
   public static void main (String[] load)
   {
	   System.out.println("Running Biscuit program.....");
	   
	   String parle="Parle Gluco";
	   String cookies="20-20 cookies";
	   String krackjack="Krackjack";
	   String monaco="Monaco";
	   String happy="Happy Happy";
	   String hidesee="Hide & Seek";
	   String goodDay="GoodDay";
	   
	   String[] list={krackjack,monaco,hidesee,parle,happy,goodDay,cookies}; // group items
	   
	   System.out.println("\nloop in forword Direction...");
	   for(int bscut=0;bscut<list.length;bscut++)
	   {
		   System.out.println("The Biscuit name = "+list[bscut]+ " is "+bscut);
		   
	   }
	   
	   System.out.println("\nupdate elements....");
	   list[6]="Cadbury Oreo";
	   String Oreo=list[6];
	   System.out.println("element of index 6 is "+Oreo);
	   
	   System.out.println("\nloop in Reverse Direction...");
	   for(int bscut=list.length -1; bscut>=0;bscut--)
	   {
		   System.out.println("The Biscuit name  = "+list[bscut]+ " is "+bscut);
		   
	   }
   }
}
