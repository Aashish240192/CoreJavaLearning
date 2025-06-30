package arraysPrograms;

public class InsertAnElementInArray
{
    public static void main(String[] args)
    {

        int[] arr = {10, 45, 12, 34, 65, 14, 33, 28};
         int pos_element = 4;
         int element = 55;

        System.out.println("Elements of the array before insertion are ");
        for (int no : arr)
        {
            System.out.print(no + " ");
        }


        int[] newArr = new int[arr.length+1];

        for(int i=0;i<newArr.length;i++)
        {

            if(pos_element>i)
            {
                newArr[i] = arr[i];

            }
            else if (pos_element==i)
            {
                newArr[i]= element;

            }
            else
            {
                newArr[i] = arr[i-1];
            }

        }
        System.out.println();

        System.out.println("Elements of the new array after insertion are ");
        for (int no : newArr)
        {
            System.out.print(no + " ");
        }


    }

}
