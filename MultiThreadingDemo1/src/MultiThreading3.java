class MyThread3 implements  Runnable
{

    public void run()
    {

        System.out.println("Thread 0 is executed");
    }
}


public class MultiThreading3

{



    public static void main(String[] args)

    {
        MyThread3 t2 = new MyThread3();
        Thread th = new Thread(t2);
        th.start();

        System.out.println("Main thread executed");


    }
}
