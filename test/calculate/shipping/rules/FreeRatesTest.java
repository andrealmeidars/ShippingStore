package calculate.shipping.rules;

import org.junit.Before;
import product.Product;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FreeRatesTest {
    FreeRates freeRates;
    private Product freeRatesProduct;

    @Before
    public void setUp() throws Exception {
        freeRates = new FreeRates();

    }

    public FreeRatesTest() {
        this.freeRatesProduct = new Product(2.0, false, false);
    }

    @Test
    public void returnValueFreeProduct(){

        assertThat(freeRates.calculateRates(freeRatesProduct), is(2.0));
    }
}
