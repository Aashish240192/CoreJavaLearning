import java.util.Scanner;

public class GreatestOfThreeNumbers
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int no1 = sc.nextInt();


        System.out.println("Enter the second number");
        int no2 = sc.nextInt();


        System.out.println("Enter the third number");
        int no3 = sc.nextInt();


        System.out.println("Your first number is " + no1);
        System.out.println("Your second number is " + no2);
        System.out.println("Your third number is " + no3);


        if((no1>no2)&&(no1>no3))
        {
            System.out.println(no1 + " is the greatest number");

        }
        else if ((no2>no1)&&(no2>no3))
        {
            System.out.println(no2 + " is the greatest number");
        }

        else
        {
            System.out.println(no3 + " is the greatest number");
        }


    }

}
