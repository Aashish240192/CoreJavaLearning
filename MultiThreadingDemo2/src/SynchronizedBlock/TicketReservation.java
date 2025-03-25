package SynchronizedBlock;

class BookMovieTicket
{

    int total_seats = 10;

     public void bookSeat(int seats, String name)
    {
        synchronized (this)
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
}

class MyThread1 extends Thread
{

    BookMovieTicket bmt;
    int seats;
    String name;

    MyThread1(BookMovieTicket bmt , int seats , String name)
    {

        this.bmt = bmt;
        this.seats = seats;
        this.name = name;


    }

    @Override
    public void run()
    {

        bmt.bookSeat(seats, name);

    }
}


class MyThread2 extends Thread
{

    BookMovieTicket bmt;
    int seats;
    String name;

    MyThread2(BookMovieTicket bmt , int seats , String name)
    {

        this.bmt = bmt;
        this.seats = seats;
        this.name = name;


    }
    @Override
    public void run()
    {

        bmt.bookSeat(seats , name);

    }
}

public class TicketReservation
{

    public static void main(String[] args)
    {
        BookMovieTicket bmt = new BookMovieTicket();

        MyThread1 thread1 = new MyThread1(bmt,6 , "Aashish");
        thread1.start();

        MyThread2 thread2 = new MyThread2(bmt,5 , "Abhishek");
        thread2.start();


    }


}
