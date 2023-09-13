class Flight{
   public static void main (String[] load)
   {
	   System.out.println("Running Flight .....");
	   
	   String indigo="IndiGo";
	   String spicejet="SpiceJet";
	   String vistara="Vistara";
	   String airindia="Air India";
	   String airasiaindia="Air Asia India";
	   String allianceair="Alliance Air";
	   String saudia="Saudia";
	   
	   String[] plans={airindia,vistara,saudia,airasiaindia,indigo,spicejet,allianceair}; // group items
	   
	   System.out.println("\nloop in forword Direction...");
	   for(int jet=0;jet<plans.length;jet++)
	   {
		   System.out.println("The flight = "+plans[jet]+ " is "+jet);
		   
	   }
	   
	   //update element in least position
	   System.out.println("\nupdate elements....");
	   plans[6]="Qatar Airways";
	   String QatarAirways=plans[6];
	   System.out.println("element of index 6 is "+QatarAirways);
	   
	   System.out.println("\nloop in Reverse Direction...");
	   for(int jet=plans.length -1; jet>=0;jet--)
	   {
		   System.out.println("The flights  = "+plans[jet]+ " is "+jet);
		   
	   }
   }
}