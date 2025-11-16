package FunctionalInterfaceDemo1;

@FunctionalInterface
interface Banking
{
    void transaction();

    default void withdrawal()
    {

        System.out.println("this method is for withdrawal");

    }

    static void transfer()
    {
        System.out.println("this method is for transfer");
    }
}

public class MainApp3
{
    public static void main(String[] args)
    {
        Banking banking = () -> System.out.println("This is a direct implementation of transaction method");
        banking.transaction();

    }


}
