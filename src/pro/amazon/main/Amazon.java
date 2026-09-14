package pro.amazon.main;

import pro.amazon.service.FedEx;
import pro.amazon.service.IDeliviryService;

public class Amazon {
    private IDeliviryService service;
    public Amazon(IDeliviryService service){
        this.service =service;
    }

    public void setService(IDeliviryService service) {
        this.service = service;
    }


    public  Boolean deliverTheProduct(Double amount){

//        FedEx fed = new FedEx();//this is tight coupling
//        Boolean status = fed.deliveryProduct(amount);
//        return  status;
        return  service.deliveryProduct(amount);
    }
}
