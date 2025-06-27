package arraysPrograms;

public class ReverseAnArray
{
    public static void main(String[] args)
    {

        int[] arr = {10, 45, 12, 34, 65, 14, 33, 28};

        System.out.println("Element of original array are ");

        for(int no : arr)
        {
            System.out.print(no + " ");
        }

        int start=0,end=arr.length-1;

        while (start<end)
        {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

        System.out.println();

        System.out.println("Element of reversed array are ");

        for(int no : arr)
        {
            System.out.print(no + " ");
        }




    }
}
