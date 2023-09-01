import java.util.Scanner;

class Atm_Interface
{
    static void deposite(double ammount)
    {
       Bank bank=new Bank(); 
        System.out.println("CURRENT BALANCE IS :"+bank.deposite(ammount));
    }
    static void widhraw(double ammount)
    {
         Bank bank=new Bank(); 
        System.out.println("CURRENT BALANCE IS :"+bank.deposite(ammount));
    }
    static void getbal()
    {
         Bank bank=new Bank(); 
        System.out.print("CURRENT BALANCE IS :"+bank.getbal());
    }
    public static void main(String args[])
    {
        System.out.print("WELCOME TO MY ATM");
        Scanner sc=new Scanner(System.in);
        int n;
        Bank bank=new Bank();
        do
        {
            System.out.println("1.DEPOSIT\n2.WIDHRAW\n3.CHECK BALANCE \n4.EXIT");
            System.out.println("PLEASE ENTER THE OPTION:");
            n=sc.nextInt();
            switch(n)
            {
                case 1:
                        System.out.println("ENTER THE AMMOUNT :  ");
                        deposite(sc.nextDouble());
                        break;
                case 2:
                        System.out.println("ENTER THE AMMOUNT :  ");
                        widhraw(sc.nextDouble());
                        break;
                case 3:
                        getbal();
                        break;
                case 4:
                        System.out.print("THANK YOU");
                        break;
                        
            }
        }while(4!=n);
        
    }
}
class Bank
{
     double balance=2000;
     double deposite(double ammount)
    {
        balance+=ammount;
        System.out.println("SUCCESSFULLY DEPOSIED MONEY");
        return balance;
    }
  double widhraw(double ammount)
  {
    if(ammount<=balance) 
        {
            balance-=ammount;
            System.out.println("SUCCESSFULLY WIDHRAW  MONEY");
            return balance;
            
        }
    else
    {
        System.out.println("SORRY INSUFFICIENT MONEY");
        return balance;
    }
 }
 double getbal()
 {
    return balance;
 }
}