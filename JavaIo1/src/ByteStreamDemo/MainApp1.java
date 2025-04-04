package ByteStreamDemo;

import java.io.FileInputStream;

public class MainApp1
{
    public static void main(String[] args)
    {

        try
        {
            FileInputStream fis = new FileInputStream("C:\\Users\\hello\\IdeaProjects\\ATB5x\\src\\basics_02\\Lab003.java");
            int i;

            while ((i = fis.read())!=-1)
            {


                System.out.print((char)i);


            }

        }

        catch (Exception e)

        {
            e.printStackTrace();
        }

    }

}
