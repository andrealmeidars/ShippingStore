package calculate.shipping.model;



import entity.RatesShipping;
import entity.Product;

public class FedexRates implements RatesShipping {
    private static final double TAX_FEDEX = 0.1;
    private static final double FRAGILE_VALUE = 100;
    private static final double OVERWEIGTH_VALUE = 200;


    public double calculateRates(Product product){
        double valueToPay = product.getPrice() * TAX_FEDEX;

        if (product.isFragile()) {
            valueToPay = valueToPay + FRAGILE_VALUE;
        }

        if(product.isOverWeight()) {
            valueToPay = valueToPay + OVERWEIGTH_VALUE;
        }
        return valueToPay;
    }



}
