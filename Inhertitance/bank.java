import java.text.*;
class Account{
    private String AccountNumber;
    protected float balance;
    public Account( String acc, float bal)
    {
        setnumber(acc);
        setbalance(bal);
    }
    public void setnumber(String AccountNumber)
    {
        this.AccountNumber = AccountNumber;
        
    }
    public void setbalance(float balance)
    {
        this.balance = balance;
        
    }
     public String toString()
     {
        //  DecimalFormat df = new DecimalFormat("#.#####");
        //  String FormattedString = df.format(balance);
         return "AccountNumber : "+AccountNumber+"\n"+"balance : "+ balance;
     }
    
}

class SavingAccount extends Account{
    public SavingAccount(String st , float bal)
    {
        super(st,bal);
    }
    public float Deposit(float amt)
    {
        balance+=amt;
        return balance;
    }
    public float Withdrawl(float amt)
    {
        balance-=amt;
        return balance;
    }
    public void Currentamount()
    {
        System.out.println(balance);
    }
    
}

public class bank{
    public static void main(String args[])
    {
        SavingAccount obj = new SavingAccount("6789",1000);
        System.out.println(obj);
        obj.Deposit(100);
        System.out.println(obj);
        obj.Withdrawl(500);
        System.out.println(obj);
        
        
        
    }
}