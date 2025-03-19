//Task1 : Take user's name as input having first letter as lowercase and convert into Uppercase
//e.g Enter "deepak" and output should  be "Deepak"

import java.util.Scanner;

public class Task1_String_Aashish
{

    public static void main(String[] args)
    {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name ");

        String str = sc.nextLine();



        String str1 = str.substring(0,1);
        String str2 = str1.toUpperCase();
        String str3 = str.substring(1);

        String strfinal = str2.concat(str3);
        System.out.println("Output Name is " + strfinal);




    }


}
