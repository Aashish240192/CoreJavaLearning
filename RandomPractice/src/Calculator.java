import java.util.Scanner;

public class Calculator
{


    public void addition(int a, int b)
    {

        int result_add = a + b;
        System.out.println("result is " + result_add);
    }

    public void substraction(int a, int b)
    {
        int result_subs = a - b;
        System.out.println("result is " + result_subs);
    }

    public void multiplication(int a, int b)
    {
        int result_mul = a * b;
        System.out.println("result is " + result_mul);
    }

    public void division(int a, int b)
    {
        int result_div = a / b;
        System.out.println("result is " + result_div);

    }


    public static void main(String[] args)
    {


        Scanner scanner = new Scanner(System.in);

        Calculator cal = new Calculator();

        String yn;
        do
        {
            System.out.println("Enter your choice for following operation : \n" +
                    "1. Addition\n" +
                    "2. Substraction\n" +
                    "3. Multiplication\n" +
                    "4. Division\n" +
                    "5. Exit");

            int choice = scanner.nextInt();






            switch (choice)
            {
                case 1:

                    System.out.println("Enter two numbers");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();


                    cal.addition(num1, num2);
                    break;


                case 2:

                    System.out.println("Enter two numbers");
                    int num3 = scanner.nextInt();
                    int num4 = scanner.nextInt();


                    cal.substraction(num3, num4);
                    break;

                case 3:

                    System.out.println("Enter two numbers");
                    int num5 = scanner.nextInt();
                    int num6 = scanner.nextInt();


                    cal.multiplication(num5, num6);
                    break;

                case 4:

                    System.out.println("Enter two numbers");
                    int num7 = scanner.nextInt();
                    int num8 = scanner.nextInt();
                    while (num8<=0)
                    {
                        System.out.println(" Number 2 should be greater than zero");
                        System.out.println("Enter Number 2 again");
                        num2 = scanner.nextInt();


                    }
                    cal.division(num7, num8);
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("No choice matched");
                    break;

            }

            System.out.println("Do you want to continue. Please y for yes else any other option for no");
             yn = scanner.next();
        }
        while (yn.equalsIgnoreCase("y"));


    }

}































































