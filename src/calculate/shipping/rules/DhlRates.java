package calculate.shipping.rules;


import Interface.ShippingRates;
import product.Product;

public class DhlRates implements ShippingRates {
    private static final double TAX_DHL = 0.25;
    private static final double FRAGILE_VALUE = 150;
    private static final double OVERWEIGTH_VALUE = 350;



    public double calculateRates(Product product){

        double value = product.getPrice() * TAX_DHL;

        if (product.isFragile()) {
            value += FRAGILE_VALUE;
        }

        if(product.isOverWeight()) {
            value += OVERWEIGTH_VALUE;
        }
        return value;
    }





}
