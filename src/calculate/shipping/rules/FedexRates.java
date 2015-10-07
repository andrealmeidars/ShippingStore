package calculate.shipping.rules;



import product.Product;

public class FedexRates implements ShippingRates {
    private static final double TAX_FEDEX = 0.1;
    private static final double FRAGILE_VALUE = 100;
    private static final double OVERWEIGTH_VALUE = 200;


    public double calculateRates(Product product){
        double value = product.getPrice() * TAX_FEDEX;

        if (product.isFragile()) {
            value += FRAGILE_VALUE;
        }

        if(product.isOverWeight()) {
            value += OVERWEIGTH_VALUE;
        }
        return value;
    }




}
