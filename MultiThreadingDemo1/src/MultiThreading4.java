class MyThread4 extends Thread
{

    public void run()
    {

        for (int i = 0; i <100 ; i++)
        {

            System.out.println(" task performed by " + Thread.currentThread().getName());

        }


    }



}


public class MultiThreading4

{


    public static void main(String[] args)

    {
        MyThread4 t1 = new MyThread4();
        t1.start();

        for (int i = 0; i < 100; i++)
        {
            System.out.println(" task performed by " + Thread.currentThread().getName());

        }


    }
}
