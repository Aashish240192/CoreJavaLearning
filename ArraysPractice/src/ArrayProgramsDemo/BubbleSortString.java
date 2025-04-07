package ArrayProgramsDemo;

public class BubbleSortString
{
    public void sortArray(String[] arr)
    {

        System.out.println("Sorted Array is ");
        String temp;
        for (int round = 0; round < arr.length; round++)
        {

            int flag=0;

            for (int i = 0; i < arr.length-1-round; i++)
            {

                if((arr[i].compareTo(arr[i+1]))>0)
                {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=temp;
                    flag=1;

                }

            }

            if(flag==0)
            {
                break;
            }




        }

        for (String value :arr)
        {

            System.out.print( value + " ");

        }



    }



    public static void main(String[] args)
    {

        BubbleSortString bs = new BubbleSortString();
        bs.sortArray(new String[] {"Amit","Aashish","Naresh","Ramesh","Sanjay","Deepak"});


    }

}
