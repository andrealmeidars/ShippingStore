package shipping.calculate;

import Interface.ShippingRates;
import calculate.shipping.rules.RateType;
import org.junit.Before;
import org.junit.Test;
import product.Product;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class ShippingRatesCalculareTest {
    private Product product;
    ShippingRatesCalculate shippingRatesCalculate;

    @Before
    public void setUp() throws Exception {
        product = new Product(2.0, true, true);
        this.shippingRatesCalculate= new ShippingRatesCalculate();

    }

    @Test
    public void calculateIfProductIsFragileAndOverHeigthInDhlRate(){
        assertThat(shippingRatesCalculate.calculateShippingRates(product, RateType.DHL), is(500.5));
     }

    @Test
    public void calculateIfProductIsFragileAndOverHeigthInFedexRate(){
        assertThat(shippingRatesCalculate.calculateShippingRates(product, RateType.FEDEX), is(300.2));
    }

    @Test
    public void calculateIfProductIsFragileAndOverHeigthInFreeRate(){
        assertThat(shippingRatesCalculate.calculateShippingRates(product, RateType.FREE), is(2.0));
    }



}
