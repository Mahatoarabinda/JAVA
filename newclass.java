class Super_cl
{
int i,j;
}
class sub_class extends Super_cl
{
int i;
void subclass(int a,int b)
{
super.i=a;
i=b;
}
} 
class newclass
{
public static void main(String args[])
{
subclass obj=new subclass(10,20);
System.out.println("value of super i is:"+super.i);
System.out.println("value of sub i is:"+sub.i);
}
}