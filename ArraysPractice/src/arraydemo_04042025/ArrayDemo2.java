package arraydemo_04042025;

public class ArrayDemo2
{
    public static void main(String[] args)
    {


        String str = "Hi My name is Aashish";
        String[] strnew = str.split(" ");

        int len = strnew.length;


        for (int i= len-1 ; i>=0; i--)
        {
            System.out.print(strnew[i] + " ");

        }

        int[] arr1,arr2;

        arr1= new int[5];
        arr2= new int[4];



    }

}
