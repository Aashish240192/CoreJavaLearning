package FunctionalInterfaceDemo1;

@FunctionalInterface
interface Flyable2
{
    void fly();
}



public class MainApp2
{
    public static void main(String[] args)
    {

        Flyable2 flyable = () ->

                System.out.println("Any creature who has wings can fly");


        flyable.fly();


    }




}
