public class SumOfElementsOfArray
{

    public static void main(String[] args)
    {

        int[] arr = {1,3,4,7,8,12,15,2};

        int target= 10;


        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println("Pair of elements whose sum is "+ target+ " are " + arr[i] + " and " + arr[j]);
                }
            }
        }

    }

}
