 public abstract class SuperClass
{

    abstract void m1();

    void m2()
    {
        System.out.println("Hi i am m2 method");
    }

   public SuperClass()
   {
       System.out.println("Abstract class constructor");

   }


    public static void main(String[] args)
    {
        SuperClass sp = new AbstractClassDemo2();



    }
}


 class AbstractClassDemo2 extends SuperClass
{



    @Override
    void m1()
    {
        System.out.println("Hi i am m1 method of child class");

    }
}