package FileDemo;

import java.io.File;
import java.io.IOException;

public class MainApp1
{

    public static void main(String[] args)
    {

        try
        {

            File file = new File("G:\\aaa.txt");
            if (file.createNewFile())
            {
                System.out.println("File created successfully");

            }
            else
            {
                System.err.println("File not created due to some error");
            }
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
