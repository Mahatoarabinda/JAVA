class Box
{
  double width,height,depth;
  Box()
   {  
     width=height=depth=-1;
   }
   Box(double w,double h,double d)
   {
     width=w;
     height=h;
     depth=d;
   }
   Box(double len)
   {  
     width=height=depth=len;
   }
   double volume()
   {
     return width*height*depth;
   }
}

class Constructor_overloadDemo
{
  public static void main(String args[])
   { 
     Box mybox1=new Box(35.5);
     Box mybox2=new Box();
     Box mybox3=new Box(10,20,30);
     double vol;
     vol=mybox1.volume();
     System.out.println("volume of mybox1 is:"+ vol);
     System.out.println("volume of mybox2 is:"+ mybox2.volume());
     System.out.println("volume of mybox3 is:"+ mybox3.volume());
   }
} 