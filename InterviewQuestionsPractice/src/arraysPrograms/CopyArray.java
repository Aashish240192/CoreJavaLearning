package arraysPrograms;

public class CopyArray
{
    public static void main(String[] args)
    {
        int[] arr = {10, 45, 12, 34, 65, 14, 33, 28};

        System.out.println("Elements of the original array are ");

        for (int no : arr)
        {
            System.out.print(no + " ");
        }

        int[] copy_arr = new int[arr.length];

        for(int i = 0 ; i<arr.length;i++)
        {
            copy_arr[i] = arr[i];
        }
        System.out.println();

        System.out.println("Elements of the copied array are ");

        for (int no : copy_arr)
        {
            System.out.print(no + " ");
        }

    }
}
