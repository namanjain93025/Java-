package bankingApplicationObjectlevelLocking;

public class PhonePe extends Thread {
    private HSBCbank b;
    public PhonePe(HSBCbank b){
        this.b =b;
    }
    @Override
    public void run(){
        System.out.println("Checking balancce ");
        b.checkBalance();
    }
}
