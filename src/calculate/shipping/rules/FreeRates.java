package calculate.shipping.rules;


import Interface.ShippingRates;
import product.Product;

public class FreeRates implements ShippingRates {
    public double calculateRates(Product product){

        return product.getPrice();
    }



}
