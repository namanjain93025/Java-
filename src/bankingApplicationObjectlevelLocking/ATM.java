package bankingApplicationObjectlevelLocking;

public class ATM extends Thread {
    private HSBCbank b;
    public ATM(HSBCbank b){
        this.b =b;
    }
    public void run(){
        System.out.println("Withdrawl ");
        b.withdrawl(4000);
    }
}
