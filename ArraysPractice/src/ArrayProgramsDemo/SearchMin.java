package ArrayProgramsDemo;

public class SearchMin
{
    public static void main(String[] args)
    {

        int[] arr = {4,3,5,2,1,6};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (min > arr[i])
            {
               min = arr[i];
            }


        }

        System.out.println("Smallest element in the array is " + min);

    }
}
