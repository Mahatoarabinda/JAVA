class a{
    int i,j;
    void showij()
{
    System.out.println("i= "+i+"j="+j);
}
}
class b extends a{
    int k;
    void showk()
{
    System.out.println("k="+k);
}}
class inter_mycls{
    public static void main(String xyz[])
{
    a obja=new a();
    b objb=new b();
    obja.i=10;
    obja.j=20;
    objb.i=5;
    objb.j=7;
    objb.k=30;
    objb.showij();
    objb.showk();
}
}