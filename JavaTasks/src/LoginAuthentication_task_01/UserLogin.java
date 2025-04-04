package LoginAuthentication_task_01;

import java.util.Scanner;

public class UserLogin
{
    private static final String actual_username = "admin";
    private static final String actual_password = "pass123";
    private static final int max_count = 3;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (count < max_count)
        {
            try
            {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();

                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                if (username.equals(actual_username) && password.equals(actual_password))
                {
                    System.out.println("Login successful!");
                    System.exit(0);
                }
                else
                {
                    count++;
                    System.out.println("Incorrect username or password. Try Again! Attempts left: " + (max_count - count));
                }
            }
            catch (Exception e)
            {
                System.out.println("Invalid input. Please try again.");
                scanner.nextLine(); // Clear scanner buffer
            }

            if (count == max_count)
            {
                System.out.println("Too many failed attempts. Exiting program.");
                System.exit(0);
            }
        }

        scanner.close();
    }
}
