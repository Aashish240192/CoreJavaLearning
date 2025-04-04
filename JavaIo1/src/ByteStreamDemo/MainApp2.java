package ByteStreamDemo;


import java.io.FileOutputStream;

public class MainApp2
{
    public static void main(String[] args)
    {

        String str = "This is my first program output in java";

        try
        {

            FileOutputStream fos = new FileOutputStream("G:\\aaa.txt");
            byte[] b = str.getBytes();
            fos.write(b);

        }

        catch (Exception e)
        {

            e.printStackTrace();

        }







    }

}
