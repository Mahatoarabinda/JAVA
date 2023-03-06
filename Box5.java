class Box
{
  double width,height,depth;
  Box()
   {
     width=10;
     height=20;
     depth=30;
   }
    double volume()
   {
    return width*height*depth;
   }
}
class Box_demo4
{
  public static void main(String pori[])
   {
    Box mybox1=new Box();
    Box mybox2=new Box();
    double vol;
    vol=mybox1.volume();
    System.out.println("Volume of mybox1 is:"+vol);
    vol=mybox2.volume();
    System.out.println("volume of mybox2 is:"+vol);
   }
}