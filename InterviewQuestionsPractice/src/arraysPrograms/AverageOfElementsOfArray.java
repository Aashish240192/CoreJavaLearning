package arraysPrograms;

public class AverageOfElementsOfArray
{
    public static void main(String[] args)
    {

        int[] arr = {10, 45, 12, 34, 65, 14, 33, 28};

        int sum = 0; int len = arr.length;

        for(int i=0;i<arr.length;i++)
        {

            sum = sum + arr[i];

        }

        double average;

        average = (double) sum / len;

        System.out.println("Average of the elements of array is " + average);



    }
}
