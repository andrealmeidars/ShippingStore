package shipping.calculate;


import calculate.shipping.rules.DhlRates;
import calculate.shipping.rules.FedexRates;
import calculate.shipping.rules.FreeRates;
import calculate.shipping.rules.ShippingRates;
import printer.Printer;
import product.Product;

public class ShippingRatesCalculate {
    private DhlRates dhlRates;
    private FedexRates fedexRates;
    private FreeRates freeRates;
    private Printer printer;


    public ShippingRatesCalculate(){
        this.dhlRates = new DhlRates();
        this.fedexRates = new FedexRates();
        this.freeRates = new FreeRates();
        this.printer = new Printer();
    }


    public void calculateShippingRates(Product product){

        ShippingRatesCalculate shippingRatesCalculate = new ShippingRatesCalculate();

        double dhlRatesValue = this.dhlRates.calculateRates(product);
        double fedexRatesValue = this.fedexRates.calculateRates(product);
        double freeRatesValue = this.freeRates.calculateRates(product);

        printer.print(dhlRates.returnTypeShippping(), dhlRatesValue );
        printer.print(fedexRates.returnTypeShippping(), fedexRatesValue );
        printer.print(freeRates.returnTypeShippping(), freeRatesValue );

    }




}
