class PlayVideo1 implements  Runnable
{

    public void run()
    {

        for (int i = 0; i <=100 ; i++)
        {

            System.out.println("video is playing");
            
        }
        

    }
}

class PlayAudio1 implements  Runnable
{

    public void run()
    {

        for (int i = 0; i <=100 ; i++)
        {
            System.out.println("audio is playing");

        }


    }
}

class ExecuteProgressBar1 implements  Runnable
{

    public void run()
    {

        for (int i = 0; i <=100 ; i++)
        {
            System.out.println("Progress bar is executing");

        }


    }
}


public class VLCPlayer1

{



    public static void main(String[] args)

    {
        PlayVideo1 vd1 = new PlayVideo1();
        Thread th1 = new Thread(vd1);
        th1.start();

        PlayAudio1 ad1 = new PlayAudio1();
        Thread t2 = new Thread(ad1);
        t2.start();

        ExecuteProgressBar1 pb1 = new ExecuteProgressBar1();
        Thread t3 = new Thread(pb1);
        t3.start();




    }
}
