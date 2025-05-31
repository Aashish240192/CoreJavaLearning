 abstract class Parent
{

    void m1()
    {

        m2();
        System.out.println("hi");
    }


     abstract void m2();


}


public class AbstractClassDemo1 extends Parent
{
    public static void main(String[] args)
    {

        Parent p = new AbstractClassDemo1();
        p.m1();

    }


    @Override
    void m2()
    {
        System.out.println("Hi i am m2 method of child class");

    }
}