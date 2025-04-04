package FileDemo;

import java.io.File;

public class MainApp2
{

    public static void main(String[] args)
    {

        try
        {

            File file1= new File("G:\\aaa.txt");
            File file2= new File("G:\\bbb.txt");


            if (file1.renameTo(file2))
            {
                System.out.println("File renamed successfully");

            }
            else
            {
                System.err.println("File not renamed due to some error");
            }
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
