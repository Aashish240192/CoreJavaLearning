class Parent
{

    public void run()
    {
        System.out.println("Parents are able to run");
    }


}

class Child extends Parent
{
    public void run()
    {
        System.out.println("Child is able to run");
    }


}




public class Casting
{

    Parent p = new Child();

    Child c = (Child) p;

}
