package pro.amazon.service;

public class FedEx implements IDeliviryService {
    public Boolean deliveryProduct(Double amount){
        System.out.println("Product delivered through FedEx and Amount paid is "+amount);
        return true;
    }
}
