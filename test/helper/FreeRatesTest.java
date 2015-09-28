package helper;

import calculate.shipping.model.FreeRates;
import entity.Product;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FreeRatesTest {
    private MyProduct productFreeValue;


    public class MyProduct extends Product{

        public MyProduct(double price, boolean isFragile, boolean isOverWeight) {
            super(price, isFragile, isOverWeight);
        }
    }

    public FreeRatesTest(){
        this.productFreeValue = new MyProduct(2.0, false, false);
    }


    @Test
    public void ifCalculateFreeRateValueIsCorrect(){
        FreeRates freeRates = new FreeRates();
        assertThat(freeRates.calculateRates(this.productFreeValue), is(2.0));
    }
}
