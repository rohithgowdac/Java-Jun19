class Vegetables{
   public static void main (String[] load)
   {
	   System.out.println("Running Grocery items.....");
	   
	   double onion=24d;
	   double tomato=80d;
	   double greenchilli=50d;
	   double beetroot=34d;
	   double potato=30d;
	   double cabbage=17d;
	   double carrot=49d;
	   
	   double[] basket={beetroot,potato,tomato,carrot,cabbage,onion,greenchilli}; // group items
	   
	   //Forword direction
	   System.out.println("\nloop in forword Direction...");
	   for(int veg=0;veg<basket.length;veg++)
	   {
		   System.out.println("The vegitable price is = "+basket[veg]+ " is "+veg);
		   
	   }
	   
	   
	   //update element in least position
	   System.out.println("\nupdate elements....");
	   basket[6]=25d;
	   double curllyleaves=basket[6];
	   System.out.println("element of index 6 is "+curllyleaves);
	   
	   
	    //reverse direction
	   System.out.println("\nloop in Reverse Direction...");
	   for(int veg=basket.length -1; veg>=0;veg--)
	   {
		   System.out.println("The grocery items of  = "+basket[veg]+ " is "+veg);
		   
	   }
   }
}
