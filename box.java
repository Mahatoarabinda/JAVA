class Box
{
  double width,height,depth;
  void set_Dim(double w,double h, double d)
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
class BoxDemo2
{
  public static void main(String args[])
  {
    Box mybox1=new Box();
    Box mybox2=new Box();
    mybox1.set_Dim(10,20,30);
    mybox2.set_Dim(100,200,500); 
    double vol;
    vol=mybox1.volume();
    System.out.println("volume of mybox1 is:"+vol);
    vol=mybox2.volume();
    System.out.println("volume of mybox2 is:"+vol);
   }
}