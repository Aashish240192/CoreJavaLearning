class MyThread1 extends Thread
{

    public void run()
    {

        for (int i = 0; i <100 ; i++)
        {

            System.out.println("my thread task performed");

        }


    }



}


public class MultiThreading1

{


    public static void main(String[] args)

    {
        MyThread1 t1 = new MyThread1();
        t1.start();

        for (int i = 0; i < 100; i++)
        {
            System.out.println("Main thread task performed");

        }


    }
}
