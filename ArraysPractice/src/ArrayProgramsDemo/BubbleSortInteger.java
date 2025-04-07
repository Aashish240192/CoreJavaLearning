package ArrayProgramsDemo;

public class BubbleSortInteger
{
    public void sortArray(int[] arr)
    {

        System.out.println("Sorted Array is ");
        int temp;
        for (int round = 0; round < arr.length; round++)
        {

            int flag=0;

            for (int i = 0; i < arr.length-1-round; i++)
            {

                if(arr[i]>arr[i+1])
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

        for (int value :arr)
        {

            System.out.print( value + " ");

        }



    }



    public static void main(String[] args)
    {

        BubbleSortInteger bs = new BubbleSortInteger();
        bs.sortArray(new int[] {40,25,65,90,15,10});




    }

}
