package arraysPrograms;

public class DeleteAnElementFromArray
{
    public static void main(String[] args)
    {

        int[] arr = {10, 45, 12, 34, 55, 65, 14, 33, 28};

        int pos_element = 4;
        int element = 65;

        System.out.println("Elements of the array before deletion are ");
        for (int no : arr)
        {
            System.out.print(no + " ");
        }

        int[] newArr = new int[arr.length-1];

        for (int i =0; i<newArr.length;i++)
        {
            if(i<pos_element)
            {
                newArr[i]=arr[i];
            }

            else
            {
                newArr[i]=arr[i+1];
            }
        }

        System.out.println();

        System.out.println("Elements of the array after deletion are ");
        for (int no : newArr)
        {
            System.out.print(no + " ");
        }



    }

}
