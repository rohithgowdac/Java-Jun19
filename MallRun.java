class MallRun{

 public static void main (String[] loading){
  
   System.out.println("invoking the program woodrun");
   
    Mall a=new Mall("LuLu Mall");
	System.out.println(a.mallname);
	
	Mall b=new Mall("LuLu Mall","Bangalore");
	System.out.println(a.mallname +","+ b.address);
	
	Mall c=new Mall("LuLu Mall","Bangalore","yes");
	System.out.println(a.mallname +","+ b.address +","+c.parkingspace);
	
	Mall d=new Mall("LuLu Mall","Bangalore","yes",100);
	System.out.println(a.mallname +","+ b.address +","+ c.parkingspace +","+ d.noofstores);
	
	Mall e=new Mall("LuLu Mall","Bangalore","yes",100,"yes");
	System.out.println(a.mallname +","+ b.address +","+ c.parkingspace +","+ d.noofstores +","+ e.escalator);
	
	Mall f=new Mall("LuLu Mall","Bangalore","yes",100,"yes","Available");
	System.out.println(a.mallname +","+ b.address +","+ c.parkingspace +","+ d.noofstores +","+ e.escalator +","+ f.wifi);
	
	Mall g=new Mall("LuLu Mall","Bangalore","yes",100,"yes","Available",3000d);
	System.out.println(a.mallname +","+ b.address +","+ c.parkingspace +","+ d.noofstores +","+ e.escalator +","+ f.wifi +","+ g.sqft);	
 }
}