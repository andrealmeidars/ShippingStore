package PaymentStrategy;


import entity.PayStrategy;
import entity.Product;

public class FreePayStrategy implements PayStrategy {
    public double calculateTax(Product product){

        return product.getPrice();
    }

    public double getValueTax(){
        return 0;
    }


}
