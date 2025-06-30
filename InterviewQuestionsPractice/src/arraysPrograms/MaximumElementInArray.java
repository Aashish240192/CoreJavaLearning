package arraysPrograms;

public class MaximumElementInArray
{
    public static void main(String[] args)
    {

        int[] arr = {10, 45, 12, 34, 65, 14, 33, 28};

        int max = arr[0];

        for(int i=1 ; i<arr.length;i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }

        System.out.println("Maximum element in the array is "+ max);


    }

}
