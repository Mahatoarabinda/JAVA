class Static_D
{
static int a=3;
static int b;
static void meth(int x)
{
System.out.println("x= "+x);
System.out.println("a= "+a);
System.out.println("b= "+b);
}

static
{
System.out.println("static block initiative");
b=a*3;
}
public static void main(String xyz[])
{
meth(50);
}
}
