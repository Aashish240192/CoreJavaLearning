package arraysPrograms;

public class SwapTwoElementsOfArray
{
    public static void main(String[] args)
    {

        int[] arr = {10, 45, 12, 34, 65, 14, 33, 28};
        System.out.println("Elements before swapping");

        for (int no: arr)
        {
            System.out.print(no+ " ");
        }
        int pos1 = 2;
        int pos2 = 6;

        int temp = arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=temp;

        System.out.println();

        System.out.println("Elements after swapping");

        for (int no: arr)
        {
            System.out.print(no+ " ");
        }



    }
}
