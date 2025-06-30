package arraysPrograms;

public class LinearSearch
{
    public static void main(String[] args)
    {

        int[] arr = {10, 45, 12, 34, 5, 65, 14, 33, 28};

        int element = 65; boolean status = false;

        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
            {
                System.out.println("Element " + element + " found at " + i + " position");
                status = true;
                break;

            }
        }
        if (!status)
        {
            System.out.println("Element not found");
        }


    }
}
