package StringPalindrome_Task04;

import java.util.Scanner;

public class StringPalindrome
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter a String : ");

        String str = sc.next();

        int len = str.length();

        String reverse = "";

        for (int i = len-1; i>=0; i--)
        {
            reverse = reverse + str.charAt(i);

        }


        if (reverse.equals(str))
        {
            System.out.println("Palindrome");

        }

    }

}
