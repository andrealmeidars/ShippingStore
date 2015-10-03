package calculate.shipping.rules;


import product.Product;

public class FreeRates implements ShippingRates {
    public double calculateRates(Product product){

        return product.getPrice();
    }

    public String returnTypeShippping(){
        return "FreeShipping";

    }




}
