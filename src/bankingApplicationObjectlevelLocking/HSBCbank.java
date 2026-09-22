package bankingApplicationObjectlevelLocking;

public class HSBCbank {
    int accountBal ;
    synchronized  public void  HSBCbank(int accountBal){
        this.accountBal = accountBal;
    }
    synchronized public void withdrawl(int amount){
        this.accountBal-=amount;
        System.out.println("Withdrwal Successfully");
    }
    synchronized public void deposit(int amount){
        this.accountBal+=amount;
        System.out.println("Deposit Successfully");
    }
   synchronized public void checkBalance(){
        System.out.println("Current balance is "+this.accountBal +"  Successfully");
    }
}
