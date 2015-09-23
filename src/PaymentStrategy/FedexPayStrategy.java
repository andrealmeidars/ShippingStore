package PaymentStrategy;



import entity.PayStrategy;
import entity.Product;

public class FedexPayStrategy implements PayStrategy {
    private static final double TAX_FEDEX = 0.1;
    private static final double FRAGILE_VALUE = 100;
    private static final double OVERWEIGTH_VALUE = 200;


    public double calculateTax(Product product){
        double valueToPay = product.getPrice() * TAX_FEDEX;

        if (product.isFragile()) {
            valueToPay = valueToPay + FRAGILE_VALUE;
        }

        if(product.isOverWeight()) {
            valueToPay = valueToPay + OVERWEIGTH_VALUE;
        }
        return valueToPay;
    }


    public double getValueTax(){
        return TAX_FEDEX;
    }





}
