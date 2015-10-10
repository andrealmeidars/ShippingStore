package shipping.calculate;

import calculate.shipping.rules.RateType;
import org.junit.Before;
import org.junit.Test;
import product.Product;
import shipping.calculate.ShippingRatesCalculate;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class ShippingRatesCalculareTest {
    private Product product;

    @Before
    public void setUp() throws Exception {
        product = new Product(2.0, true, true);

    }

    @Test
    public void ifShippingRatesCalculateReturnCorrectValueWithDhlSipping(){
        ShippingRatesCalculate shippingRatesCalculate = new ShippingRatesCalculate();
        assertThat(shippingRatesCalculate.calculateShippingRates(product, RateType.DHL), is(500.5));
     }

    @Test
    public void ifShippingRatesCalculateReturnCorrectValueWithFedexSipping(){
        ShippingRatesCalculate shippingRatesCalculate = new ShippingRatesCalculate();
        assertThat(shippingRatesCalculate.calculateShippingRates(product, RateType.FEDEX), is(300.2));
    }

    @Test
    public void ifShippingRatesCalculateReturnCorrectValueWithFreeSipping(){
        ShippingRatesCalculate shippingRatesCalculate = new ShippingRatesCalculate();
        assertThat(shippingRatesCalculate.calculateShippingRates(product, RateType.FREE), is(2.0));
    }



}
