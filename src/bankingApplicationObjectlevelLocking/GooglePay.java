package bankingApplicationObjectlevelLocking;

public class GooglePay extends Thread{
    private HSBCbank b;
    public GooglePay(HSBCbank b){
        this.b =b;
    }
    @Override
    public void run(){
        System.out.println("deposit ");
        b.deposit(4000);
    }
}
