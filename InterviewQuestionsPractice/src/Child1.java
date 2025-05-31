abstract class AbstractClass1
{


    private void m1()
    {
        System.out.println("private m1 method of concrete type");
    }
    abstract void m2();

    void m3()
    {
        System.out.println("concrete m3 method ");
        m1();
        m2();
    }




}

public class Child1 extends AbstractClass1
{

    public static void main(String[] args)
    {

        AbstractClass1 abs1 = new Child1();
        abs1.m3();




    }

    @Override
    void m2()
    {
        System.out.println("implemented m2 method ");

    }
}



