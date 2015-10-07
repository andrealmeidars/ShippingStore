package helper;

import calculate.shipping.rules.RateType;
import org.junit.Test;
import product.Product;
import shipping.calculate.ShippingRatesCalculate;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class ShippingRatesCalculareTest {
    private MyProduct myProduct;




    public ShippingRatesCalculareTest() {
        this.myProduct = new MyProduct(2.0, true, true);
    }

    public class MyProduct extends Product {

        public MyProduct(double price, boolean isFragile, boolean isOverWeight) {
            super(price, isFragile, isOverWeight);
        }

     }

  @Test
    public void ifShippingRatesCalculateReturnCorrectValueWithDhlSipping(){
        ShippingRatesCalculate shippingRatesCalculate = new ShippingRatesCalculate();
        assertThat(shippingRatesCalculate.calculateShippingRates(new Product(2.0, true, true), RateType.DHL), is(500.5));
     }

    @Test
    public void ifShippingRatesCalculateReturnCorrectValueWithFedexSipping(){
        ShippingRatesCalculate shippingRatesCalculate = new ShippingRatesCalculate();
        assertThat(shippingRatesCalculate.calculateShippingRates(new Product(2.0, true, true), RateType.FEDEX), is(300.2));
    }





}
