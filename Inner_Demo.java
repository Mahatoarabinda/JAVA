class Outer
{
  int outer_x=10;
  void Test()
  {
     Inner inobj=new Inner();
     inobj.display();
  }
  class Inner
  {
     void display()
      {
        System.out.println("outer_x= "+outer_x);
      }
  }
}
class Inner_Demo
{
  public static void main(String args[])
   {
     Outer outobj=new Outer();
     outobj.Test();
   }
}