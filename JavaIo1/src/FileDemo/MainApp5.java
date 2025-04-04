package FileDemo;

import java.io.File;

public class MainApp5
{

    public static void main(String[] args)
    {

        try
        {

           File file = new File("F:");
           String[] listoffiles = file.list();

           for (String str : listoffiles)
           {
               System.out.println(str);
           }

        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
