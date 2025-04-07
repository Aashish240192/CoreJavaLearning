package ArrayProgramsDemo;

public class SelectionSortInteger
{

    public void  sortArray(int[] arr)
    {

        System.out.println("Sorted Arrary is ");

        int temp=0,min;

        for (int i = 0; i < arr.length; i++)
        {
            min=i;
            for (int j = i+1; j < arr.length; j++)
            {

                if (arr[j]<arr[min])
                {
                    min=j;
                }

            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }

        for (int value:arr)
        {
            System.out.print(value+" ");
        }


    }

    public static void main(String[] args)
    {

        SelectionSortInteger srt = new SelectionSortInteger();
        srt.sortArray(new int[] {38,52,9,18,6,62,13});


    }
}
