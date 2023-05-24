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
        super.e();
        System.out.println("i am inside class b");
    }

}
class evc1
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