package arraydemo_04042025;

public class ArrayDemo1
{

    public static void main(String[] args)
    {
        int[] arr;

        arr = new int[5];

        System.out.println(arr[0]);
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        for (int i : arr)
        {
            System.out.print((i) + " ");
        }

        String[] universe;
        universe = new String[10];

        for (String uni: universe)
        {
            System.out.println(uni);

        }






    }





}
