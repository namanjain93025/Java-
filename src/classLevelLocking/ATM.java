package classLevelLocking;

public class ATM extends Thread {

    public void run(){
        System.out.println("Withdrawl ");
        HSBCbank.withdrawl(4000);
    }
}
