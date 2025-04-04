package FileDemo;

import java.io.File;

public class MainApp4
{

    public static void main(String[] args)
    {

        try
        {

           File file1 = new File("F:\\Iris.csv");
            if(file1.isDirectory())
            {
                System.out.println("Yes , It is a directory");
            }

            else
            {
                System.err.println("No , Its not a directory");
            }


            File file2 = new File("F:\\Iris.csv");
            if(file2.isFile())
            {
                System.out.println("Yes , It is a file");
            }

            else
            {
                System.err.println("No , Its not a file");
            }
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
