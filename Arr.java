class Arr_2D_Demo
{
  public static void main(String args[])
   {
     int k=0;
    {
      int arr[][] =new int[4][];
      arr[0] =new int[1];
      arr[1] =new int[2];
      arr[2] =new int[3];
      arr[3] =new int[4];
      for(int i=0;i<4;i++)
      {
        for(int j=0;j<i+1;j++)
        {
          arr[i][j]=k;
          k++;
        }
      }
    for(int j=0;j<4;j++)
    {
      for(int l=0;l<j+1;l++)
      {
        System.out.print("arr["+j+"]["+l+"]:"+arr[j][l]);
        System.out.println();
      }
     }
    }
 }
}