package arraydemo_04042025;

public class Array2DDemo3
{

    public static void main(String[] args)
    {

        int[][] arr1 = {{10,20},{30,40},{50,60},{70,80}};
        System.out.println(arr1[3][0]);

        int[][] arr2 = {{10,20,30,40},{50,60,70,80}};
        System.out.println(arr2[1][3]);

        int[][] arr3;
        arr3 = new int[0][0];

        System.out.println(arr1.length);
        System.out.println(arr1[0].length);
        System.out.println(arr1);
        System.out.println(arr1[0]);

        System.out.println(arr3.length);
        System.out.println(arr3[0].length);




        for (int i=0;i< arr2.length;i++)
        {
            for (int j=0;j<arr2[i].length;j++)
            {

                System.out.print(arr2[i][j]+" ");

            }
            System.out.println();

        }


    }



}
