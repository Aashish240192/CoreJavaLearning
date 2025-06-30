interface Payment
{
    void pay();

}

class UPIPayment implements Payment
{
    public void pay()
    {
        System.out.println("Payment done via UPI");
    }
}

class NetBanking implements Payment
{

    public void pay()
    {
        System.out.println("Payment done via NetBanking");
    }

}

class CheckOut
{
     void processPayment(Payment payment)
    {
        payment.pay();
    }

}

public class LooseCoupling
{
    public static void main(String[] args)
    {
        Payment upi = new UPIPayment();
        Payment netBanking = new NetBanking();

        CheckOut checkOut = new CheckOut();
        checkOut.processPayment(netBanking);

    }




}
