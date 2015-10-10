package calculate.shipping.rules;

import calculate.shipping.rules.FedexRates;
import org.junit.Before;
import product.Product;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class FedexRatesTest {

    FedexRates fedexRates;


    private Product productIsFragileValue;
    private Product productIsOverWeigth;
    private  Product productTaxValue;


    public FedexRatesTest(){
        this.productIsFragileValue = new Product(2.0, true, false);
        this.productIsOverWeigth = new Product(2.0, false, true);
        this.productTaxValue = new Product(2.0, false, false);

    }

    @Before
    public void setUp() throws Exception {
        fedexRates = new FedexRates();

    }



    @Test
    public void returnTaxFedexValue(){
        assertThat(fedexRates.calculateRates(productTaxValue), is(0.2));
    }


    @Test
    public void calculateIfProductIsFragile(){
        assertThat(fedexRates.calculateRates(this.productIsFragileValue), is(100.2));
    }

    @Test
    public void calculateIfProductIsOverWeigth(){
        assertThat(fedexRates.calculateRates(this.productIsOverWeigth), is(200.2));
    }

}
