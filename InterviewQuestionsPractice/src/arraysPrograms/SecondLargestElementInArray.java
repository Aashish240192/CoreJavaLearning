package arraysPrograms;

public class SecondLargestElementInArray
{
    public static void main(String[] args)
    {

        int[] arr = {10, 45, 12, 34, 65, 14, 33, 28};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int no : arr)
        {
            if(no>first)
            {
                second = first;
                first = no;
            }
            else if (no >second && no!= first)
            {
                second=no;

            }
        }

        if(second ==Integer.MIN_VALUE)
        {
            System.out.println("No second largest element");
        }
        else
        {
            System.out.println("Second Largest element : " + second);
        }

    }
}
