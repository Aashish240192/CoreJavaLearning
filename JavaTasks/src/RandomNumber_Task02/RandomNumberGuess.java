package RandomNumber_Task02;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuess
{

    static boolean guessStatus = false;



    public static void main(String[] args)
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generates a number between 1 and 100


        while(! guessStatus)
        {

            try
            {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Guess a random number between 1 and 100");

                int userRandomNumber = scanner.nextInt();


                if (userRandomNumber > randomNumber)
                {
                    System.out.println("Too High");
                }
                else if (userRandomNumber < randomNumber)
                {
                    System.out.println("Too low");

                }
                else
                {
                    System.out.println("Congratulations! you have guessed correctly");
                    guessStatus = true;
                    System.exit(0);


                }

            }
            catch (Exception e)
            {
                System.out.println("Invalid input. Please try again.");

            }

        }















    }





}
