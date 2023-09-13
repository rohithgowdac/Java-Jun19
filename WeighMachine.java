class WeighMachine{
static void scale( int weight,int mass,int cost)
 {
System.out.println("invoking scale with WeighMachine");

System.out.println("weight:"+weight);
System.out.println("mass:"+mass);
System.out.println("cost:"+cost);

if (weight>0 && weight<100)
{
System.out.println("weight is vaild");

}
else
{
System.err.println("weight is invaild");
return;
}
if(mass>0 && mass<100)
{
System.out.println("mass is vaild");

}
else
{
System.err.println("mass is invaild");
return;
}
if (cost>0 && cost<1000)
{
System.out.println("cost is vaild");

}
else
{
System.err.println("costis invaild");
return;
}
 }
}