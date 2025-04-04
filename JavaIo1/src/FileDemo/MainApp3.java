package FileDemo;

import java.io.File;

public class MainApp3
{

    public static void main(String[] args)
    {

        try
        {

           File file = new File("F:");
            System.out.println(file.getFreeSpace()/1024/1024/1024);
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
