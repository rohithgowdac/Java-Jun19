class Scanner{
static void scan( String use,int height,int width)
 {
System.out.println("invoking money with Scanner");

System.out.println("use:"+use);
System.out.println("height:"+height);
System.out.println("width:"+width);

if (use!=null)
{
System.out.println("use is vaild");

}
else
{
System.err.println("use is invaild");
return;
}
if(height>0 && height<10)
{
System.out.println("height is vaild");

}
else
{
System.err.println("height is invaild");
return;
}
if (width>0 && width<100)
{
System.out.println("width is vaild");

}
else
{
System.err.println("width invaild");
return;
}
 }
}