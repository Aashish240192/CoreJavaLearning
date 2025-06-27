package arraysPrograms;

public class CountEvenAndOdd
{

    public static void main(String[] args)
    {

        int[] arr = {10, 45, 12, 34, 65, 14, 33, 28};

        int count_odd = 0 , count_even = 0;

        for(int i = 0 ; i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                count_even++;
            }

            else
            {
                count_odd++;
            }
        }

        System.out.println("No. of even elements in array are " +count_even);
        System.out.println("No. of odd elements in array are " +count_odd);

    }
}
