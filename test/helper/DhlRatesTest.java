package helper;


import calculate.shipping.model.DhlRates;
import entity.Product;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DhlRatesTest {
    private MyProduct productTaxValue;
    private MyProduct productIsFragileValue;
    private MyProduct productIsOverWeigth;



    public class MyProduct extends Product{

        public MyProduct(double price, boolean isFragile, boolean isOverWeight) {
            super(price, isFragile, isOverWeight);
        }
    }


    public DhlRatesTest(){
        this.productTaxValue = new MyProduct(2.0, false, false);
        this.productIsFragileValue = new MyProduct(2.0, true, false);
        this.productIsOverWeigth = new MyProduct(2.0, false, true);
    }


    @Test
    public void ifCalculateDhlRateValueIsCorrect(){
        DhlRates dhlRates = new DhlRates();
        assertThat(dhlRates.calculateRates(this.productTaxValue), is(0.5));
    }


    @Test
    public void ifCalculateDhlFragileValueIsCorrect(){
        DhlRates dhlRates = new DhlRates();
        assertThat(dhlRates.calculateRates(this.productIsFragileValue), is(150.5));
    }

    @Test
    public void ifCalulateDhlOverWeigthValueIsCorrect(){
        DhlRates dhlRates = new DhlRates();
        assertThat(dhlRates.calculateRates(this.productIsOverWeigth), is(350.5));
    }
}
