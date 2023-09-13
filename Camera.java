class Camera{
static void click(String location, String date, int howmanypeople, String resolution,String clarity,String cameraMan)
 {
System.out.println("invoking photo with camera");
System.out.println("\n");

System.out.println("Camera location:"+location);
System.out.println("Camera date:"+date);
System.out.println("howmanypeople:"+howmanypeople);
System.out.println("resolution:"+resolution);
System.out.println("clarity:"+clarity);
System.out.println("cameraMan:"+cameraMan);

if (location!=null)
{
System.out.println("location name is vaild");

}
else
{
System.err.println("location name is invaild");
return;
}
if(date!=null)
{
System.out.println("location date is vaild");

}
else
{
System.err.println("location date is invaild");
return;
}
if (howmanypeople>0 && howmanypeople<=10)
{
System.out.println(" howmanypeople is vaild");

}
else
{
System.err.println(" howmanypeople is invaild");
return;
}
if ( resolution!=null)
{
System.out.println("resolution is vaild");

}
else
{
System.err.println("resolution is invaild");
return;
}

if (clarity!=null)
{
System.out.println(" clarity is vaild");

}
else
{
System.err.println(" clarity is invaild");
return;
}


if (cameraMan!=null)
{
System.out.println(" cameraMan is vaild");

}
else
{
System.err.println(" cameraMan is invaild");
return;
}

}


}