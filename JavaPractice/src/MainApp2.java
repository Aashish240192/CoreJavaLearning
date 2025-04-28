import java.util.Scanner;

public class MainApp1
{
    public static void main(String[] args)
    {

        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter two numbers ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Your input is "+ a + " and " + b);
        System.out.println("your output is "+ a * b);


    }

}
