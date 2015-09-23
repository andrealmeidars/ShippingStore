package PaymentStrategy;


import entity.PayStrategy;
import entity.Product;

public class DhlPayStrategy implements PayStrategy {
    private static final double TAX_DHL = 0.25;
    private static final double FRAGILE_VALUE = 150;
    private static final double OVERWEIGTH_VALUE = 350;



    public double calculateTax(Product product){
        double valueToPay = product.getPrice() * TAX_DHL;

        if (product.isFragile()) {
            valueToPay = valueToPay + FRAGILE_VALUE;
        }

        if(product.isOverWeight()) {
            valueToPay = valueToPay + OVERWEIGTH_VALUE;
        }
        return valueToPay;
    }


    public double getValueTax(){
        return TAX_DHL;
    }
}
