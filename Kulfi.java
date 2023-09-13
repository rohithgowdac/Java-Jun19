class Kulfi{
static void eating( String colour,long cost, String type)
 {
System.out.println("invoking eat with Kulfi");

System.out.println("colour:"+colour);
System.out.println("cost:"+cost);
System.out.println("type:"+type);

if (colour!=null)
{
System.out.println("colour is vaild");

}
else
{
System.err.println("colour is invaild");
return;

}
if(cost>10 && cost<200)
{
System.out.println("cost is vaild");

}
else
{
System.err.println("cost is invaild");
return;
}

if (type!=null)
{
System.out.println("type is vaild");

}
else
{
System.err.println("type invaild");
return;
}

 }
}