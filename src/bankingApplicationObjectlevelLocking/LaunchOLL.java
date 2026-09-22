package bankingApplicationObjectlevelLocking;

public class LaunchOLL {

    public static void main(String[] args){
        HSBCbank bank1 = new HSBCbank();
        ATM atm = new ATM(bank1);
        GooglePay googlePay = new GooglePay(bank1);
        PhonePe phonePe =new PhonePe(bank1);

        atm.setName("atm");
        googlePay.setName("googlePay");
        phonePe.setName("phonepe");

        atm.start();
        googlePay.start();
        phonePe.start();

    }
}
