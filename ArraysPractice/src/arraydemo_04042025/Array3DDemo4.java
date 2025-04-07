package arraydemo_04042025;

public class Array3DDemo4
{

    public static void main(String[] args)
    {

        int arr[][][] = {{{1,2,3,4},{5,6,7,8},{9,10,11,12}},{{13,14,15,16},{17,18,19,20},{21,22,23,24}}};

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[0][0]);


        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[0][0].length);

        for (int i = 0; i < arr.length; i++)
        {

            for (int j = 0; j < arr[i].length; j++)
            {
                for (int k = 0; k < arr[i][j].length; k++)
                {

                    System.out.print(arr[i][j][k]+" ");

                }
                System.out.println();

            }

        }


    }




}
