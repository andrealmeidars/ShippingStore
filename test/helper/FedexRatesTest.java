package helper;

import calculate.shipping.model.FedexRates;
import entity.Product;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class FedexRatesTest {
    private Product productTaxValue;
    private Product productIsFragileValue;
    private Product productIsOverWeigth;


    public class MyProduct extends Product{

        public MyProduct(double price, boolean isFragile, boolean isOverWeight) {
            super(price, isFragile, isOverWeight);
        }
    }


    public FedexRatesTest(){
        this.productTaxValue = new MyProduct(2.0, false, false);
        this.productIsFragileValue = new MyProduct(2.0, true, false);
        this.productIsOverWeigth = new MyProduct(2.0, false, true);

    }


    @Test
    public void ifCalculateFedexRateValueIsCorrect(){
        FedexRates fedexRates = new FedexRates();
        assertThat(fedexRates.calculateRates(this.productTaxValue), is(0.2));
    }


    @Test
    public void ifCalculateFedexFragileValueIsCorrect(){
        FedexRates fedexRates = new FedexRates();
        assertThat(fedexRates.calculateRates(this.productIsFragileValue), is(100.2));
    }

    @Test
    public void ifCalulateFedexOverWeigthValueIsCorrect(){
        FedexRates fedexRates = new FedexRates();
        assertThat(fedexRates.calculateRates(this.productIsOverWeigth), is(200.2));
    }

}
