package shipping.calculate;



import calculate.shipping.rules.DhlRates;
import calculate.shipping.rules.FedexRates;
import calculate.shipping.rules.RateType;
import product.Product;

public class ShippingRatesCalculate {

    public ShippingRatesCalculate() {
    }


    public double calculateShippingRates(Product product, RateType rateType) {

        if (rateType.equals(rateType.FEDEX)) {
            return new FedexRates().calculateRates(product);
        } else if  (rateType.equals(rateType.DHL)){
            return  new DhlRates().calculateRates(product);
        }else if (rateType.equals(rateType.FREE)){
            return  new FedexRates().calculateRates(product);
        }
        return 0;
    }


}
