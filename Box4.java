class Box
{
  double width,height,depth;
  void set_dim(double w,double h,double d)
   {
     width=w;
     height=h;
     depth=d;
   }
     double volume()
   {
     return width*height*depth;
   }
}
class Box_Demo3
{
  public static void main(String abc[])
   {
     Box mybox1=new Box();
     Box mybox2=new Box();
     mybox1.set_dim(10,20,30);
     mybox2.set_dim(100,200,300);
     double vol;
     vol=mybox1.volume();
     System.out.println("Volume of mybox1 is:"+vol);
     vol=mybox2.volume();
     System.out.println("Volume of mybox2 is:"+vol);
   }
}