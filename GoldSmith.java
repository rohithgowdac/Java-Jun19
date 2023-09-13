class GoldSmith{
static void gold( String work,long cost, String name)
 {
System.out.println("invoking money with Scanner");

System.out.println("work:"+work);
System.out.println("cost:"+cost);
System.out.println("name:"+name);

if (work!=null)
{
System.out.println("work is vaild");

}
else
{
System.err.println("work is invaild");
return;

}
if(cost>1000 && cost<1000000)
{
System.out.println("cost is vaild");

}
else
{
System.err.println("cost is invaild");
return;
}

if (name!=null)
{
System.out.println("name is vaild");

}
else
{
System.err.println("name invaild");
return;
}

 }
}