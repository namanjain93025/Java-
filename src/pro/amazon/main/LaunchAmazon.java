package pro.amazon.main;

import pro.amazon.service.FedEx;

public class LaunchAmazon {



    public static void main (String[] args){
         Amazon order = new Amazon(new FedEx());
         order.deliverTheProduct(2334.2);
    }
}
