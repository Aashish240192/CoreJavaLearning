package LambdaExpressionDemo1;


interface I4
{
    void run();
}


public class MainApp1
{
    public static void main(String[] args)


    {

        I4 i4 = () ->
            System.out.println("implemented run method");
        i4.run();

    }



}
