package pro.amazon.service;

public class FirstFlight implements IDeliviryService{
    public Boolean deliveryProduct(Double amount){
        System.out.println("Product delivered through First Flight and Amount paid is "+amount);
        return true;
    }
}
