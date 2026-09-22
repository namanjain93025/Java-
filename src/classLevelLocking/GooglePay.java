package classLevelLocking;

public class GooglePay extends Thread{

    @Override
    public void run(){
        System.out.println("depositing ");
        HSBCbank.deposit(4000);
    }
}
