package Task_Java_IO;

import java.io.FileReader;

public class Task02_ReaderStream
{

    public static void main(String[] args)
    {
        try
        {

            FileReader fir = new FileReader("G:\\aaa.txt");
            int i;

            while((i = fir.read())!=-1)
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
