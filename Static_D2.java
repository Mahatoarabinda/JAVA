class Static_D1
{
static int a=5;
static int b;
static void Test()
{
b=a*10;
System.out.println("b= "+b);
}
}
class Static_D2
{
public static void main(String abc[])
{
System.out.println("a= "+Static_D1.a);
Static_D1.Test();
}
}