class MyThread5 extends Thread
{

    public void run()
    {

        System.out.println("1 " + Thread.currentThread().isAlive());

        System.out.println("2 " + Thread.currentThread().isDaemon());

        System.out.println("3 " + Thread.currentThread().getPriority());


    }



}


public class MultiThreading5

{


    public static void main(String[] args)

    {
        MyThread5 t1 = new MyThread5();
        t1.start();


        System.out.println("4 " + Thread.currentThread().isAlive());

        System.out.println("5 " + Thread.currentThread().isDaemon());

        System.out.println("6 " + Thread.currentThread().getPriority());



    }
}
