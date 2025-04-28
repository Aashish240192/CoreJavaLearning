package ArrayProgramsDemo;

public class SearchMax
{
    public static void main(String[] args)
    {

        int[] arr = {4,3,5,2,1,6};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (max < arr[i])
            {
              max=arr[i];
            }


        }

        System.out.println("Largest element in the array is " + max);

    }
}
