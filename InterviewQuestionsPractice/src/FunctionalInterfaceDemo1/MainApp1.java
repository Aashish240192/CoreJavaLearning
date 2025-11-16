package FunctionalInterfaceDemo1;

@FunctionalInterface
interface Flyable
{
    void fly();
}



class Bird implements Flyable
{
    public void fly()
    {
        System.out.println("Birds can fly");
    }
}

class Vulture implements Flyable
{


    public void fly()
    {

        System.out.println("Vultures can fly");

    }
}

public class MainApp1
{
    public static void main(String[] args)
    {


        Flyable flyBird = new Bird();

        Flyable flyable = new Flyable()
        {
            @Override
            public void fly()
            {
                System.out.println("Any creature who has wings can fly");
            }
        };
        flyable.fly();


    }




}
