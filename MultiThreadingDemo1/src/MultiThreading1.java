class MyThread1 extends Thread
{

    public void run()
    {

        System.out.println("Task is performed");
    }



}


public class MultiThreading1

{


    public static void main(String[] args)

    {
        MyThread1 t1 = new MyThread1();
        t1.start();


    }
}
