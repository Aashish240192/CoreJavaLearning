package arraydemo_04042025;

public class ArrayDemo5
{

    public void m1(int[] a)
    {

        for (int value : a)
        {
            System.out.print((value)+" ");
        }


    }
    public static void main(String[] args)
    {

        ArrayDemo5 ar5 = new ArrayDemo5();
        ar5.m1(new int[] {10,20,30,40,50});


    }

}
