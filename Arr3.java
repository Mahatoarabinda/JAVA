class Arr_Demo
{
  public static void main(String args[])
   {
     int arr[]=new int[12];
     int k=0;
     for(int i=0;i<12;i++)
       {
         arr[i]=k;
         k++;
       }
         for(int j=0;j<12;j++)
          {
            System.out.println("arr["+j+"]:"+arr[j]);
          }
    }
}