public class AllZeroAtRightSide
{
    public static void main(String[] args)
    {

      int[] arr = {1,0,1,0,1,0,1,0};


      int count = 0;

      for(int a : arr)
      {
          if(a==1)
          {
              count++;
          }
      }

      for(int i=0;i<count;i++)
      {
          arr[i]=1;
      }

      for(int i=count;i<arr.length;i++)
      {
          arr[i]=0;
      }

      for(int a : arr)
      {
          System.out.print(a + " ");
      }

        

        
        
        
    }

}
