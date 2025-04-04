package Task_Java_IO;


import java.io.FileWriter;

public class Task02_WriterStream
{

    public static void main(String[] args)
    {

        try(FileWriter fwr = new FileWriter("C:\\Users\\hello\\Desktop\\newfile.txt"))
        {


            fwr.write(" I have a new java file which will have this content");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }



    }

}
