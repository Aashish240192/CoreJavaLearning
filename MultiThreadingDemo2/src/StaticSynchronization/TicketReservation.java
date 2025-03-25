package StaticSynchronization;

class BookMovieTicket
{

    static int total_seats = 10;

     synchronized public static void bookSeat(int seats, String name)
    {


            if(total_seats>=seats)
            {
                System.out.println(name + " has booked " + seats + " seats");
                total_seats = total_seats - seats;

                System.out.println("Total seats : " + total_seats);
            }

            else
            {
                System.out.println("Sorry " + name +", seats not booked..." );
                System.out.println("Total seats : " + total_seats);

            }






    }
}

class MyThread1 extends Thread
{


    int seats;
    String name;

    MyThread1( int seats , String name)
    {


        this.seats = seats;
        this.name = name;


    }

    @Override
    public void run()
    {

        BookMovieTicket.bookSeat(seats, name);

    }
}


class MyThread2 extends Thread
{


    int seats;
    String name;

    MyThread2( int seats , String name)
    {


        this.seats = seats;
        this.name = name;


    }
    @Override
    public void run()
    {

        BookMovieTicket.bookSeat(seats , name);

    }
}

public class TicketReservation
{

    public static void main(String[] args)
    {

        MyThread1 thread1 = new MyThread1(6 , "Aashish");
        thread1.start();


        MyThread2 thread2 = new MyThread2(5 , "Abhishek");
        thread2.start();

    }


}
