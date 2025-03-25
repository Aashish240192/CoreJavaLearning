package SynchronizationCooperation;

class TicketEarnings extends Thread
{

    int total_earnings = 0;
    int one_ticket_price;
    int total_booking;

    TicketEarnings(int one_ticket_price , int total_booking)
    {

        this.one_ticket_price = one_ticket_price;
        this.total_booking = total_booking;


    }


    @Override
    public void run()
    {

        for (int i = 0; i < total_booking; i++)
        {

            total_earnings = total_earnings + one_ticket_price;

        }


    }

}


public class MovieEarnings
{



    public static void main(String[] args) throws Exception
    {

        TicketEarnings te = new TicketEarnings(160 , 856000);
        te.start();

        synchronized (te)
        {
            te.wait();
        }

        System.out.println("Movie has earned a total of Rs : " + te.total_earnings);


    }
}
