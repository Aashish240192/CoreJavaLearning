package arraysPrograms;

public class SumOfArrayElements
{
    public static void main(String[] args)
    {

        int[] arr = {10, 45, 12, 34, 65, 14, 33, 28};

        int sum = 0;

        for(int i=0;i<arr.length;i++)
        {
            sum = sum + arr[i];
        }

        System.out.println("Sum of the array is " + sum);

    }

}
