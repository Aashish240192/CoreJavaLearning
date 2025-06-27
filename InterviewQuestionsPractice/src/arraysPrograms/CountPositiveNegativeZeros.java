package arraysPrograms;

public class CountPositiveNegativeZeros
{
    public static void main(String[] args)
    {

        int[] arr = {10, -45, 0, 12, -34, 65, 0, 14, -33, 28};

        int count_pos = 0 , count_neg = 0 , count_zero = 0;

        for (int i = 0; i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                count_pos++;
            }
            else if (arr[i]<0)
            {
                count_neg++;

            }
            else
            {
                count_zero++;
            }
        }

        System.out.println("No. of positive elements in array are "+ count_pos);
        System.out.println("No. of negative elements in array are "+ count_neg);
        System.out.println("No. of zeros in array are "+ count_zero);

    }
}
