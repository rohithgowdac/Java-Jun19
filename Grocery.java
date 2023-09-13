class Grocery{
   public static void main (String[] load)
   {
	   System.out.println("Running Grocery items.....");
	   
	   String oil="oil";
	   String salt="salt";
	   String sugar="Sugar";
	   String flour="Flour";
	   String blackpepper="Black pepper";
	   String milk="Milk";
	   String honey="honey";
	   
	   String[] items={salt,flour,oil,sugar,milk,honey,blackpepper}; // group items
	   
	  
	   //Forword direction
	   System.out.println("\nloop in forword Direction...");
	   for(int things=0;things<items.length;things++)
	   {
		   System.out.println("The grocery items of  = "+items[things]+ " is "+things);
		   
	   }
	   
	   
	   //update element in least position
	   System.out.println("\nupdate elements....");
	   items[6]="tea powder";
	   String teapowder=items[6];
	   System.out.println("element of index 6 is "+teapowder);
	   
	   
	    //reverse direction
	   System.out.println("\nloop in Reverse Direction...");
	   for(int things=items.length -1; things>=0;things--)
	   {
		   System.out.println("The grocery items of  = "+items[things]+ " is "+things);
		   
	   }
   }
}
