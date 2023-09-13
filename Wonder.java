class Wonder{
   public static void main (String[] load)
   {
	   System.out.println("Running Wonders of the world .....");
	   
	   String GreatWallofChina="Great Wall of China";
	   String Petra="Petra";
	   String MachuPicchu="Machu Picchu";
	   String GreatPyramidofGiza="Great Pyramid of Giza";
	   String TajMahal="Taj Mahal";
	   String Colosseum="Colosseum";
	   String HangingGardensofBabylon="Hanging Gardens of Babylon";
	   
	   String[] world={HangingGardensofBabylon,TajMahal,Colosseum,Petra,MachuPicchu,GreatPyramidofGiza,GreatWallofChina}; // group items
	   
	   System.out.println("\nloop in forword Direction...");
	   for(int city=0;city<world.length;city++)
	   {
		   System.out.println("The wonders of the world  = "+world[city]+ " is "+city);
		   
	   }
	   
	   //update element in least position
	   System.out.println("\nupdate elements....");
	   world[6]="Colossus of Rhodes";
	   String ColossusofRhodes=world[6];
	   System.out.println("element of index 6 is "+ColossusofRhodes);
	   
	   System.out.println("\nloop in Reverse Direction...");
	   for(int city=world.length -1; city>=0;city--)
	   {
		   System.out.println("The wonders of the world  = "+world[city]+ " is "+city);
		   
	   }
   }
}