package classLevelLocking;

public class PhonePe extends Thread {

    @Override
    public void run(){
        System.out.println("Checking balancce here --");
        HSBCbank.checkBalance();
    }
}
