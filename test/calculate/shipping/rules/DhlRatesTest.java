package calculate.shipping.rules;


import calculate.shipping.rules.DhlRates;
import calculate.shipping.rules.FedexRates;
import org.junit.Before;
import product.Product;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DhlRatesTest {

    DhlRates dhlRates;


    private Product productTaxValue;
    private Product productIsFragileValue;
    private Product productIsOverWeigth;

    @Before
    public void setUp() throws Exception {
        dhlRates = new DhlRates();

    }

    public DhlRatesTest(){
        this.productTaxValue = new Product(2.0, false, false);
        this.productIsFragileValue = new Product(2.0, true, false);
        this.productIsOverWeigth = new Product(2.0, false, true);
    }


    @Test
    public void ifCalculateDhlRateValueIsCorrect(){
        assertThat(dhlRates.calculateRates(this.productTaxValue), is(0.5));
    }


    @Test
    public void ifCalculateDhlFragileValueIsCorrect(){
        assertThat(dhlRates.calculateRates(this.productIsFragileValue), is(150.5));
    }

    @Test
    public void ifCalulateDhlOverWeigthValueIsCorrect(){
        assertThat(dhlRates.calculateRates(this.productIsOverWeigth), is(350.5));
    }
}
