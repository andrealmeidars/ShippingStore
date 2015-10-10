package calculate.shipping.rules;

import calculate.shipping.rules.FedexRates;
import product.Product;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class FedexRatesTest {
    private Product productIsFragileValue;
    private Product productIsOverWeigth;


    public FedexRatesTest(){
        this.productIsFragileValue = new Product(2.0, true, false);
        this.productIsOverWeigth = new Product(2.0, false, true);

    }

    @Test
    public void ifCalculateFedexRateValueIsCorrect(){
        FedexRates fedexRates = new FedexRates();
        Product productTaxValue = new Product(2.0, false, false);
        assertThat(fedexRates.calculateRates(productTaxValue), is(0.2));
    }


    @Test
    public void calculatesIfProductIsFragile(){
        FedexRates fedexRates = new FedexRates();
        assertThat(fedexRates.calculateRates(this.productIsFragileValue), is(100.2));
    }

    @Test
    public void ifCalulateFedexOverWeigthValueIsCorrect(){
        FedexRates fedexRates = new FedexRates();
        assertThat(fedexRates.calculateRates(this.productIsOverWeigth), is(200.2));
    }

}
