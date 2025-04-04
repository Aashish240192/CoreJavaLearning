package FileDemo;

import java.io.File;

public class MainApp6
{

    public static void main(String[] args)
    {

        try
        {

           File file = new File("F:\\xyz\\abc");


           if (file.mkdirs())
           {
               System.out.println("Folder created successfully");
           }

           else
           {
               System.err.println("Folder not created due to some error");

           }


        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
