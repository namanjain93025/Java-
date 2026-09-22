package classLevelLocking;

public class HSBCbank {
   static int accountBal = 4000;



//    synchronized  public void  HSBCbank(){
//        this.accountBal = accountBal;
//    }
    synchronized public static void  withdrawl(int amount){
        accountBal-=amount;
        System.out.println("Withdrwal Successfully");
    }
    synchronized static public void deposit(int amount){
        accountBal+=amount;
        System.out.println("Deposit Successfully");
    }
    synchronized public static void checkBalance(){
        System.out.println("Current balance is "+accountBal +"  Successfully");
    }
}
