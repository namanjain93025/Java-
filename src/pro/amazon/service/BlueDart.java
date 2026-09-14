package pro.amazon.service;

public class BlueDart implements IDeliviryService{
    public Boolean deliveryProduct(Double amount){
        System.out.println("Product delivered through Blue Dart and Amount paid is "+amount);
        return true;
    }
}
