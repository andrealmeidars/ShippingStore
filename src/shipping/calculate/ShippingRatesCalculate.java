package shipping.calculate;



import calculate.shipping.rules.FedexRates;
import printer.Printer;
import product.Product;

public class ShippingRatesCalculate {
    private Printer printer;


    public ShippingRatesCalculate(){

        this.printer = new Printer();
    }


    public double calculateShippingRates(Product product, RateType rateType) {

        if (rateType.equals(RateType.FEDEX)) {
            return new FedexRates().calculateRates(product);
        }
    




}
