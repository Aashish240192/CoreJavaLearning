package ArrayProgramsDemo;

public class SelectionSortString
{

    public void  sortArray(String[] arr)
    {

        System.out.println("Sorted Arrary is ");

        String temp;
        int min;

        for (int i = 0; i < arr.length; i++)
        {
            min=i;
            for (int j = i+1; j < arr.length; j++)
            {

                if (arr[j].compareTo(arr[min])<0)
                {
                    min=j;
                }

            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }

        for (String value:arr)
        {
            System.out.print(value+" ");
        }


    }

    public static void main(String[] args)
    {

        SelectionSortString srt = new SelectionSortString();
        srt.sortArray(new String[] {"Amit","Aashish","Naresh","Ramesh","Sanjay","Deepak"});


    }
}
