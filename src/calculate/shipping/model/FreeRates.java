package calculate.shipping.model;


import entity.RatesShipping;
import entity.Product;

public class FreeRates implements RatesShipping {
    public double calculateRates(Product product){

        return product.getPrice();
    }




}
