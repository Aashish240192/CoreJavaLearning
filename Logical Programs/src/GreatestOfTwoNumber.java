import java.util.Scanner;

public class GreatestOfTwoNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int no1 = sc.nextInt();
        System.out.println("Your first number is " + no1);

        System.out.println("Please enter the second number");
        int no2 = sc.nextInt();
        System.out.println("Your second number is " + no2);

        if(no1>no2)
        {
            System.out.println("no1 is greater than no2");
        }

        else
        {
            System.out.println("no2 is greater than no1");
        }




















    }

}
