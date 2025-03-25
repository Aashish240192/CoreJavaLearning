class MyThread6 extends Thread
{

    public void run()
    {

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread());

    }



}


public class MultiThreading6

{


    public static void main(String[] args)

    {
        MyThread6 t1 = new MyThread6();
        t1.start();



        System.out.println(t1);

        System.out.println(Thread.currentThread().getName());





    }
}
