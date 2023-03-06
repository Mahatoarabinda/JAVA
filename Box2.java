class Box
{
   double width,height,depth;
   void volume()
   {
     System.out.print("volume is:");
     System.out.println(width*height*depth);
   }
}
class Box_Demo1
{
   public static void main(String xyz[])
  {
   Box mybox1= new Box();
   Box mybox2= new Box();
   mybox1.width=2;
   mybox1.height=3;
   mybox1.depth=4;
   mybox2.width=20;
   mybox2.height=30;
   mybox2.depth=40;
   mybox1.volume();
   mybox2.volume();
  }
 }
   
                   