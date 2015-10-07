package calculate.shipping.rules;


import product.Product;

public interface ShippingRates {
    double calculateRates(Product product);

}
