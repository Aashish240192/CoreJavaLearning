import java.util.Scanner;

class AccountDetails
{

   private String accName;
   private int accNumber;
   private float amount;


   public String getAccName()
   {
       return accName;
   }

   public void setAccName(String accName)
   {
       this.accName=accName;
   }

   public int getAccNumber()
   {
       return accNumber;
   }

   public void setAccNumber(int accNumber)
   {
       this.accNumber=accNumber;
   }

   public float getAmount()
   {
       return amount;
   }

   public void setAmount(float amount)
   {
       this.amount=amount;
   }






}

class Deposit
{

    float totalAmount;

    public void depositAmount(AccountDetails acc , float amount)
    {

        totalAmount = acc.getAmount() + amount;
        acc.setAmount(totalAmount);



    }


}

class Withdraw
{

    float totalAmount;


    public void withdrawAmount(AccountDetails acc, float amount)
    {
        float totalAmount = acc.getAmount() - amount;
        acc.setAmount(totalAmount);


    }
}



public class BankingApp
{

    public static void main(String[] args)
    {



        AccountDetails acc1 = new AccountDetails();
        Deposit dp = new Deposit();
        Withdraw wd = new Withdraw();

        int acc_no;
        float amount;



        Scanner scanner = new Scanner(System.in);







        do {
            System.out.println("===Banking Menu==== \n 1. View Account Details \n 2. Deposit Amount \n 3. Withdraw Amount \n 4. Transfer Amount \n 5. Logout \n Enter your choice");



            int choice = scanner.nextInt();


            switch (choice)
            {

                case 1:
                    System.out.println("Enter Account Holder Name : ");
                    String name = scanner.next();
                    acc1.setAccName(name);

                    System.out.println("Enter Account Number : ");
                    acc_no = scanner.nextInt();
                    acc1.setAccNumber(acc_no);

                    System.out.println("Enter Deposited Amount : ");
                    float deposit_amount = scanner.nextFloat();
                    acc1.setAmount(deposit_amount);

                    System.out.println("Your account details are \n  Account Holder Name : " +name+ "\n Account Number : "+acc_no + "   "+ " \n Account balance " +deposit_amount );
                    break;

                case 2:

                    System.out.println("Enter the amount you want to deposit");
                    amount = scanner.nextFloat();
                    System.out.println("Enter the account number where you want to deposit");
                    acc_no = scanner.nextInt();
                    dp.depositAmount(acc1,amount);
                    System.out.println("Amount Deposited Succesfully");
                    System.out.println("Updated account balance is "+  dp.totalAmount);

                    break;


                case 3:

                    System.out.println("Enter the amount you want to withdraw");
                    amount = scanner.nextFloat();
                    System.out.println("Enter the account number from where you want to withdraw");
                    acc_no = scanner.nextInt();
                    if (wd.totalAmount<amount)
                    {
                        System.out.println("Insufficient funds");
                    }
                    else
                    {
                        wd.withdrawAmount(acc1,amount);
                        System.out.println("Amount withdrawn Succesfully");
                        System.out.println("Updated account balance is " + wd.totalAmount);
                    }

                    break;




                case 4:
                    System.out.println("Enter the amount you want to trasfer");
                    amount = scanner.nextFloat();
                    System.out.println("Enter the account number where you want to transfer");
                    acc_no = scanner.nextInt();

                    System.out.println("Amount transferred Succesfully");
                    break;


                case 5:
                    System.out.println("Logged out Successfully");
                    System.exit(0);
                    break;

                default:
                    break;








            }
        }while(true);






    }




}
