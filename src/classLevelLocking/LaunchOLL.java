package classLevelLocking;

public class LaunchOLL {

    public static void main(String[] args){
        HSBCbank bank1 = new HSBCbank();
        ATM atm = new ATM();
        GooglePay googlePay = new GooglePay();
        PhonePe phonePe =new PhonePe();

        atm.setName("atm");
        googlePay.setName("googlePay");
        phonePe.setName("phonepe");

        atm.start();
        googlePay.start();
        phonePe.start();

    }
}
