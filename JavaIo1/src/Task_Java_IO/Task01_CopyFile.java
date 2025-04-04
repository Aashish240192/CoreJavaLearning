package Task_Java_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Task01_CopyFile
{

    public static void main(String[] args)
    {
        try
        {
            FileInputStream fis = new FileInputStream("G:\\aaa.txt");
            int i;

            String str = "";
            while ((i = fis.read())!=-1)
            {
              str = str + ((char) i);
            }

            System.out.println("Content of the file is  " +str);

            FileOutputStream fos = new FileOutputStream("C:\\Users\\hello\\Desktop\\aaa.txt");
            byte[] b = str.getBytes();
            fos.write(b);

            System.out.println("File copied successfully");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }



    }

}
