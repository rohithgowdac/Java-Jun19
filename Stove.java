class Stove{
static void fire( String brand,long cost, String use)
 {
System.out.println("invoking cook with Stove");

System.out.println("brand:"+brand);
System.out.println("cost:"+cost);
System.out.println("use:"+use);

if (brand!=null)
{
System.out.println("work is vaild");

}
else
{
System.err.println("work is invaild");
return;

}
if(cost>1000 && cost<20000)
{
System.out.println("cost is vaild");

}
else
{
System.err.println("cost is invaild");
return;
}

if (use!=null)
{
System.out.println("use is vaild");

}
else
{
System.err.println("use invaild");
return;
}

 }
}