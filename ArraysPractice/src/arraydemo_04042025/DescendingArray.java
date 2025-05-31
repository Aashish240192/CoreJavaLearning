package arraydemo_04042025;

public class DescendingArray
{

    public static void main(String[] args)
    {
        int temp;

        int[] a = {4,6,3,2,1,9,5,8,7};

        int k = 4;



        for (int i = 0; i <a.length-1 ; i++)
        {
            for (int j = i+1 ; j < a.length; j++)
            {
                if(a[i]<a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
            if(i==(k-1))
            {

                System.out.println(k + "th highest element in the array is " + a[i]);
                break;
            }
        }


        System.out.println("Descending order of array is ");
        for (int value : a)
        {
            System.out.print(value +" ");
        }
        System.out.println();









    }

}
