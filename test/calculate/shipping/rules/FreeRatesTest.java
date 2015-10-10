package calculate.shipping.rules;

import product.Product;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FreeRatesTest {

    @Test
    public void ifCalculateFreeRateValueIsCorrect(){
        Product productFreeValue = new Product(2.0, false, false);;
        FreeRates freeRates = new FreeRates();
        assertThat(freeRates.calculateRates(productFreeValue), is(2.0));
    }
}
