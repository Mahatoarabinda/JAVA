class Arr_2D_Arr
{
  public static void main(String args[])
   {
     int arr[][]=new int[2][3];
     int k=0;
     for(int i=0;i<2;i++)
      {
        for(int j=0;j<3;j++)
         {
           arr[i][j]=k;
           k++;
          }
      }
        for(int j=0;j<2;j++)
         {
           for(int l=0;l<3;l++)
           {
             System.out.println("arr["+j+"]["+l+"]:"+arr[j][l]);
           }
          }
    }
}  