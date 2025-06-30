package arraysPrograms;

public class SecondSmallestElementInArray
{
    public static void main(String[] args)
    {

        int[] arr = {10, 45, 12, 34, 65, 14, 33, 28};

//        int[] arr = {5,5,5,5,5,5};

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int no : arr)
        {
            if(no<first)
            {
                second = first;
                first = no;
            }
            else if (no <second && no!= first)
            {
                second=no;

            }
        }

        if(second ==Integer.MAX_VALUE)
        {
            System.out.println("No second smallest element");
        }
        else
        {
            System.out.println("Second smallest element : " + second);
        }

    }
}
