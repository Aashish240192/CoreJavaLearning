package arraysPrograms;

public class CreateAndPrintAnArray
{

    public static void main(String[] args)
    {

        //int[] arr; //declare  an array
        //arr = new int[5];// create an array of length 5

        //create and initialize an array
        int[] arr = {10,20,30,40,50};

        System.out.println("Elements of the array are : ");



        for (int no : arr)
        {
            System.out.print(no + " ");
        }



    }

}
