package entity;


public interface PayStrategy {

    double calculateTax(Product product);
    double getValueTax();
}
