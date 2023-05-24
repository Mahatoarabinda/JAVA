class a
{
    public void d()
    {
        System.out.println("i am inside class a");
    }
}
class b extends a
{
    public void e()
    {
        System.out.println("i am inside class b");
    }

}
class evc
{
    public static void main(String args[])
    {
        b B=new b();
        a A =new a();
        A.d();
        B.d();
        B.e();
    }
}