class MyThread2 implements  Runnable
{

    public void run()
    {

        System.out.println("Task is performed");
    }
}


public class MultiThreading2

{



    public static void main(String[] args)

    {
        MyThread2 t2 = new MyThread2();
        Thread th = new Thread(t2);
        th.start();


    }
}
