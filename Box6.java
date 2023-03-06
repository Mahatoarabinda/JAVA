class Box
{
  double width,height,depth;
  Box(double w,double h,double d)
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
class Box_Demo5
{
  public static void main(String abc[])
  {
    Box mybox1=new Box(10,20,30);
    Box mybox2=new Box(5,7,9);
    double vol;
    vol=mybox1.volume();
    System.out.println("Volume mybox1 is:"+vol);
    vol=mybox2.volume();
    System.out.println("Volume mybox2 is:"+vol);
  }
}