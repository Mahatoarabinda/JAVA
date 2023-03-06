class Box
{
   double width,height,depth;
   double volume()
   {
    double v;
    v=width*height*depth;
    return v;
   }
}
class Box_Demo2
{
   public static void main(String xyz[])
  { 
   double vol;
   Box Mybox1= new Box();
   Box Mybox2= new Box();
   Mybox1.width=2;
   Mybox1.height=3;
   Mybox1.depth=4;
   Mybox2.width=20;
   Mybox2.height=30;
   Mybox2.depth=40;
   vol=Mybox1.volume();
   System.out.println("Volume mybox1="+vol);
   vol=Mybox2.volume();
   System.out.println("Volume of mybox2="+vol);
  }
 }
   
                   