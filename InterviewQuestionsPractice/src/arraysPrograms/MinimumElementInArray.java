package arraysPrograms;

public class MinimumElementInArray
{
    public static void main(String[] args)
    {

        int[] arr = {10, 45, 12, 34, 65, 14, 33, 28};

        int min = arr[0];

        for(int i=1 ; i<arr.length;i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
            }
        }

        System.out.println("Maximum element in the array is "+ min);


    }

}
